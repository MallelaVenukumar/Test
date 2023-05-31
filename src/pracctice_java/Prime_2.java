package pracctice_java;

public class Prime_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=8;
Boolean flag=false;
for(int i=2;i<=n-1;i++)
{
	if(n%i==0)
	{
		flag=true;
		break;
}
}
if(flag)
{
	System.out.println("The given number is not prime"+n);
}
else
{
System.out.println("The given number is a prime"+n);	
}
	}

}
