package LLD_CWA.Visitor_Pattern;

import LLD_CWA.Visitor_Pattern.Patient.AdultPatient;
import LLD_CWA.Visitor_Pattern.Patient.ChildPatient;
import LLD_CWA.Visitor_Pattern.Patient.IPatient;
import LLD_CWA.Visitor_Pattern.Patient.PatientType;
import LLD_CWA.Visitor_Pattern.Visitor.BillingVisitor;
import LLD_CWA.Visitor_Pattern.Visitor.IVisitor;
import LLD_CWA.Visitor_Pattern.Visitor.NurseVisitor;

public class VisitorDemo {
    public static void main(String[] args) {
        IPatient[] patients = {
                new ChildPatient(PatientType.CHILD),
                new AdultPatient(PatientType.ADULT)
        };

        IVisitor[] visitors = {
                new NurseVisitor(),
                new BillingVisitor()
        };

        for(IPatient p: patients){
            for(IVisitor v: visitors){
                p.accept(v);
            }
        }
    }
}
