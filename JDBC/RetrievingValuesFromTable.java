import java.sql.*;
public class RetrievingValuesFromTable {
    public static void main(String args[]) throws Exception
    {
        //ResultSet interface is used to store the records returned by the select query
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/politics","root", "0000");
        if(con!=null)
            System.out.println("Database connected");
        //creating statement object
        Statement st=con.createStatement();
        String query="select * from Assembly";
        ResultSet rs=st.executeQuery(query);//executeQuery for select statement
        //initially ResultSet will point the top of the set
        //rs.next() will moves the control to the next record
        //rs.getMethodName(Column number); where method name is a string or integer, column number starts from index 1
        while(rs.next())
        {
            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
        }
        System.out.println("Query executed successfully!");
    }
}
