import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Policy> policies = new ArrayList<>();
        int smokerCount = 0;
        int nonSmokerCount = 0;
        
        try {
            Scanner fileScanner = new Scanner(new File("PolicyInformation.txt"));
            
            while (fileScanner.hasNext()) {
                // Read policy data from file
                String policyNumber = fileScanner.nextLine();
                String providerName = fileScanner.nextLine();
                String firstName = fileScanner.nextLine();
                String lastName = fileScanner.nextLine();
                int age = Integer.parseInt(fileScanner.nextLine());
                String smokingStatus = fileScanner.nextLine();
                double height = Double.parseDouble(fileScanner.nextLine());
                double weight = Double.parseDouble(fileScanner.nextLine());
                
                // Create policy object and add to list
                Policy policy = new Policy(policyNumber, providerName, firstName, 
                                         lastName, age, smokingStatus, height, weight);
                policies.add(policy);
                
                // Count smokers and non-smokers
                if (policy.getSmokingStatus().equalsIgnoreCase("smoker")) {
                    smokerCount++;
                } else {
                    nonSmokerCount++;
                }
                
                // Skip blank line between records if present
                if (fileScanner.hasNext()) {
                    fileScanner.nextLine();
                }
            }
            
            fileScanner.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: PolicyInformation.txt file not found.");
            return;
        }
        
        // Display all policy information
        for (Policy policy : policies) {
            System.out.println("Policy Number: " + policy.getPolicyNumber());
            System.out.println("Provider Name: " + policy.getProviderName());
            System.out.println("Policyholder's First Name: " + policy.getPolicyholderFirstName());
            System.out.println("Policyholder's Last Name: " + policy.getPolicyholderLastName());
            System.out.println("Policyholder's Age: " + policy.getPolicyholderAge());
            System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
            System.out.println("Policyholder's Height: " + policy.getPolicyholderHeight() + " inches");
            System.out.println("Policyholder's Weight: " + policy.getPolicyholderWeight() + " pounds");
            System.out.printf("Policyholder's BMI: %.2f\n", policy.calculateBMI());
            System.out.printf("Policy Price: $%.2f\n", policy.calculatePolicyPrice());
            System.out.println();
        }
        
        // Display smoker counts
        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}
