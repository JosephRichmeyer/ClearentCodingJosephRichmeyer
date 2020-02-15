
// Clearent Coding Challenge
// By Joseph Richmeyer - Full Stack Software Engineer
// 2/15/2020
//Email: RichmeyerJ@gmail.com
//Phone 314-799-1384
//Notes:
//Since all balances of each card are $100 i have excluded any way to modify the card amount to save time
//There are all kinds of exceptions and errors depending on input.
//It is by no means perfect/production code, but assumming you give it correct inputs, it will provide the correct answers.

//Instructions:
//Run the program, and answer the questions with numbers. Simple interest will be calculated based on your inputs

package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.*;

public class Main {

    public static void main(String[] args) {

    //Interest rates
    double DiscoverInterest = .01;
    double MastercardInterest = .05;
    double VisaInterest = .1;
    //Asks the user how many people they want to calculate interest for
	int totalPeople = peopleCount.people();
	//Creates an array of the people classes with total of the amount of people
    people[] peopleArray = new people[totalPeople];

    //initializes people objects
    for (int i =0;i < peopleArray.length; i++)
        peopleArray[i] = new people();

    //Takes the number of people, asks the user how many wallets they have and updates the class
    for (int i = 0; i < peopleArray.length; i++ ) {
        Scanner scan = new Scanner(System.in);
        int count = i + 1;
        System.out.println("How many wallets does person " + (count) + " have?");
        String w = scan.next();
        peopleArray[i].setWallet(parseInt(w));
    }
    // Asks and updates the wallet array with the amount of credit cards
    for (int i = 0; i < peopleArray.length; i++){
        for (int t =0; t < peopleArray[i].getWallet(); t++){
            Scanner scan = new Scanner(System.in);
            System.out.println("For person "+ (i + 1) + " and wallet " + (t + 1) + ":");
            System.out.println("How many Discover cards does this person have in this wallet?");
            String ds = scan.next();
            System.out.println("How many Mastercards does this person have in this wallet?");
            String mc = scan.next();
            System.out.println("How many Visa does this person have in this wallet?");
            String vs = scan.next();
            //Creates an ArrayList to prepare card data for adding to people.cards
            ArrayList <Integer> addC = new ArrayList<Integer>();
            addC.add(0, parseInt(ds));
            addC.add(1, parseInt(mc));
            addC.add(2, parseInt(vs));
            peopleArray[i].addCards(addC);

        }
        //Note to Clearent. This block below is not optimized or simplified at all. It works, but can be simplified.
    for (int t = 0;t < peopleArray.length; t++){
        System.out.println("For Person " + (t+1) +":");
        var Cards = peopleArray[t].getCards();
        for (int q =0; q < Cards.size(); q++) {
            int discCard = Cards.get(q).get(0);
            int mcCard = Cards.get(q).get(1);
            int vsCard = Cards.get(q).get(2);
            System.out.println("Wallet " + (q+1) + " has:");
            System.out.println(discCard + " Discover cards with total interest of $" + ((discCard *100) * DiscoverInterest));
            System.out.println(mcCard + " Mastercards with total interest of $" + ((mcCard*100) * MastercardInterest));
            System.out.println(vsCard + " Visa cards with total interest of $" + ((vsCard *100) * VisaInterest));
            System.out.println("Wallet " + (q+1) +" total interest is: $" + (
                    ((discCard *100) * DiscoverInterest) + ((mcCard *100) * MastercardInterest) + ((vsCard *100) * VisaInterest)
                    ) );
        }
        double total = 0;
        for (int c =0; c < Cards.size(); c++) {
            total = total +
                    ((Cards.get(c).get(0))*DiscoverInterest*100) +
                    ((Cards.get(c).get(1)) *MastercardInterest*100)+
                    ((Cards.get(c).get(2) *VisaInterest*100));
        }
        System.out.println("Total interest for person " + (t + 1) + " is: $" +total);

    }
    }
        System.out.println("Thank you! - Joseph Richmeyer - Full Stack Software Engineer - Richmeyerj@gmail.com 314-799-1384");

    }
}
