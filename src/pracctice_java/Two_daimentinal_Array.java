package pracctice_java;

public class Two_daimentinal_Array {

	public static void main(String[] args) {
		int [][]obj=new int[2][2];
		obj[0][0]=10;
		obj[0][1]=20;
		
		obj[1][0]=100;
		obj[1][1]=200;
		
		for (int i=0;i<=obj.length;i++)
		{
			for(int j=0;j<=obj[0].length-1;j++)
			{
				System.out.println(obj[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}

}
