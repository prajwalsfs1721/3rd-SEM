import java.util.Scanner;

class mul
{
    public static void main(String args[])
     {
         int arr1[][]=new int[3][3];
         int arr2[][]=new int[3][3];
         int arr3[][]=new int[3][3];
        Scanner sc=new Scanner(System.in); 
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
            arr1[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
            arr2[i][j]=sc.nextInt();

            }
        }
        for(int k=0;k<3;k++)
        {for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr3[k][i]= arr3[k][i]+arr1[k][j]*arr2[j][i];
            }
        }}
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
           System.out.print(arr3[i][j]+" ");
            }
            System.out.println("");
        }      
    }

    }