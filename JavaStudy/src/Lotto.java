import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> lotto = new TreeSet<Integer>();
		Random rnd = new Random();
		System.out.println("할 게임의 수를 입력하시오 : ");
		int game = sc.nextInt();
		
		for(int i = 0; i < game; i++) {
			System.out.println((i+1) + "번째 게임");
			lotto.clear();
			while(lotto.size()<=6) {
				lotto.add(rnd.nextInt(45)+1);
			}
			
			for(int result : lotto) {
				System.out.print(result + " ");
			}
			System.out.println();
		}
	}

}
