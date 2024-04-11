package N1EX3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        boolean correctDataType = false;
        byte userInput = 0;

        do {
            try {
                System.out.println(message);
                userInput = scanner.nextByte();
                correctDataType = true;
            } catch (InputMismatchException e) {
                System.err.println("Format error. You must put the correct type of value. Try again.");
            } finally {
                scanner.nextLine();
            }
        } while (!correctDataType);

        return userInput;
    }

    public static int readInt(String message) {
        boolean correctDataType = false;
        int userInput = 0;

        do {
            try {
                System.out.println(message);
                userInput = scanner.nextInt();
                correctDataType = true;
            } catch (InputMismatchException e) {
                System.err.println("Format error. You must put the correct type of value. Try again.");
            } finally {
                scanner.nextLine();
            }
        } while(!correctDataType);

        return userInput;
    }

    public static float readFloat(String message) {
        boolean correctDataType = false;
        float userInput = 0;

        do {
            try {
                System.out.println(message);
                userInput = scanner.nextFloat();
                correctDataType = true;
            } catch (InputMismatchException e) {
                System.err.println("Format error. You must put the correct type of value. Try again.");
            } finally {
                scanner.nextLine();
            }
        } while (!correctDataType);

        return userInput;
    }

    public static double readDouble(String message) {
        boolean correctDataType = false;
        double userInput = 0;

        do {
            try {
                System.out.println(message);
                userInput = scanner.nextDouble();
                correctDataType = true;
            } catch (InputMismatchException e) {
                System.err.println("Format error. You must put the correct type of value. Try again.");
            } finally {
                scanner.nextLine();
            }
        } while(!correctDataType);

        return userInput;
    }

    public static char readChar(String message) {
        boolean correctDataType = false;
        char userInput = ' ';

        do {
            try {
                System.out.println(message);
                userInput = scanner.next().charAt(0);
                correctDataType = true;
            } catch (InputMismatchException e) {
                System.err.println("Format error. You must put the correct type of value. Try again.");
            } finally {
                scanner.nextLine();
            }
        } while (!correctDataType);

        return userInput;
    }

    public static String readString(String message) {
        boolean correctDataType = false;
        String userInput = "";

        do {
            try {
                System.out.println(message);
                userInput = scanner.nextLine();
                correctDataType = true;
            } catch (Exception e) {
                System.err.println("Format error. You must put the correct type of value. Try again.");
            }
        } while (!correctDataType);

        return userInput;
    }

    public static boolean readYesOrNo(String message) {

        boolean correctDataType = false;
        boolean userInput = false;

        do {
            try {
                System.out.println(message);
                userInput = scanner.nextBoolean();
                correctDataType = true;
            } catch (Exception e) {
                System.err.println("Format error. You must put the correct type of value. Try again.");
            } finally {
                scanner.nextLine();
            }
        } while (!correctDataType);

        return userInput;
    }
}
