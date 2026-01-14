package com.tka.jan14;

public class KitePattern {

	public static void main(String[] args) {
		
		int n = 5;

        // Upper triangle (top part of kite)
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Lower inverted triangle (bottom part of kite)
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
     // Tail in S-shape
        int tailLength = 6; // number of rows in the tail
        for (int i = 0; i < tailLength; i++) {
            if (i % 4 == 0 || i % 4 == 1) {
                // shift right for top curve of S
                for (int j = 0; j < n; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            } else {
                // shift left for bottom curve of S
                for (int j = 0; j < n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
	}

}
