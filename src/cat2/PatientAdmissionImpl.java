package cat2;

public class PatientAdmissionImpl implements PatientAdmission {

	@Override
	public void providePersonalInformation(String personalInfo) {
		// TODO Auto-generated method stub
		System.out.println("Name: "+ personalInfo);
	}

	@Override
	public void provideMedicalHistory(String medicalHistory) {
		// TODO Auto-generated method stub
		System.out.println(medicalHistory);
	}

	@Override
	public void provideInsuranceDetails(String insuranceDetails) {
		// TODO Auto-generated method stub
		System.out.println(insuranceDetails);
	}

	@Override
	public boolean processPayment(Payment payment) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public double calculateEstimatedCost(PatientAdmission patientAdmission) {
		// TODO Auto-generated method stub
		return 600;
	}

	@Override
	public double updateBillingInformation(PatientAdmission patientAdmission) {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public void confirmAdmission(String admissionNumber) {
		// TODO Auto-generated method stub
		System.out.println(admissionNumber);
	}

	@Override
	public void sendConfirmationEmail(String email) {
		// TODO Auto-generated method stub
		System.out.println(email);
	}
    // Implement methods for each interface
    // ...

	@Override
	public void generateReceipt(Payment payment) {
		// TODO Auto-generated method stub
		System.out.println("Receipt generated");
	}

	@Override
	public void addpaymentinfo(String paymentinfo) {
		// TODO Auto-generated method stub
		System.out.println(paymentinfo);
	}
}