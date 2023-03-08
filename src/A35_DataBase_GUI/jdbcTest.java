package A35_DataBase_GUI;

import java.sql.*;

public class jdbcTest {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:1428/cuonline","root","Dsaq@786");
            statement=connection.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM users");

            while (resultSet.next()){
                System.out.println(resultSet.getInt("id") +"||" +resultSet.getString("username")+"||"+resultSet.getString("password")+"||"+resultSet.getString("city")
                        +"||"+resultSet.getString("email")+"||"+resultSet.getString("address")
                        +"||"+resultSet.getString("subjects")+"||"+resultSet.getString("gender")+"\n");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            try {
                connection.close();
                statement.close();
                resultSet.close();
            }
            catch (SQLException e1){
                e1.printStackTrace();
            }
        }
    }
}
