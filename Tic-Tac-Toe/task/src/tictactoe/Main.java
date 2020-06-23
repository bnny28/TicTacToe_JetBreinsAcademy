package tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final String[] gameField = {
        "---------",
        "| 0 1 2 |",
        "| 3 4 5 |",
        "| 6 7 8 |",
        "---------"
    };
    private static final char X = 'X';
    private static final char O = 'O';
    private static final char U = '_';
    private static final char B = ' ';

    private enum State {GAME_NOT_FINISHED, DRAW, X_WINS, O_WINS, IMPOSSIBLE}

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char currentSymbol = X;
        char[][] gameBoard = initGameBoard(scanner, true);

        printLetterMatrix(setGameField(gameBoard));

        while (getGameState(gameBoard) == State.GAME_NOT_FINISHED) {
            goGameStep(currentSymbol, gameBoard, scanner);
            printLetterMatrix(setGameField(gameBoard));
            currentSymbol = currentSymbol == X ? O : X;
        }

        switch (getGameState(gameBoard)) {
            case IMPOSSIBLE: {
                System.out.println("Impossible");
                break;
            }
            case O_WINS: {
                System.out.println("O wins");
                break;
            }
            case X_WINS: {
                System.out.println("X wins");
                break;
            }
            default: {
                System.out.println("Draw");
            }
        }
    }

    private static void goGameStep(char currentSymbol, char[][] gameBoard, Scanner scanner) {
        Integer[] inputCoordinates = new Integer[]{0, 0};
        String inputLine;
        do {
            System.out.print("Enter the coordinates: ");
            inputLine = scanner.nextLine();
        } while (!isLegalInput(inputLine, gameBoard, inputCoordinates));

        int i = inputCoordinates[1] == 1 ? 2 : inputCoordinates[1] == 2 ? 1 : 0;
        int j = inputCoordinates[0] - 1;
        gameBoard[i][j] = currentSymbol;
    }

    private static boolean isNumber(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    private static char[][] initGameBoard(Scanner scanner, boolean isEmpty) {
        char[][] gameBoard = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoard[i][j] = B;
            }
        }
        if (!isEmpty) {
            System.out.print("Enter cells: ");
            char[] inp = scanner.nextLine().toCharArray();
            if (inp.length < 9) {
                System.out.println("Error input!");
                return gameBoard;
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int idx = i * 3 + j;
                    if (!(X == inp[idx] || O == inp[idx] || U == inp[idx] || B == inp[idx])) {
                        System.out.println("Error input!");
                        return gameBoard;
                    } else {
                        gameBoard[i][j] = inp[idx];
                    }
                }
            }
        }
        return gameBoard;
    }

    private static void printLetterMatrix(String[] gameField) {
        for (String s : gameField) {
            System.out.println(s);
        }
    }

    private static boolean isLegalInput(String inputLine, char[][] gameBoard, Integer[] inputCoordinates) {
        if (inputLine.split("\\s").length > 1 &&
                isNumber(inputLine.split("\\s")[0]) &&
                isNumber(inputLine.split("\\s")[1])) {
            inputCoordinates[0] = (int) Long.parseLong(inputLine.split("\\s")[0]);
            inputCoordinates[1] = (int) Long.parseLong(inputLine.split("\\s")[1]);
            boolean errorDiapason = 1 > inputCoordinates[0] || inputCoordinates[0] > 3
                                        || 1 > inputCoordinates[1] || inputCoordinates[1] > 3;
            if (errorDiapason) {
                System.out.println("Coordinates should be from 1 to 3!");
                return false;
            } else {
                int realY = inputCoordinates[0] - 1;
                int realX = inputCoordinates[1] == 1 ? 2 : inputCoordinates[1] == 2 ? 1 : 0;
                boolean result = gameBoard[realX][realY] == B || gameBoard[realX][realY] == U;
                if (!result) {
                    System.out.println("This cell is occupied! Choose another one!");
                }
                return result;
            }
        } else {
            System.out.print("You should enter numbers!");
            return false;
        }
    }

    private static State getGameState(char[][] input) {
        boolean isImpossibleProportion = isImpossibleProportion(input);
        boolean isHasEmptyCells = isHasEmptyCells(input);
        boolean isWinsX = isWins(input, X);
        boolean isWinsO = isWins(input, O);
        if ((isWinsX && isWinsO) || isImpossibleProportion) {
            return State.IMPOSSIBLE;
        } else if (isWinsO) {
            return State.O_WINS;
        } else if (isWinsX) {
            return State.X_WINS;
        } else if (isHasEmptyCells) {
            return State.GAME_NOT_FINISHED;
        } else {
            return State.DRAW;
        }
    }

    private static boolean isHasEmptyCells(char[][] input) {
        for (char[] chars : input) {
            for (char aChar : chars) {
                if (aChar == U || aChar == B) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isImpossibleProportion(char[][] input) {
        return Math.abs(getCountChar(input, X) - getCountChar(input, O)) > 1;
    }

    private static int getCountChar(char[][] input, char c) {
        int result = 0;
        for (char[] chars : input) {
            for (char aChar : chars) {
                if (aChar == c) {
                    result += 1;
                }
            }
        }
        return result;
    }

    private static boolean isWins(char[][] input, char c) {
        return checkRow(input, c)
                   || checkDiagonal(input, c)
                   || checkRow(turnToLeft(input), c)
                   || checkDiagonal(turnToLeft(input), c);
    }

    private static boolean checkDiagonal(char[][] array, char c) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && array[i][j] != c) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkRow(char[][] array, char c) {
        char[] targetArray = new char[3];
        for (int i = 0; i < 3; i++) {
            targetArray[i] = c;
        }

        for (int i = 0; i < 3; i++) {
            char[] sortSubArray = array[i].clone();
            Arrays.sort(sortSubArray);
            if (Arrays.equals(sortSubArray, targetArray)) {
                return true;
            }
        }
        return false;
    }

    private static char[][] turnToLeft(char[][] array) {
        char[][] resultArray = new char[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                resultArray[array[i].length - j - 1][i] = array[i][j];
            }
        }
        return resultArray;
    }

    private static String[] setGameField(char[][] input) {
        String[] result = gameField.clone();
        result[1] = result[1].replace('0', input[0][0]);
        result[1] = result[1].replace('1', input[0][1]);
        result[1] = result[1].replace('2', input[0][2]);
        result[2] = result[2].replace('3', input[1][0]);
        result[2] = result[2].replace('4', input[1][1]);
        result[2] = result[2].replace('5', input[1][2]);
        result[3] = result[3].replace('6', input[2][0]);
        result[3] = result[3].replace('7', input[2][1]);
        result[3] = result[3].replace('8', input[2][2]);
        return result;
    }
}
