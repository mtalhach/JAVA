package A35_DataBase_GUI;

import java.sql.*;

public class jdbcTest_Update {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;

        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:1428/cuonline","root","Dsaq@786");
            statement=connection.createStatement();
            int num=statement.executeUpdate("UPDATE users SET username='Ali' , email='ali@gmail.com' WHERE id=3");
            System.out.println(num +"Rows Updated");


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            try {
                connection.close();
                statement.close();
            }
            catch (SQLException e1){
                e1.printStackTrace();
            }
        }
    }
}
