package tryCatchExamples.TryCatchTest2.model.exceptions;

public class DomainException extends Exception {

    //using exception the domainException will be serializable and must have an id
    private static final long serialVersionUID = 1L;

    //allow the domainException be likely to instantiate
    public DomainException(String msg) {
        super(msg);
    }
}
