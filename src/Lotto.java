import java.util.Random;

public class Lotto {

	/**
	 * @param args
	 * �ν��Ͻ� ����
	 */
	public static void main(String[] args) {	
		new Lotto().printLotto();	
	}
	public void printLotto() {
		for (int i= 0; i< 6; i++){
			System.out.println(getNumber(random) + 1);
		}
	}
	
	Random random = new Random();
	private int getNumber(Random random) {
		return random.nextInt(45);
	}

}
