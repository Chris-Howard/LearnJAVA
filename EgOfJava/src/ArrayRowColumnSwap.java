import java.util.Scanner;

public class ArrayRowColumnSwap
{

    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	ArrayRowColumnSwap arcsArrayRowColumnSwap =new ArrayRowColumnSwap();

    }

 

    public ArrayRowColumnSwap()
    {
	int m = 0;
	int n = 0;
	int x, y;
	//
	System.out.println("请输入矩阵行数和列数，用空格隔开");
	Scanner input = new Scanner(System.in);
	x = input.nextInt();
	y = input.nextInt();

	m = x;
	n = y;

	double arr[][] = new double[m][n];
	System.out.println("请输入矩阵，用空格隔开");
	for (int i = 0; i < m; i++)
	{
	    for (int j = 0; j < n; j++)
	    {
		arr[i][j] = input.nextDouble();
	    }
	}
	double arr2[][] = new double[arr[0].length][arr.length];
	for (int i = 0; i < m; i++)
	{
	    for (int j = 0; j < n; j++)
	    {
		arr2[j][i]=arr[i][j];
	    }
	}
	System.out.println("转置后的矩阵为：");
	for (int i = 0; i < arr2.length; i++)
	{
	    for (int j = 0; j < arr2[0].length; j++)
	    {
		System.out.print(arr2[i][j]+" ");
	    }
	    System.out.println();
	}
	
    }

}
