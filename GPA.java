package com.company;

import java.util.Scanner;
import java.text.DecimalFormat;
public class GPA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#, ###, ##0.0");
        char grade;
        double credits;
        System.out.println("Please enter the total number of credits you have taken: ");
        double gradepoint = 0;
        System.out.println("Please enter your grades for this semester: ");


        double student[] = new double[5];
        for (int i = 0; i < 4; i++) {
            student[i] = Math.random() * 4;
        }
        student[4] = gradepoint;
        for (int i = 0; i < student.length; i++) {
            System.out.println(df.format(student[i]));

        }


        if (gradepoint >= 3.5)
            gradepoint = (int) 1;
        else if (gradepoint >= 3.0 && gradepoint < 3.5)
            gradepoint = (int) 2;
        else if (gradepoint >= 2.5 && gradepoint < 3.0)
            gradepoint = (int) 3;
        else if (gradepoint >= 2.0 && gradepoint < 2.5)
            gradepoint = (int) 4;
        else
            gradepoint = (int) 5;

        switch ((int) gradepoint) {
            case 1:
                grade = 'A';
                break;
            case 2:
                grade = 'B';
                break;
            case 3:
                grade = 'C';
                break;
            case 4:
                grade = 'D';
                break;
            case 5:
                grade = 'F';
                break;


        }
    }
    public static double avg(double student[]) {
        double sum = 0;
        for (int i = 0; i < student.length; i++) {
            sum += student[i];
        }
        return sum / student.length;
    }

}



