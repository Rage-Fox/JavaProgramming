import java.sql.*;
class JDBCConnectionDemo{
    public static void main(String args[]) throws Exception
    {
        try
        {
            //the below two lines are very important to connect the database to java.
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tse2025", "root", "0000");
            if(con!=null)
            {
                System.out.println("Database Connected!");
            }
            else
            {
                System.out.println("Database Not Connected!");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}