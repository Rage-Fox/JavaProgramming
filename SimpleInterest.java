import java.io.*;
public class SimpleInterest {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int p,t,r;
        float i;
        p=Integer.parseInt(br.readLine());
        t=Integer.parseInt(br.readLine());
        r=Integer.parseInt(br.readLine());
        i=(float)(p*t*r)/100;
        System.out.println(i);
    }
}
/*
25000
14
7
24500.0
*/