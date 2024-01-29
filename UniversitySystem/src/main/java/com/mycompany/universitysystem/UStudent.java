/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universitysystem;

import java.util.Scanner;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class UStudent extends Student {

    private String thesisName;
    private double thesisScore;
    private Scanner sc = new Scanner(System.in);

    public UStudent() {
    }

    public UStudent(String thesisName, double thesisScore, String number, String fullName, int totalCredit, double averageScore) {
        super(number, fullName, totalCredit, averageScore);
        this.thesisName = thesisName;
        this.thesisScore = thesisScore;
    }

    public String getThesisName() {
        return thesisName;
    }

    public void setThesisName(String thesisName) {
        this.thesisName = thesisName;
    }

    public double getThesisScore() {
        return thesisScore;
    }

    public void setThesisScore(double thesisScore) {
        this.thesisScore = thesisScore;
    }

    @Override
    public void InputStudent() {
        super.InputStudent();
        System.out.print("Enter thesis name:");
        thesisName = sc.nextLine();
        System.out.print("Enter thesis score:");
        thesisScore = sc.nextDouble();
    }

    @Override
    public void GetStudent() {
        super.GetStudent();
        System.out.println("-" + thesisName + ":" + thesisScore);
    }

    @Override
    public boolean Graduation() {
        if (totalCredit >= 150 && averageScore >= 5 && thesisScore >= 5) {
            return true;
        }
        return false;
    }

    @Override
    public int getType() {
        return 1;
    }
}
