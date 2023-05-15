import java.sql.*;//import the sql package to perform the database connectivity
public class TableCreation
{
  public static void main(String args[])throws Exception
  {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/politics","root", "0000");
    if(con!=null)
      System.out.println("Database connected");
    //creating statement object
    Statement st=con.createStatement();
    String query="create table Assembly(areacode varchar(10),mla varchar(20),population integer(6))";
    //Execute the query
    //as we used create statement in the above line, create can only be used in executeUpdate();
    st.executeUpdate(query);
    System.out.println("Query executed successfully!");
  }
}