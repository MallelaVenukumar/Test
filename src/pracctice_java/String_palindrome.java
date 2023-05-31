package pracctice_java;

public class String_palindrome {

	public static void main(String[] args) {
		String str1="MOM";
		String str2="MALAYALAM";
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
		}
		if(str1.equals(str2))
		{
			System.out.println("The given String is polindrome"+str1);
		}
		else
		{
			System.out.println("The given String is not polindrome " +str2);
		}
	}
}