package exceptionsA1;

public class Main {
    public static void main(String[] args) {
        try {
        SomeClass a = new SomeClass();
        }
        catch (SomeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
