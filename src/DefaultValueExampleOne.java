
public class DefaultValueExampleOne {

	static int v1;
	static double v2;
	static boolean v3;
	static String v4;

	public void show()
	{
		int v5=0;
		System.out.println(v1);		
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
	}

	public static void main(String args[])
	{
		DefaultValueExampleOne ob=new DefaultValueExampleOne();
		ob.show();
	}
}
