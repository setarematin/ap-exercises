package inheritanceA1;

import inheritanceA1.Person;

/**
 * Created by sity on 29/10/2019.
 */
public class Student extends Person {
    enum status{
        FRESHMAN,
        SOPHOMOR,
        JUNIOR,
        SENIOR
    }

    @Override
    public String toString() {
        String name="";
        if (getName()!= null)
            name = getName();
        return getClass().getName() + " " + name ;
    }
}
