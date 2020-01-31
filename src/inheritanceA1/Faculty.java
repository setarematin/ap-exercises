package inheritanceA1;

/**
 * Created by sity on 29/10/2019.
 */
public class Faculty extends Employee {
    private int officehours;
    private int rank;
    public int getOfficehours(){
        return officehours;
    }
    public int getRank(){
        return rank;
    }
    public void setOfficehours(int officehours){
        this.officehours=officehours;
    }
    public void setRank(int rank){
        this.rank=rank;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +" " + getName();
    }
}
