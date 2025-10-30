package JDBC;

import java.sql.*;

public class CreateJDBC {


    public static void main(String[] args) {

        System.out.println(System.getProperty("java.class.path"));

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try{
            //Step - 1 Loading the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.print("Driver is Loaded");

            //Step - 2 Establish Connection
            con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Learn;encrypt=false;",
                    "sa",
                    "admin@123"
            );
            System.out.println("Connection Established");

            //Step - 3 Statement Created
            stmt = con.createStatement();
            System.out.println("Statment medimum is created");

            //Step - 4 Querying
            String sql = "select * from Order";
            rs = stmt.executeQuery(sql);
            System.out.println("Query Excuted and result in java");

            //Step -5 Displaying the Result
            System.out.println(" Student_id || Student_name || Student_age || Student_Email");
            System.out.println("============================================================");
            while(rs.next()){
                System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3) + rs.getString(4));
            }
        }
        catch (Exception sq){
            sq.printStackTrace();
        }
        finally {
            try{
                con.close();
                rs.close();
                stmt.close();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
