package DataBase_GUI;

import java.sql.*;

public class jdbcTest_Insert {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;

        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:1428/cuonline","root","Dsaq@786");
            statement=connection.createStatement();
            int num=statement.executeUpdate("INSERT INTO users(username,password,city,email,address,subjects,gender) VALUES('Hanzla','pak123','Gujrat','hanzla@gmail.com','Lahore','web','Male') ");
            System.out.println("Rows Inserted");


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
