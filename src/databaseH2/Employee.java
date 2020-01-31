package databaseH2;

/**
 * Created by sity on 31/01/2020.
 */
public class Employee {
    private String code;
    private String name;
    private String father;
    private String nationalID;
    private String state;
    private int age;
    private double salary;
    private int experience;

    public Employee(String code, String name, String father, String nationalID, String state, int age, double salary, int experience) {
        this.code = code;
        this.name = name;
        this.father = father;
        this.nationalID = nationalID;
        this.state = state;
        this.age = age;
        this.salary = salary;
        this.experience = experience;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
