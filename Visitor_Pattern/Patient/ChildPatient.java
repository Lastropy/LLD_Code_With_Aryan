package LLD_CWA.Visitor_Pattern.Patient;

import LLD_CWA.Visitor_Pattern.Visitor.IVisitor;

public class ChildPatient implements IPatient{
    PatientType type;
    public ChildPatient(PatientType type){
        this.type = type;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public PatientType getPatientType() {
        return this.type;
    }
}
