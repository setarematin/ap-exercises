package inheritanceB1;

/**
 * Created by sity on 29/10/2019.
 */
public class TestShape {
    public static void main(String[] args) {
        Square rec = new Square ();
      testSquare (rec);
    }
    public static void testSquare(Square a){
    a.show();
     if ( a instanceof Rectangle) {
         System.out.println("yes");
         ((Rectangle) a).salam();
     }
     }

}
