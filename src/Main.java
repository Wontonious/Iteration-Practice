import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//Problem 1
        int userInput;
        do {
            System.out.println("Please enter: 7");
            userInput = Integer.parseInt(scan.next());
        } while (userInput != 7);
        System.out.println();

//Problem 2
        double firstNumber, secondNumber;
        System.out.println("Please enter a number you would like to double x amount of times.");
        firstNumber = Double.parseDouble(scan.next());
        System.out.println("How many times would you like to double the number: " + firstNumber + "?");
        secondNumber = Double.parseDouble(scan.next());
        System.out.println("Number being doubled:\t" + firstNumber + "\nNumber of times to double:\t" + secondNumber);
        System.out.println("Final Answer: " + firstNumber * Math.pow(2, secondNumber));
        System.out.println();

//Problem 3
        int userAge;
        do {
            System.out.println("Please enter your age (Between 10-50):");
            userAge = Integer.parseInt(scan.next());
        } while ((userAge <= 10) || (userAge >= 50));
        System.out.println();

        //Problem 4
        System.out.println("Let's find the average of your grades!\nHow many grades would you like to enter?");
        int grades = Integer.parseInt(scan.next());
        System.out.println("Number of grades to submit: " + grades);
        System.out.println("Please enter each grade you would like to enter one by one.");
        double totalPercentage = 0;
        for (int i = 0; i < grades; i++) {
            int gradePercents = Integer.parseInt(scan.next());
            totalPercentage += gradePercents;
        }
        System.out.println("The average of your grades are:");
        System.out.println(totalPercentage / grades + "%");
        System.out.println();

        //Problem 5
        String userPassword;
        String confirmPassword;
        System.out.println("Please create a password!");
        userPassword = scan.next();
        do{
            System.out.println("To proceed please re-enter your password");
            confirmPassword = scan.next();
        }while(!userPassword.equals(confirmPassword));

        //Problem 6
        int userMin;
        int userMax;
        int totalFactors = 0;
        System.out.println("Let's find all the multiples of 7 within a range of your choice!");
        System.out.println("Where would you like the start (or minimum) of your range?");
        userMin = Integer.parseInt(scan.next());
        System.out.println("Where would you like the end (or maximum) of your range?");
        userMax = Integer.parseInt(scan.next());
        int range = userMax - userMin;
        for (int a = 0; a < range + userMin + 1; a++) {
            if ((a >= userMin) && (a <= userMax) && (a % 7 == 0)) {
                System.out.println("Factor of " + a);
                if (a % 7 == 0) {
                    totalFactors++;
                }
            }
        }
        System.out.println("There are " + totalFactors + " factors.");
    }
}