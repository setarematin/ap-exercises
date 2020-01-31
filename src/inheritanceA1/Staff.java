package inheritanceA1;

/**
 * Created by sity on 29/10/2019.
 */
public class Staff extends Employee {
    private String title;
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +" " + getName();
    }
}
