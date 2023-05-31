package pracctice_java;

public class Duplicate_anArray
{
public static void main(String[] args) 
	{
    int[]obj= {15,30,22,15,32,30};
    for(int i=0;i<=obj.length-1;i++)
    {
    	for(int j=i+1;j<=obj.length-1;i++)
    	{
    		if (obj[i]==obj[j]);
    		{
    		System.out.println("duplicate an array"+obj[i]);
    	}
    }
    }
	}
}

