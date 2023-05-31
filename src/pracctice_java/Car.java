package pracctice_java;

public class Car {

	public static void main(String[] args) 
	{
int[]obj= {10,30,40,20,30};
for(int i=0;i<=obj.length-1;i++)
{
	for(int j=i+1;j<=obj.length-1;j++)
	{
		if(obj[i]==obj[j])
		{
			System.out.println("duplicate an Arrya"+obj[i]);
		}
	}
}
	}

}
