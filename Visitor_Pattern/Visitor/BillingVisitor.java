package LLD_CWA.Visitor_Pattern.Visitor;

import LLD_CWA.Visitor_Pattern.Patient.IPatient;
import LLD_CWA.Visitor_Pattern.Patient.PatientType;

public class BillingVisitor implements IVisitor{
    @Override
    public void visit(IPatient patient) {
        if(patient.getPatientType() == PatientType.ADULT){
            System.out.println("Billing Adult Patient");
        } else if(patient.getPatientType() == PatientType.CHILD){
            System.out.println("Billing Child Patient");
        }
    }
}
