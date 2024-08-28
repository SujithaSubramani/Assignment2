
public class AbcStringMigration {
	
	public static void main(String args[])
	{
	String a = "abcdef";
	String b = "xyz1234";
	String c = "abcxy";
	
	int lena = a.length();
	int lenb = b.length();
	int lenc =c.length();
	if(lena > lenc && lena< lenb)
	{
		System.out.println("The length of string B is greater- first condition satisfied");
	}
	else
	{
		System.out.println("The 1st condition failed");	
	}
	if (a.equals(c) || a.equals(b))
	{
		System.out.println("second condition satisfied");
	}else
	{
		System.out.println("The 2nd condition failed");	
	}
	 if (c.equalsIgnoreCase(a))
	{
		System.out.println("condition 3 satisfied");
	}else
	{
		System.out.println("The 3rd condition failed");	
	}
	if(a.contains("cd")&& !a.contains("xz"))
	{
		System.out.println("condition 4 satisfied");
	}else
	{
		System.out.println("The 4th condition failed");	
	}
	String B = b.toUpperCase();
	if(B.contains("Z") && !B.contains("z"))
	{
		System.out.println("condition 5 satisfied");
	}else
	{
			System.out.println("The 5th condition failed");	
	}	
	if(lena> lenb && lena< lenc)
	{
		System.out.println("condition 6 satisfied");
	}else
	{
			System.out.println("The 6th condition failed");	
	}
	String convarD = a+b; // concatination using +
	int d = convarD.length();
	if(d<lenc || d>5)
	{
		System.out.println("condition 7 satisfied");
	}else
	{
		System.out.println("The 7th condition failed");	
	}
	if(a.startsWith("ab")&& !b.endsWith("yz"))
	{
		System.out.println("condition 8 satisfied");
	}else
	{
		System.out.println("The 8th condition failed");	
	}
	if(c.contains(" ") && !c.contains("9"))
	{
		System.out.println("condition 9 satisfied");
	}else
	{
		System.out.println("The 9th condition failed");	
	}
	
	}	
}
