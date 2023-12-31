import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        //USING SCANNER
//
//        //Creating an object to the 45scanner
//        Scanner x = new Scanner(System.in);
//
//        //Prompt for the input
//        System.out.print("Enter your name: ");
//
//        //Using the above created object(x) to store the value of the user input
//        String name = x.nextLine(); //String Value nextLine()
//
//        //Outputting the name
//        System.out.println("Hello " + name);
//
//        System.out.print("Enter your age: ");
//        //Reading an Integer value nextInt()
//        int age = x.nextInt();
//        System.out.println("Your age is: " + age);
//
//
//        //USING MATHEMATICAL OPERATORS
//
//        int num1 = 10;
//        int num2 = 5;
//        int total = num1 + num2;
//        int difference = num1 - num2;
//        int multiply = num1 * num2;
//        int division = num1 / num2;
//        int mod = num1 % num2;
//
//        System.out.println("Number 1 is: " + num1 + " Number 2 is: " + num2);
//        System.out.println("The Sum is: " + total);
//        System.out.println("The difference is: " + difference);
//        System.out.println("The multiplication is: " + multiply);
//        System.out.println("The division is: " + division);
//        System.out.println("The mod is: " + mod);

        //ASSIGNMENT OPERATORS

//        //Post Increment
//        int p = 10;
//        // 1 -> First substitute the value of p to q
//        // 2 -> Then the Increment
//        int q = p++;
//        System.out.println("The value of p is: " + p);
//        System.out.println("The value of q is: " + q);
//
//        //Pre Increment
//        int p1 = 15;
//        // 1 -> First the increment
//        // 2 -> Then Substitute the value of p1 to q1
//        int q1 = ++p1;
//        System.out.println("The value of p1 is: " + p1);
//        System.out.println("The value of q1 is: " + q1);

        //IF-ELSE AND COMPARISON OPERATORS
//        Scanner sc1 = new Scanner(System.in);
//        System.out.print("Enter your average: ");
//        double average = sc1.nextInt();
//
//        if (average >= 75) {
//            System.out.println("You got A pass");
//        } else if (average >= 65) {
//            System.out.println("You got B pass");
//        } else if (average >= 55) {
//            System.out.println("You got C pass");
//        } else if (average >= 45) {
//            System.out.println("You got S pass");
//        } else {
//            System.out.println("Sorry, You failed");
//        }
//
//        if (average >= 45 && average < 100) {
//            System.out.println("You are Good");
//        } else {
//            System.out.println("Please work Harder");
//        }

        //LOGICAL OPERATORS

//        int x = 20;
//        int y = -30;
//
//        // AND OPERATOR
//        if (x > 0 && y > 0) {
//            System.out.println("Positive");
//        } else {
//            System.out.println("Negative");
//        }
//
//        if (x > 0 || y > 0) {
//            System.out.println("Positive");
//        } else {
//            System.out.println("Negative");
//        }

        //SWITCH CASE

//        Scanner sc1 = new Scanner(System.in);
//        System.out.print("Please enter your marks: ");
//        int day = sc1.nextInt();
//
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Invalid Input");
//        }

        //WHILE LOOP

//        //print even numbers between 10 and 10
//        int i = 10;
//        while (i<=20){
//            System.out.println(i);
//            i+=2;
//        }

        //DO-WHILE LOOP
//        int i = 1;
//        do {
//            System.out.println("HELLO");
//            i++;
//        } while (i<=3);

        //ARRAYS
//        int[] evenArray = {2, 4, 6, 8};
//        String[] names = {"Adeesha", "Kaveesha", "Sadeesha"};
//
//        //Accessing the arrays
//        System.out.println(names[0]);
//        System.out.println(Arrays.toString(evenArray));
//
//        //Editing the arrays
//        names[2] = "Chathusha";
//        System.out.println(Arrays.toString(names));
//
//        String[] names2 = new String[5];
//        names2[0] = "Bellamy";
//        System.out.println(names2[0]);
//        System.out.println(names2[4]);
//
//        //2D ARRAY
//
//        int[][] twoDArray = {
//                {1, 2, 3}, //row Index 0
//                {4, 5, 6}, //row Index 1
//                {7, 8, 9}  //row Index 2
//        };
//
//        //Accessing Number 4 [row -> 1 Column -> 1]
//        System.out.println("Your Number is: " + twoDArray[1][0]);

        //FOR LOOP
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Welcome to the ground!");
//        }
//
//        String[] names = {"Adeesha", "Kaveesha", "Sadeesha"};
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }

        //JAVA STRING

        //Same memory reference.
        String name1 = "Adeesha";
        String name2 = "Adeesha";

        if (name1 == name2)
            System.out.println("Names are equal");
        else
            System.out.println("Names are not equal");

        //Different memory references
        String name3 = new String("Octavia");
        String name4 = new String("Octavia");

        if (name3 == name4)
            System.out.println("Names are equal");
        else
            System.out.println("Names are not equal");

        System.out.println(name3.length());
        System.out.println(name3.toUpperCase());

        String firstName = "Adeesha";
        String secondName = "Arunoda";

        System.out.println(firstName + " " +  secondName);
        System.out.println(firstName.concat(" " + secondName));
        System.out.println(firstName.replace("Ad","Sad"));
        System.out.println(firstName.contains("e"));


    }
}