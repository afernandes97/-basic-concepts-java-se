package tryCatchExamples.TryCatchTest.model.exceptions;

//creating custom exceptions, using RunTimeException (using RuntimeException for compilation not handle this),
//if using extends Exception, compiler will ask to handle it

public class DomainException extends Exception{

    //using exception the domainException will be serializable and must have an id
    private static final long serialVersionUID = 1L;

    //allow the domainException be likely to instantiate
    public DomainException(String msg){
        super(msg);
    }

}
