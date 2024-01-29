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
public abstract class Student {

    private String number;
    private String fullName;
    protected int totalCredit;
    protected double averageScore;

    public Student() {
    }

    public Student(String number, String fullName, int totalCredit, double averageScore) {
        this.number = number;
        this.fullName = fullName;
        this.totalCredit = totalCredit;
        this.averageScore = averageScore;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(int totalCredit) {
        this.totalCredit = totalCredit;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public void InputStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student number:");
        number = sc.nextLine();
        System.out.print("Enter student full name:");
        fullName = sc.nextLine();
        System.out.print("Enter total of Creadit:");
        totalCredit = sc.nextInt();
        System.out.print("Enter student average score:");
        averageScore = sc.nextDouble();

    }

    public void GetStudent() {
        System.out.print(number + ":" + fullName + "-" + totalCredit + "-" + averageScore);
    }
    public abstract boolean Graduation();
    public abstract int getType();
}
