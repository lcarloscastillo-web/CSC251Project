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
    
    /**
     * Returns the policyholder's age
     */
    public int getPolicyholderAge() {
        return policyholderAge;
    }
    
    /**
     * Returns the policyholder's smoking status
     */
    public String getSmokingStatus() {
        return smokingStatus;
    }
    
    /**
     * Returns the policyholder's height in inches
     */
    public double getPolicyholderHeight() {
        return policyholderHeight;
    }
    
    /**
     * Returns the policyholder's weight in pounds
     */
    public double getPolicyholderWeight() {
        return policyholderWeight;
    }
    
    /**
     * Calculates and returns the BMI of the policyholder
     * BMI = (Weight * 703) / (Height^2)
     */
    public double calculateBMI() {
        if (policyholderHeight == 0) {
            return 0; // Avoid division by zero
        }
        return (policyholderWeight * 703) / (policyholderHeight * policyholderHeight);
    }
    
    /**
     * Calculates and returns the price of the insurance policy
     * Base fee: $600
     * Age > 50: +$75
     * Smoker: +$100
     * BMI > 35: + (BMI - 35) * 20
     */
    public double calculatePolicyPrice() {
        double baseFee = 600.0;
        
        // Additional fees
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
}
