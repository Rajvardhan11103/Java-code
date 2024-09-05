/* PS15 :- Write a program in java which take user defines range as input and print perfect cubes from 
the range */ 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PerfectCubesPrinter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the starting number: ");
        int start = Integer.parseInt(reader.readLine());

        System.out.print("Enter the ending number: ");
        int end = Integer.parseInt(reader.readLine());

        System.out.println("Perfect cubes between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            if (isPerfectCube(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Helper method to check if a number is a perfect cube
    static boolean isPerfectCube(int n) {
        int cubeRoot = (int) Math.cbrt(n);
        return cubeRoot * cubeRoot * cubeRoot == n;
    }
}
