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

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Student> list = new Vector<>();
        Student st;
        st = new CStudent(6, "001", "duynguyen", 120, 8);
        list.add(st);
        st = new CStudent(4, "002", "huyhoang", 90, 4);
        list.add(st);
        st = new UStudent("hom nay troi dep", 9, "007", "lethanhcong", 170, 5);
        list.add(st);
        st = new CStudent(5, "003", "linhlung", 130, 6);
        list.add(st);
        st = new UStudent("tomorrow", 6, "004", "huynhvana", 160, 8);
        list.add(st);
        st = new UStudent("yesterday", 4, "006", "nguyenb", 150, 9);
        list.add(st);
        st = new UStudent("hummm", 4, "001", "nguyenthic", 150, 9);
        list.add(st);
        st = new CStudent(5, "004", "linhlung", 130, 6);
        list.add(st);
        
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
                    st = new CStudent();
                    st.InputStudent();
                    list.add(st);
                    break;
                case 2:
                    st = new UStudent();
                    st.InputStudent();
                    list.add(st);
                    break;
                case 3:
                    System.out.print("Enter a student number:");
                    sc.nextLine();
                    String num = sc.nextLine();
                    boolean flag = false;
                    for (int i=0;i<list.size();i++) {
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
                    break;
                case 4:
                    for (Student s : list) {
                        s.GetStudent();
                    }
                    break;
                case 5:
                    int count = 0;
                    for (Student s : list) {
                        if (s.Graduation()) {
                            s.GetStudent();
                            count++;
                        }
                    }
                    System.out.println("Number of students who are eligible for graduation: " + count);
                    break;
                case 6:
                    Collections.sort(list, Comparator.comparing(Student::getType).thenComparing(Student::getNumber));
                    for (Student s : list) {
                        s.GetStudent();
                    }
                    break;
                case 7:
                    System.out.println("Find: ");
                    sc.nextLine();
                    String find=sc.nextLine();
                    for (Student s:list){
                        if (s.getFullName().toUpperCase().contains(find.toUpperCase())){
                            s.GetStudent();
                        }
                    }
                    break;
                case 8:
                    break;
            }
        } while (command != 8);
    }

}
