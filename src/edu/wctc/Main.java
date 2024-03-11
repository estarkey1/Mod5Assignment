package edu.wctc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Prompt user for input
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter first name:");
            String firstName = scanner.nextLine();

            System.out.println("Enter middle initial:");
            String middleInitial = scanner.nextLine();

            System.out.println("Enter last name:");
            String lastName = scanner.nextLine();

            System.out.println("Enter year of birth:");
            int year = scanner.nextInt();

            System.out.println("Enter month of birth:");
            int month = scanner.nextInt();

            System.out.println("Enter day of birth:");
            int day = scanner.nextInt();

            System.out.println("Enter gender code (M or F):");
            char genderCode = scanner.next().charAt(0);

            // Create a new DriversLicense object
            DriversLicense driversLicense = new DriversLicense();

            // Use utility classes to fill the object with data
            FirstNameUtility firstNameUtility = new FirstNameUtility();
            int FFF = firstNameUtility.encodeFirstName(firstName, middleInitial);
            driversLicense.setFFF(FFF);

            LastNameUtility lastNameUtility = new LastNameUtility();
            String SSSS = lastNameUtility.encodeLastName(lastName);
            driversLicense.setSSSS(SSSS);

            MonthDayGenderUtility monthDayGenderUtility = new MonthDayGenderUtility();
            int DDD = monthDayGenderUtility.encodeMonthDayGender(year, month, day, genderCode);
            driversLicense.setDDD(DDD);

            int YY = year % 100;
            int NN = 0;

            driversLicense.setYY(YY);
            driversLicense.setNN(NN);

            FloridaFormatter floridaFormatter = new FloridaFormatter();
            String floridaLicenseNumber = floridaFormatter.formatLicenseNumber(driversLicense);
            System.out.println("Florida Driver's License Number: " + floridaLicenseNumber);

            WisconsinFormatter wisconsinFormatter = new WisconsinFormatter();
            String wisconsinLicenseNumber = wisconsinFormatter.formatLicenseNumber(driversLicense);
            System.out.println("Wisconsin Driver's License Number: " + wisconsinLicenseNumber);

        } catch (Exception e) {
            // Print exception message, end program
            System.out.println(e.getMessage());
        }
    }
}
