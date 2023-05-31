package pracctice_java;

public class Revarse_StringAn_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="DEVANDALA PALLI";
char[]obj=str.toCharArray();
for(int i=str.length()-1;i>=0;i--)
{
System.out.println(obj[i]);	
}
	}

}
