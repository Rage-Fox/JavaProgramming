interface databaseconnect
{
    void getConnection();
    void executeQuery();
    void showResults();
    void close();
}
class MySQL implements databaseconnect
{
    public void getConnection()
    {
        System.out.println("Connect with MySQL database");
    }
    public void executeQuery()
    {
        System.out.println("Query executed in MySQL database");
    }
    public void showResults()
    {
        System.out.println("MySQL will display the results");
    }
    public void close()
    {
        System.out.println("Close the connection with MySQL");
    }
}
class Oracle implements databaseconnect
{
    public void getConnection()
    {
        System.out.println("Connect with Oracle database");
    }
    public void executeQuery()
    {
        System.out.println("Query executed in Oracle database");
    }
    public void showResults()
    {
        System.out.println("Oracle will display the results");
    }
    public void close()
    {
        System.out.println("Close the connection with Oracle");
    }
}
public class DatabaseDemo {
    public static void main(String args[])
    {
        databaseconnect d;
        d=new MySQL();
        d.getConnection();
        d.executeQuery();
        d.showResults();
        d.close();
        d=new Oracle();
        d.getConnection();
        d.executeQuery();
        d.showResults();
        d.close();
    }
}
