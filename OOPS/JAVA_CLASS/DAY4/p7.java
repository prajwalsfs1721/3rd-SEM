/*
15
14      13
12      11      10
9       8       7       6
5       4       3       2       1*/

import java.util.Scanner;
class p7
{
    public static void main(String args[])
    {
        int n,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            c=c+i;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
        {
            System.out.print(c+"\t");
             c--;
        }
        System.out.println("");
        
    }
}
}