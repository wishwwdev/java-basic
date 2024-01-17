package basicPractice;

import java.util.Scanner;

public class CurrencyExchange02 {

	public static void main(String[] args) {
		final String[] MONETARY_UNIT_LIST = {"달러", "엔", "위안"};
		final double[] EXCHANGE_RATE_LIST = {1307.5, 9.32, 183.78};
		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("화폐 단위를 입력하세요. ('종료' 입력시 프로그램 종료)");
			
			String inputMonetaryUnit = scanner.nextLine();
			if (inputMonetaryUnit.equals("종료")) break;
			
			boolean existedMonetaryUnit = false;
			
//			for(String monetaryUnit : MONETARY_UNIT_LIST) {			// foreach문을 사용한 것임
//				if (monetaryUnit.equals(inputMonetaryUnit)) {		// 단순히 변수의 값을 읽는 것이기 때문에
//					existedMonetaryUnit = true;						// 귀찮게 아래처럼 일반for문을 사용할 필요가 없음
//					break;
//				}
//			}
			int index = 0;
			for (; index < MONETARY_UNIT_LIST.length; index++) {			// 일반for문을 사용
				if (MONETARY_UNIT_LIST[index].equals(inputMonetaryUnit)) {	// 단순히 입력한 화폐단위가 리스트안에
					existedMonetaryUnit = true;								// 있는지 확인하려면 foreach문을 
					break;													// 사용하는게 효율적이지만
				}															// 다음 결과값을 계산하기 위해서 
			}																// index값을 찾아 환율리스트에서 값을
																			// 가져와야 되기 때문에 index값을 찾기위해
																			// 일반for문을 살려놓은 것임
			
			if (!existedMonetaryUnit) {
				System.out.println("잘못된 화폐 단위입니다.");
				continue;
			}
			
			System.out.println("금액을 입력하세요. (금액은 0보다 큰 정수이어야합니다.");
			int inputAmount = scanner.nextInt();
			if (inputAmount <= 0) {
				System.out.println("금액을 0보다 커야합니다.");
				continue;
			}
			
			double resultAmount = inputAmount * EXCHANGE_RATE_LIST[index];	// 입력한 화폐단위가 리스트안에 있는지
			System.out.println(resultAmount + "원");							// 확인할 때, 찾은 index값을 사용함
			
		}
		
		System.out.println("프로그램 종료!");

	}

}