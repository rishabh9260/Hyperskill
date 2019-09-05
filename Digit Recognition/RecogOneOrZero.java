/*
* @author Rishabh Jain
* This is a simple program of digit recognition that recognizes if the digit is one or zero
* using a simple neural network.
* Enter 3 lines of input signifying a 3x3 grid. Input '_' to mark as empty or any other character to mark as highlighted.
* Sample Input: _x_
*               _x_
*               __x
*
* This gives the output as one.
*/

import java.util.*;

public class RecogOneOrZero{

    public static void main(String[] args) {
        int w1=2, w2=1, w3=2, w4=4, w5=-4, w6=4, w7=2, w8=-1, w9=2, b=-5;   //weights
        int a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;

        Scanner sc = new Scanner(System.in);

        String line2 = sc.nextLine();
        String line3 = sc.nextLine();
        String line4 = sc.nextLine();

        if (line2.charAt(0) == '_') {
            a1 = 0;
        } else {
            a1 = 1;
        }

        if (line2.charAt(1) == '_') {
            a2 = 0;
        } else {
            a2 = 1;
        }

        if (line2.charAt(2) == '_') {
            a3 = 0;
        } else {
            a3 = 1;
        }

        if (line3.charAt(0) == '_') {
            a4 = 0;
        } else {
            a4 = 1;
        }

        if (line3.charAt(1) == '_') {
            a5 = 0;
        } else {
            a5 = 1;
        }

        if (line3.charAt(2) == '_') {
            a6 = 0;
        } else {
            a6 = 1;
        }

        if (line4.charAt(0) == '_') {
            a7 = 0;
        } else {
            a7 = 1;
        }

        if (line4.charAt(1) == '_') {
            a8 = 0;
        } else {
            a8 = 1;
        }

        if (line4.charAt(2) == '_') {
            a9 = 0;
        } else {
            a9 = 1;
        }

        a10 = a1*w1 + a2*w2 + a3*w3 + a4*w4 + a5*w5 + a6*w6 + a7*w7 + a8*w8 + a9*w9 + b;

        if(a10 > 0) {
            System.out.println("This number is 0");
        } else {
            System.out.println("This number is 1");
        }

        sc.close();
    }
}