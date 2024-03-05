/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.universitysystem;

import java.util.*;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class UniversitySystem {

    

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      StudentList list= new StudentList();
      
        int command;
        do {
            System.out.println("1. Add a new college student.\n"
                    + "2. Add a new university student.\n"
                    + "3. Remove a student from the list with the student code entered from the keyboard.\n"
                    + "4. Print student list.\n"
                    + "5. Print the list of students eligible for graduation and indicate the number of eligible students.\n"
                    + "6. Sort the student list ascending by Student type (College, university) and student code\n"
                    + "7. Find student list by student's full name (Contains).\n"
                    + "8. Exit\n"
                    + "Enter a command number:");
            command = sc.nextInt();
            switch (command) {
                case 1:
                    list.InputCollegeStudent();
                    break;
                case 2: 
                    list.InputUniversityStudent();
                    break;
                case 3:
                   list.RemoveStudent();
                    break;
                case 4:
                    list.PrintStudentList();
                    break;
                case 5:
                    int count = 0;
                   list.PrintEligableStudentForGraduation();
                    break;
                case 6:
                   list.sortAscendingType();
                    break;
                case 7:
                    list.FindStudent();
                    break;
                case 8:
                    break;
            }
        } while (command != 8);
    }

}
