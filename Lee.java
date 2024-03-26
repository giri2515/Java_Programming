import java.util.*;
public class Lee {

	public static void main(String[] args) {
		Random random = new Random();
		int i = random.nextInt(101);
		int a = 0;
		int b = 0;
		while (true) {
			System.out.println("정답을 추측하여 보시오.");
			Scanner input = new Scanner(System.in);
			a = input.nextInt();
			b = b+1;
			if (a==i) {
				System.out.println("축하합니다. 시도횟수 =" + b);
				break;
			}
		
		else if(a<i) {
			System.out.println("High");
			
		}
		else if(a>i) {
			System.out.println("Low");
		}
		}

	}

}
