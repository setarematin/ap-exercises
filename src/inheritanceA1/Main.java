package inheritanceA1;

import java.rmi.StubNotFoundException;

/**
 * Created by sity on 29/10/2019.
 */
public class Main {
    public static void main(String[] args){
        Person person = new Person();
        Employee employee= new Employee();
        employee.setName("setare");
        Faculty faculty = new Faculty();
        Staff staff = new Staff();
        System.out.println(person.getName());
        System.out.println(employee.toString());
        System.out.println(faculty);
        System.out.println(staff);

    }
}
