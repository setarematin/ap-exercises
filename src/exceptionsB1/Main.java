package exceptionsB1;

public class Main {

    public static void main(String[] args) {
        try {
            someMethod();
        }
        catch (SomeException e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void someMethod() throws SomeException {
        try {
            someMethod2();
        }
        catch (SomeException e)
        {
            throw e;
        }
    }
    public static void someMethod2() throws SomeException{
        throw new SomeException("method2 exception");
    }
}
