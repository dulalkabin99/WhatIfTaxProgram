package com.company;

import java.util.Scanner;

public class Tax {

    public static void main(String[] args) {
        String customerNum, name, taxCode;
        double taxAmount, salesAmount, taxPercent = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Customer Number:  ");
        customerNum = keyboard.next();

        System.out.println("Customer's  Name? ");
        name = keyboard.next();

        System.out.println("Enter Sales Amount:  ");
        salesAmount = keyboard.nextDouble();

        System.out.println("Enter Taxcode:  ");
        taxCode = keyboard.next();

        if (taxCode.equals("NRM") || taxCode.equals("nrm")) {
            taxPercent = 6.0;
        } else if (taxCode.equals("NPF") || taxCode.equals("npf")) {
            taxPercent = 0.0;
        } else if (taxCode.equals("BIZ") || taxCode.equals("biz")) {
            taxPercent = 4.5;
        } else {
            System.out.print(" Invalid Tax Code");
        }

        if (taxPercent > 0) {
            taxAmount = (salesAmount * taxPercent) / 100;
        } else {
            taxAmount = 0;
        }
        taxAmount = (salesAmount * taxPercent) / 100;
        System.out.println(" Customer ID: " + customerNum);
        System.out.println(" Customer Name: " + name);
        System.out.println(" Sales Ammount: " + salesAmount);
        System.out.println(" Tax Code: " + taxCode);
        System.out.println(" Total Ammount Due: " +(salesAmount + taxAmount));

    }
}
