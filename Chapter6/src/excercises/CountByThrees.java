package excercises;

public class CountByThrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 3; i <= 300; i = i + 3) {
			System.out.print(" " + i);
			if(i % 30 == 0) {
				System.out.println();
			}
		}
	}

}
