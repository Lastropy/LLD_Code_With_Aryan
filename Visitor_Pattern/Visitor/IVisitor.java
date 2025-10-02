package LLD_CWA.Visitor_Pattern.Visitor;

import LLD_CWA.Visitor_Pattern.Patient.IPatient;

public interface IVisitor {
    void visit(IPatient patient);
}
