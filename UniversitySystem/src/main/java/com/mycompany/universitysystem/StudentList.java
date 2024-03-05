/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universitysystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class StudentList {

    Vector<Student> list= new Vector();
   

    public StudentList() {
        LoadFile();
    }

    public void InputCollegeStudent() {
        Student st = new CStudent();
        st.InputStudent();
        list.add(st);
        SaveFile();
    }

    public void InputUniversityStudent() {
        Student st = new UStudent();
        st.InputStudent();
        list.add(st);
        SaveFile();
    }

    public void RemoveStudent() {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a student number:");
        sc.nextLine();
        String num = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNumber().equals(num)) {
                flag = true;
                list.remove(list.get(i));
            }
        }
        if (!flag) {
            System.out.println("There is not any student with number " + num);
        } else {
            System.out.println("Successfully removed student with number" + num);
        }
        SaveFile();
    }

    public void PrintStudentList() {
        for (Student s : list) {
            s.GetStudent();
        }
    }

    public void PrintEligableStudentForGraduation() {
        int count = 0;
        for (Student s : list) {
            if (s.Graduation()) {
                s.GetStudent();
                count++;
            }
        }
        System.out.println("Number of students who are eligible for graduation: " + count);
    }

    public void sortAscendingType() {
        Collections.sort(list, Comparator.comparing(Student::getType).thenComparing(Student::getNumber));
        PrintStudentList();
        SaveFile();
    }

    public void FindStudent() {
         Scanner sc = new Scanner(System.in);
        System.out.println("Find: ");
        sc.nextLine();
        String find = sc.nextLine();
        for (Student s : list) {
            if (s.getFullName().toUpperCase().contains(find.toUpperCase())) {
                s.GetStudent();
            }
        }
    }
    String fileName = "University.DAT";

    public void SaveFile() {
        try {
            FileOutputStream f = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(f);
            oos.writeObject(list);
            oos.close();

        } catch (IOException e) {
            System.out.println("Error save file: " + e.getMessage());
        }
    }

    public void LoadFile() {
        try {
            FileInputStream f = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(f);
            list = (Vector<Student>) ois.readObject();
            ois.close();

        } catch (IOException e) {
            System.out.println("Error load file: " + e.getMessage());
        } catch (ClassNotFoundException c) {
            System.out.println("No file found!");
        }
    }
}
