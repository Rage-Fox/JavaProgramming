import java.util.*;;
public class BookInformationUsingClasses {
    String bid,bname,author;
    int no_of_pages;
    double cost;
    Scanner sc=new Scanner(System.in);
    public void get_book_info()
    {
        bid=sc.nextLine();
        bname=sc.nextLine();
        author=sc.nextLine();
        no_of_pages=sc.nextInt();
        cost=sc.nextDouble();
    }
    public void show_book_info()
    {
        System.out.println(bid+" "+bname+" "+author+" "+no_of_pages+" "+cost);
    }
    public static void main(String args[])
    {
        BookInformationUsingClasses b1=new BookInformationUsingClasses();
        b1.get_book_info();
        b1.show_book_info();
    }
}
