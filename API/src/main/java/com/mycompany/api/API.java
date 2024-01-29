/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.api;

import java.util.Scanner;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class API {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int command;
        do {
            System.out.print("1. Print TPBank Name\n"
                    + "2. Print VietcomBank Name\n"
                    + "3. Finish\n"
                    + "Enter a command number:");
            command = sc.nextInt();
            switch (command) {
                case 1:
                    TPBank tp = new TPBank();
                    System.out.println(tp.getBankName());
                    break;
                case 2:
                    VietcomBank vc = new VietcomBank();
                    System.out.println(vc.getBankName());
                    break;
                case 3:
                    break;
            }
        } while (command != 3);

    }
}
