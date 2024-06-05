

import java.util.Scanner;

// Custom exception class
class InvalidAgeException extends Exception {
    private int age;

    public InvalidAgeException(int age) {
        super("Invalid age: " + age);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

// Main class
public class AgeValidator {
    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException(age);
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = scanner.nextInt();

        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
            System.out.println("The provided age " + e.getAge() + " is not within the valid range (0-120).");
        }
    }
}


