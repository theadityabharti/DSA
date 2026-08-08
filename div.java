import java.util.Scanner;

public class div 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);

        String str = sc.nextLine();

        int num = Integer.valueOf(str);
        
        int len = str.length();

        int count=0;

        int ref;
        int real=num;
        while (num>0)
        {
            ref = num%10;
            if(real%ref==0){
                count++;
            }
            num/=10;
        }
        System.out.print(count);

    }
}