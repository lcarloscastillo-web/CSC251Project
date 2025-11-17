public class PolicyTest {
    public static void main(String[] args) {
        // Create Policy objects
        Policy policy1 = new Policy("P001", "HealthPlus Inc.", "John", "Doe", 
                                   45, "non-smoker", 70.0, 180.0);
        
        Policy policy2 = new Policy();
        policy2.setPolicyNumber("P002");
        policy2.setProviderName("Wellness Corp");
        policy2.setPolicyholderFirstName("Jane");
        policy2.setPolicyholderLastName("Smith");
        policy2.setPolicyholderAge(55);
        policy2.setSmokingStatus("smoker");
        policy2.setPolicyholderHeight(64.0);
        policy2.setPolicyholderWeight(200.0);
        
        // Display policy information
        displayPolicyInfo(policy1);
        displayPolicyInfo(policy2);
    }
    
    private static void displayPolicyInfo(Policy policy) {
        System.out.println("Policy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder: " + policy.getPolicyholderFirstName() + 
                          " " + policy.getPolicyholderLastName());
        System.out.println("Policyholder's Age: " + policy.getPolicyholderAge());
        System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder's Height: " + policy.getPolicyholderHeight() + " inches");
        System.out.println("Policyholder's Weight: " + policy.getPolicyholderWeight() + " pounds");
        System.out.printf("Policyholder's BMI: %.2f\n", policy.calculateBMI());
        System.out.printf("Policy Price: $%.2f\n", policy.calculatePolicyPrice());
        System.out.println("----------------------------------------");
    }
}
