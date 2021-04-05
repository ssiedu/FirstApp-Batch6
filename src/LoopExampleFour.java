
public class LoopExampleFour {

	public static void main(String[] args) {

		int x[][]= {{10,20},{30,40},{40,50},{60,70}};
		
		
		for(int tmp[]:x) {
			for(int num:tmp) {
				System.out.print(num+"\t");
			}
			System.out.println();
		}
		
		
		/*
		for(int r=0; r<3; r++) {
			for(int c=0; c<3; c++) {
				System.out.print(x[r][c]+"\t");
			}
			System.out.println();
		}
		*/
		

	}

}
