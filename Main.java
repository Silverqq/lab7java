package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i = 0; i <= 2; i++){
	        int a = in.nextInt();
	        int b = in.nextInt();
	        int x = in.nextInt();
	        Math temp_math = new Math(a,b,x);
            System.out.println(temp_math.Math1());
            System.out.println(temp_math.Math2());
            temp_math.Math3();
        }
    }
}

