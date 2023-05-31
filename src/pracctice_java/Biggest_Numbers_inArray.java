package pracctice_java;

public class Biggest_Numbers_inArray
{

	public static void main(String[] args)
	{
		int []obj= {50,20,30,41,51};
		int big=0;
		for(int i=0;i<=obj.length-1;i++)
		{
			if(obj[i]>big)
			{
				big=obj[i];
		}
	}
	System.out.println("Biggest number an Arry"+big);
	}

}
