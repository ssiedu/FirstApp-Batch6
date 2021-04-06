
public class LabelExampleTwo {

	public static void main(String[] args) {
		p: 
		for (int i = 1; i <= 5; i++) {
			
			 q:
			 for (int j = 1; j <= 5; j++) {

				if (j == 3)
					continue p;

				System.out.println(j);
			}

		}

	}

}
