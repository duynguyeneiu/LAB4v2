/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.dictionary;

import java.util.*;
import java.io.*;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class Dictionary {

    private static Map< String, String> dictionary;
    public static Scanner sc = new Scanner(System.in, "UTF-8");

    public static void main(String[] args) {
        dictionary = new HashMap<>();
        dictionary.put("red", "màu đỏ");
        dictionary.put("blue", "màu xanh");
        dictionary.put("yellow", "màu vàng");
        dictionary.put("white", "màu trắng");
        dictionary.put("pink", "màu hồng");
        dictionary.put("black", "màu đen");
        dictionary.put("brown", "màu nâu");
        dictionary.put("purple", "màu tím");
        dictionary.put("people", "con người");
        dictionary.put("school", "trường học");

        int command;
        do {
            System.out.println("1. Add a word\n"
                    + "2. Find a word\n"
                    + "3. Finish\n"
                    + "Enter a command:");
            command = sc.nextInt();
            switch (command) {
                case 1:
                    AddWord(dictionary);
                    break;
                case 2:
                    FindMeaning(dictionary);
                    break;
                case 3:
                    break;
            }

        } while (command != 3);
    }

    public static boolean IsContain(Map< String, String> dictionary, String word) {
        if (dictionary.containsKey(word)) {
            return true;
        } else {
            return false;
        }
    }

    public static void FindMeaning(Map< String, String> dictionary) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String key = sc.nextLine();
        if (dictionary.containsKey(key)) {
            System.out.println(dictionary.get(key));
        } else {
            System.out.println(key + " does not exist in the dictionary.");
        }

    }

    public static void AddWord(Map< String, String> dictionary) {
        System.out.println("Add a word");
        System.out.print("Enter a word:");
        String key = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter its meaning:");
        String meaning = sc.nextLine();
        dictionary.put(key, meaning);

    }

}
