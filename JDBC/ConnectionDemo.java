import java.sql.*;//import the sql package to perform the database connectivity
class ConnectionDemo
{
  /*
  Steps involved in Database Connection:
  1) Register the driver
      Class.forName("com.mysql.cj.jdbc.Driver");
  2) Establish the connection
      Connection con=DriverManager.getConnection(url,username,password);
      ex: Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledatabasename","username","password");
  3) Create the statement object
      Statement st=con.createStatement();
  4) Execute the Query
      st.executeUpdate("insert into tablename values(101,'Ravi',50000)");
      st.executeQuery("select * from employee");//this will only be used for select queries
  5) Close the connection
      con.close();
  */
  public static void main(String args[])throws Exception
  {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/politics","root", "0000");
    if(con!=null)
      System.out.println("Database connected");
    else
      System.out.println("Not Connected");
  }
}