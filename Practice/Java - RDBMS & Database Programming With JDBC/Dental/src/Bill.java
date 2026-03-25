public class Bill {
    private int billId;
    private Patient patient;
    private double serviceCost;
    private double medicationCost;
    private double taxRate = 0.18;

    public Bill(int billId, Patient patient, double serviceCost, double medicationCost) {
        this.billId = billId;
        this.patient = patient;
        this.serviceCost = serviceCost;
        this.medicationCost = medicationCost;
    }

    public double calculateTotal() {
        double subtotal = serviceCost + medicationCost;
        double tax = subtotal * taxRate;
        // Applying discount based on the patient's insurance rate
        double discount = subtotal * patient.getInsuranceDiscount();
        
        double finalTotal = subtotal + tax - discount;
        return Math.max(0, finalTotal); // Ensure no negative bills
    }
}