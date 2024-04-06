package Application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

class Voter {
    private int id;
    private String name;
    private String birthdate;

    public Voter(int id, String name, String birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public int getAge() {
        // Calculate age based on birthdate
        String[] parts = birthdate.split("-");
        int birthYear = Integer.parseInt(parts[0]);
        int birthMonth = Integer.parseInt(parts[1]);
        int birthDay = Integer.parseInt(parts[2]);

        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int currentMonth = currentDate.getMonthValue();
        int currentDay = currentDate.getDayOfMonth();

        int age = currentYear - birthYear;
        if (birthMonth > currentMonth || (birthMonth == currentMonth && birthDay > currentDay)) {
            age--;
        }
        return age;
    }
}

public class GenericsVoterApp {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of voters
        System.out.print("Enter the number of voters: ");
        int numVoters = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Create an ArrayList to store voter information
        ArrayList<Voter> voterList = new ArrayList<>();

        // Iterate for each voter
        for (int i = 0; i < numVoters; i++) {
            System.out.println("\nEnter voter information for voter " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Birthdate (YYYY-MM-DD): ");
            String birthdate = scanner.nextLine();

            // Add new voter to the list
            voterList.add(new Voter(id, name, birthdate));
        }

        // Create temporary collection for valid voters
        ArrayList<Voter> validVoters = new ArrayList<>();

        // Iterate through the voter list to filter out valid voters
        for (Voter voter : voterList) {
            int age = voter.getAge();
            if (age >= 18) {
                validVoters.add(voter);
            }
        }

        // Display valid voters
        System.out.println("\nValid Voters:");
        for (Voter validVoter : validVoters) {
            System.out.println("ID: " + validVoter.getId() + ", Name: " + validVoter.getName() + ", Age: " + validVoter.getAge());
        }

        // Close scanner
        scanner.close();
    }
}
