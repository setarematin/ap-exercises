package databaseH1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by sity on 31/01/2020.
 */
public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<Student> students = new ArrayList<>();
            students.add(new Student("1234561", "stare", 98, 19.5));
            students.add(new Student("1234562", "mehdi", 93, 19));
            students.add(new Student("1234563", "gholam", 92, 18));
            students.add(new Student("1234564", "sakine", 90, 17));
            students.add(new Student("1234565", "java", 80, 16.4));
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // for old versions of JDBC
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "setare", "adminadmin");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into students (id,code, name, year, moadel) values (?,?,?,?,?)");
            int i =1;
            for (Student student: students) {
                preparedStatement.setLong(1, i++);
                preparedStatement.setString(2, student.code);
                preparedStatement.setString(3, student.name);
                preparedStatement.setInt(4, student.year);
                preparedStatement.setDouble(5, student.moadel);
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
