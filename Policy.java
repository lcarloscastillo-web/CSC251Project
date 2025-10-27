public class Policy {
    
    private String policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String smokingStatus;
    private double policyholderHeight;
    private double policyholderWeight;
    
    /**
     * Default constructor that initializes all fields to default values
     */
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
    
    /**
     * Parameterized constructor that initializes all fields with provided values
     * @param policyNumber the policy number
     * @param providerName the provider name
     * @param firstName the policyholder's first name
     * @param lastName the policyholder's last name
     * @param age the policyholder's age
     * @param smokingStatus the policyholder's smoking status
     * @param height the policyholder's height in inches
     * @param weight the policyholder's weight in pounds
     */
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
    
    /**
     * Sets the policy number
     * @param policyNumber the policy number to set
     */
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
    
    /**
     * Sets the provider name
     * @param providerName the provider name to set
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
    
    /**
     * Sets the policyholder's first name
     * @param firstName the first name to set
     */
    public void setPolicyholderFirstName(String firstName) {
        this.policyholderFirstName = firstName;
    }
    
    /**
     * Sets the policyholder's last name
     * @param lastName the last name to set
     */
    public void setPolicyholderLastName(String lastName) {
        this.policyholderLastName = lastName;
    }
    
    /**
     * Sets the policyholder's age
     * @param age the age to set
     */
    public void setPolicyholderAge(int age) {
        this.policyholderAge = age;
    }
    
    /**
     * Sets the policyholder's smoking status
     * @param smokingStatus the smoking status to set
     */
    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }
    
    /**
     * Sets the policyholder's height
     * @param height the height in inches to set
     */
    public void setPolicyholderHeight(double height) {
        this.policyholderHeight = height;
    }
    
    /**
     * Sets the policyholder's weight
     * @param weight the weight in pounds to set
     */
    public void setPolicyholderWeight(double weight) {
        this.policyholderWeight = weight;
    }
    
    /**
     * Returns the policy number
     * @return the policy number
     */
    public String getPolicyNumber() {
        return policyNumber;
    }
    
    /**
     * Returns the provider name
     * @return the provider name
     */
    public String getProviderName() {
        return providerName;
    }
    
    /**
     * Returns the policyholder's first name
     * @return the policyholder's first name
     */
    public String getPolicyholderFirstName() {
        return policyholderFirstName;
    }
    
    /**
     * Returns the policyholder's last name
     * @return the policyholder's last name
     */
    public String getPolicyholderLastName() {
        return policyholderLastName;
    }
    
    /**
     * Returns the policyholder's age
     * @return the policyholder's age
     */
    public int getPolicyholderAge() {
        return policyholderAge;
    }
    
    /**
     * Returns the policyholder's smoking status
     * @return the policyholder's smoking status
     */
    public String getSmokingStatus() {
        return smokingStatus;
    }
    
    /**
     * Returns the policyholder's height in inches
     * @return the policyholder's height in inches
     */
    public double getPolicyholderHeight() {
        return policyholderHeight;
    }
    
    /**
     * Returns the policyholder's weight in pounds
     * @return the policyholder's weight in pounds
     */
    public double getPolicyholderWeight() {
        return policyholderWeight;
    }
    
    /**
     * Calculates and returns the BMI of the policyholder
     * BMI = (Weight * 703) / (Height^2)
     * @return the calculated BMI value
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
     * @return the calculated policy price
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
