package pracctice_java;

public class Array2 {

	public static void main(String[] args) 
	{
int [][]obj=new int [2][3];

obj[0][0]=10;
obj[0][1]=20;
obj[0][2]=30;

obj[1][0]=100;
obj[1][1]=200;
obj[1][2]=300;


System.out.println(obj.length-1);
System.out.println(obj[0].length-1);
for (int i=0;i<=obj.length-1;i++)
{
	for(int j=0;j<=obj[0].length-1;i++)
	{
		System.out.println(obj[i][j]+" ");
	}
	System.out.println(" ");
      }
	}

}
