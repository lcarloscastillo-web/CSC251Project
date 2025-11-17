public class Policy {
    
    private String policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String smokingStatus;
    private double policyholderHeight;
    private double policyholderWeight;
    
    public Policy() {
        policyNumber = "";
        providerName = "";
        policyholderFirstName = "";
        policyholderLastName = "";
        policyholderAge = 0;
        smokingStatus = "non-smoker";
        policyholderHeight = 0.0;
        policyholderWeight = 0.0;
    }
    
    public Policy(String policyNumber, String providerName, String firstName, 
                 String lastName, int age, String smokingStatus, 
                 double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyholderFirstName = firstName;
        this.policyholderLastName = lastName;
        this.policyholderAge = age;
        this.smokingStatus = smokingStatus;
        this.policyholderHeight = height;
        this.policyholderWeight = weight;
    }
    
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
    
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
    
    public void setPolicyholderFirstName(String firstName) {
        this.policyholderFirstName = firstName;
    }
    
    public void setPolicyholderLastName(String lastName) {
        this.policyholderLastName = lastName;
    }
    
    public void setPolicyholderAge(int age) {
        this.policyholderAge = age;
    }
    
    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }
    
    public void setPolicyholderHeight(double height) {
        this.policyholderHeight = height;
    }
    
    public void setPolicyholderWeight(double weight) {
        this.policyholderWeight = weight;
    }
    
    public String getPolicyNumber() {
        return policyNumber;
    }
    
    public String getProviderName() {
        return providerName;
    }
    
    public String getPolicyholderFirstName() {
        return policyholderFirstName;
    }
    
    public String getPolicyholderLastName() {
        return policyholderLastName;
    }
    
    public int getPolicyholderAge() {
        return policyholderAge;
    }
    
    public String getSmokingStatus() {
        return smokingStatus;
    }
    
    public double getPolicyholderHeight() {
        return policyholderHeight;
    }
    
    public double getPolicyholderWeight() {
        return policyholderWeight;
    }
    
    public double calculateBMI() {
        if (policyholderHeight == 0) {
            return 0;
        }
        return (policyholderWeight * 703) / (policyholderHeight * policyholderHeight);
    }
    
    public double calculatePolicyPrice() {
        double baseFee = 600.0;
        
        if (policyholderAge > 50) {
            baseFee += 75.0;
        }
        
        if (smokingStatus.equalsIgnoreCase("smoker")) {
            baseFee += 100.0;
        }
        
        double bmi = calculateBMI();
        if (bmi > 35.0) {
            baseFee += (bmi - 35.0) * 20.0;
        }
        
        return baseFee;
    }
    
    public static void main(String[] args) {
        Policy policy1 = new Policy("P001", "HealthPlus", "John", "Doe", 
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
        
        System.out.printf("Policy 1 Price: $%.2f\n", policy1.calculatePolicyPrice());
        System.out.printf("Policy 2 Price: $%.2f\n", policy2.calculatePolicyPrice());
    }
}
