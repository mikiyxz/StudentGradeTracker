package studentgradetracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        String name;
        String course;
        double grade;

        System.out.print("What is your name?: ");
        name = scanner.nextLine();
        System.out.print("What is the course name?: ");
        course = scanner.nextLine();
        System.out.print("What is your Grade in that course?: ");
        grade = scanner.nextDouble();

        while(grade<0 || grade>100){
            System.out.println("INVALID GRADE");
            System.out.println("Please try again");
            System.out.print("What is your Grade in that course?: ");
            grade = scanner.nextDouble();
        }

            System.out.println("Name: "+name);
            System.out.println("Course: "+ course);
            System.out.println("Grade: "+grade);

            scanner.close();



  }

    }

