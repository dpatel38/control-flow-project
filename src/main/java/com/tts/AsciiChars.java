package com.tts;

public class AsciiChars {

    public static void printNumbers()
    {
        // TODO: print valid numeric input
        System.out.println("\nThe valid number are: ");
        for(int i = 0; i < 10; i++){
            System.out.print(i + " ");
        }

    }

    public static void printLowerCase()
    {
        // TODO: print valid lowercase alphabetic input
        System.out.println("\nThe valid lowercase alphabets are: ");
        for(char character = 'a'; character <= 'z'; character++){
            System.out.print(character + " ");
        }
    }

    public static void printUpperCase()
    {
        // TODO: print valid uppercase alphabetic input
        System.out.println("\nThe valid uppercase alphabets are: ");
        for(char character = 'A'; character <= 'Z'; character++){
            System.out.print(character + " ");
        }
    }
}
