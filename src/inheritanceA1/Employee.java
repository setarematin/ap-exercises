package inheritanceA1;

/**
 * Created by sity on 29/10/2019.
 */
public class Employee extends Person {
    private String office;
    private int salary;
    private String data;
    public String getOffice(){
        return office;
    }
    public String getData(){
        return data;
    }
    public int getSalary(){
        return salary;
    }
    public void setOffice(String office){
        this.office=office;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public void setData(){
        this.data=data;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + getName();
    }
}
