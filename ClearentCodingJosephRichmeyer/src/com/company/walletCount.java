package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class walletCount {
    public static int wallet(int people) {
        //for statement on number of people
        System.out.println("How many wallets does person " + people + " have?");
        Scanner scan = new Scanner(System.in);
        String t = scan.next();
        return Integer.parseInt(t);
        }
    }

