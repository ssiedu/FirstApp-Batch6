
public class TypeConversionExample {

	public static void main(String[] args) {

		//case-1 (types are same)
			int v1=10;
			double v2=4.5;
			
		//case-2-a (types diff but no error)
			double v3=5;
			System.out.println(v3-4);
			long v4=25;
			
		//case-2-b (types diff / lossy conversion)
			int v5=(int) 5.6;
			float  v6=(float) 1.2;
			
		//case-2-c (types diff / conversion not allowed)
			//double v7=true;
			//boolean v8=1;

		//case-3 (assigning a fp value to integral-var
			long v=(long) 2.5f;
			
			
	}

}
