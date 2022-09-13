import java.util.Scanner;
public class Lat2soal5
{
    public static void main(String arg[])
    {
        Scanner input = new Scanner(System.in);
        int x ;
        int i ;
        System.out.println(" ");
        for (i=0;i<11;i++)
        {
            if(i%3==0) 
            {
                System.out.print("");
            }
            else{
                x=2*i;
                System.out.print(" " + x);
            }
        }
    }
}
