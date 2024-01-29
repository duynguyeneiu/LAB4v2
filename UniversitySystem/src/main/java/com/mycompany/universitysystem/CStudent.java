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
public class CStudent extends Student {
    private double graduationExamScore;
    private Scanner sc= new Scanner (System.in);
    public CStudent() {
    }
    public CStudent(double graduationExamScore, String number, String fullName, int totalCredit, double averageScore) {
        super(number, fullName, totalCredit, averageScore);
        this.graduationExamScore = graduationExamScore;
    }

    public double getGraduationExamScore() {
        return graduationExamScore;
    }

    public void setGraduationExamScore(double graduationExamScore) {
        this.graduationExamScore = graduationExamScore;
    }

    @Override
    public void InputStudent() {
       super.InputStudent();
       System.out.print("Enter student graduation exam score:");
       graduationExamScore= sc.nextDouble();
    }

    @Override
    public void GetStudent() {
      super.GetStudent();
        System.out.println("-"+graduationExamScore);
      
    }

    @Override
    public boolean Graduation() {
        if (totalCredit >= 100 && averageScore >= 5 && graduationExamScore >= 5) {
            return true;
        }
        return false;
    }

    @Override
    public int getType() {
        return 0;
    }    
}