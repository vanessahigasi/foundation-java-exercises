package task;

import data.Individual;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter age:");
        int age = scanner.nextInt();

        System.out.println("Enter gender:");
        String gender = scanner.nextLine();
        String gender1 = scanner.nextLine();

        System.out.println("Enter weight:");
        float weight = scanner.nextFloat();

        System.out.println("Enter height:");
        float height = scanner.nextFloat();

        Individual i1 = new Individual(name,age, 0, Individual.Gender.MALE,weight,height);
        Individual i2 = new Individual(name, age, Individual.Gender.FEMALE);
        Individual i3 = new Individual();

        System.out.println("Individual: " + i1.toString() +
                "; BMI: " + i1.calculateBMI() +
                ";overAge?: " + i1.isOverAge() +
                ". Total count: " + Individual.getCounter());


        System.out.println("Done!");
        }
    }

