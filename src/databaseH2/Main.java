package databaseH2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by sity on 31/01/2020.
 */
public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<Employee> employees = new ArrayList<>();

            Class.forName("oracle.jdbc.driver.OracleDriver");
            // for old versions of JDBC
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "setare", "adminadmin");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into employees (id, code, name, father, nationalID, state, age, salary, experience) values (?,?,?,?,?,?,?,?,?)");
            int i =1;
            for (Employee employee: employees) {
                preparedStatement.setLong(1, i++);
                preparedStatement.setString(2, employee.getCode());
                preparedStatement.setString(3, employee.getName());
                preparedStatement.setString(4, employee.getFather());
                preparedStatement.setString(5, employee.getNationalID());
                preparedStatement.setString(6, employee.getState());
                preparedStatement.setInt(7, employee.getAge());
                preparedStatement.setDouble(8, employee.getSalary());
                preparedStatement.setInt(9, employee.getExperience());

                preparedStatement.executeUpdate();
                preparedStatement.close();
                connection.close();
            }
        }
        catch (ClassNotFoundException e){

        }
        catch (SQLException e){

        }
    }
}
