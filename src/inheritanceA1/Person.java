package inheritanceA1;

/**
 * Created by sity on 29/10/2019.
 */
public class Person {
    private String name;
    private String phonenumber;
    private String address;
    private String email;
    int id;
    public Person(){

    }


    public String getName(){
        return this.name;
    }
    public String getPhonenumber(){
        return this.phonenumber;
    }
    public String getAddress() {
        return this.address;
}
    public String getEmail(){
        return this.email;
}
    public void setName(String name){
        this.name=name;
    }
    public void setPhonenumber(String phonenumber){
        this.phonenumber=phonenumber;
    }
    public void setAddress(String address){
        this.address=address;
    }
public void  setEmail(String email){
        this.email=email;
}

    @Override
    public String toString() {
        return getClass().getSimpleName()+ " " + getName();
    }
}
