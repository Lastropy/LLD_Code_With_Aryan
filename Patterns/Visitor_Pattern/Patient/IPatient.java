package LLD_CWA.Patterns.Visitor_Pattern.Patient;

import LLD_CWA.Patterns.Visitor_Pattern.Visitor.IVisitor;

public interface IPatient {
    void accept(IVisitor visitor);

    PatientType getPatientType();
}
