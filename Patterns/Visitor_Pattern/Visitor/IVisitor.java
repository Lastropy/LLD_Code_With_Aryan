package LLD_CWA.Patterns.Visitor_Pattern.Visitor;

import LLD_CWA.Patterns.Visitor_Pattern.Patient.IPatient;

public interface IVisitor {
    void visit(IPatient patient);
}
