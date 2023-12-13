package cat2;

//Example usage
public class HospitalProcess {
 public static void main(String[] args) {
     // Receptionist initiates admission
     PatientAdmission patientAdmission = new PatientAdmissionImpl();
     
     // Patient provides information
     System.out.println("Getting info");
     patientAdmission.providePersonalInformation("John Doe");
     patientAdmission.provideMedicalHistory("Meidcal history: infected with cholera before");
     patientAdmission.provideInsuranceDetails("Insurance: ABC");
     
     // Billing system calculates estimated cost
     double estimatedCost = patientAdmission.calculateEstimatedCost(patientAdmission);
     System.out.println("Estimated cost: " + estimatedCost);
     
     //adding payment info
     patientAdmission.addpaymentinfo("Mpesa no: 0712345678");
     
     // system payment information
     Payment payment = new Payment();
     boolean isPaymentValid = patientAdmission.processPayment(payment);
     System.out.println("Validity status: " + isPaymentValid);
     
     
     // If payment is valid, generate receipt
     if (isPaymentValid) {
         patientAdmission.generateReceipt(payment);
     }
     
     // Receptionist confirms admission
     patientAdmission.confirmAdmission("Admision no: Admission123");
     
     // Patient goes through the consultation process
     // ...
     
     // Billing system updates billing information
     double totalcost =  patientAdmission.updateBillingInformation(patientAdmission);
     System.out.println("Updated cost: " + totalcost);
     
     // Receptionist sends confirmation email
     patientAdmission.sendConfirmationEmail("email sent to : johndoe@email.com");
     
     // Patient receives drugs from the pharmacy and leaves
     // ...
 }
}

