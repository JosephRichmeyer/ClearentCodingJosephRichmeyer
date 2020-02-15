package com.company;

import java.util.Scanner;

public class peopleCount {
    public static int people() {
        System.out.println("How many people are you calculating interest for?");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        return Integer.parseInt(s);
    }
}
