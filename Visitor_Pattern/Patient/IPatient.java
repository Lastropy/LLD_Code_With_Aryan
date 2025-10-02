package LLD_CWA.Visitor_Pattern.Patient;

import LLD_CWA.Visitor_Pattern.Visitor.IVisitor;

public interface IPatient {
    void accept(IVisitor visitor);
    PatientType getPatientType();
}
