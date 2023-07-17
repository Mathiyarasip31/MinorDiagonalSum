import java.util.Scanner;

public class MinorDiagonalSum {
        static void Sum(int[][] array, int n, int m)
        {
            int sum=0;
            int i=0,j=n-1;
            while(i<n && j>=0)
            {
                sum=sum+array[i][j];
                i++;
                j--;
            }
            System.out.println(sum);
        }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n=scanner.nextInt();
        System.out.println("Enter number of columns");
        int m=scanner.nextInt();
        System.out.println("Enter elements");
        int array[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                array[i][j]=scanner.nextInt();
            }
        }
        Sum(array,n,m);
    }
}

