package LLD_CWA.Visitor_Pattern.Patient;

import LLD_CWA.Visitor_Pattern.Visitor.IVisitor;

public class AdultPatient implements IPatient{
    PatientType type;
    public AdultPatient(PatientType type){
        this.type = type;
    }

    @Override
    public void accept(IVisitor visitor) {
        // Double Dispatch
        visitor.visit(this);
    }

    @Override
    public PatientType getPatientType() {
        return this.type;
    }
}
