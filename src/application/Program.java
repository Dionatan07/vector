package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("How many values for each vector? ");
        int n = key.nextInt();

        int[] vectorA = new int[n];
        int[] vectorB = new int[n];
        int[] vectorC = new int[n];

        System.out.println("Enter the values for vector A: ");
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = key.nextInt();
            vectorC[i] = vectorA[i];
        }

        System.out.println("Enter the values for vector B: ");
        for (int i = 0; i < vectorB.length; i++) {
            vectorA[i] = key.nextInt();
            vectorC[i] += vectorA[i];
        }

        System.out.println();
        System.out.println("Final Vector: ");
        for (int i = 0; i < vectorC.length; i++) {
            System.out.println(vectorC[i]);
        }


    }
}
