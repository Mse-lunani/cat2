package cat2;

public interface BillingSystem {
	double calculateEstimatedCost(PatientAdmission patientAdmission);
    double updateBillingInformation(PatientAdmission patientAdmission);
}
