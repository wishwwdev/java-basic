package basicPractice;

import java.util.Scanner;

class ExchangeRateInformation {
	
	String monetaryUnit;
	double exchangeRate;
	
	ExchangeRateInformation(){}
	
	ExchangeRateInformation(String monetaryUnit, double exchangeRate){
		this.monetaryUnit = monetaryUnit;
		this.exchangeRate = exchangeRate;
	}
	
}

public class CurrencyExchange03 {
	
	static ExchangeRateInformation[] exchangeRateArray;
	
	static ExchangeRateInformation exchangeRateInformation;
	
	static String inputMonetaryUnit;
	static int inputAmount;
	
	static void initExchangeRateArray() {
		exchangeRateArray = new ExchangeRateInformation[] {
				new ExchangeRateInformation("달러", 1307.5),
				new ExchangeRateInformation("엔", 9.32),
				new ExchangeRateInformation("위안", 183.78)
		};
	}
	
	static void inputMonetaryUnit() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("화폐 단위를 입력하세요. ('종료' 입력시 프로그램 종료)");
		inputMonetaryUnit = scanner.nextLine();
		
		if (inputMonetaryUnit.equals("종료")) inputMonetaryUnit = null;
		
	}
	
	static void findByMonetaryUnit() {
		for (ExchangeRateInformation item: exchangeRateArray) {
			if (item.monetaryUnit.equals(inputMonetaryUnit)) {
				exchangeRateInformation = item;
				break;
			}
		}
	}
	
	static void inputAmount() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("금액을 입력하세요. (금액은 0보다 큰 정수이어야 합니다.");
		inputAmount = scanner.nextInt();
	}	
	
	static void calculationAmount() {
		double resultAmount = inputAmount * exchangeRateInformation.exchangeRate;
		System.out.println(resultAmount + "원");
	}

	public static void main(String[] args) {
		
		initExchangeRateArray();
		
		while(true) {
			inputMonetaryUnit();
			if (inputMonetaryUnit == null) break;
			
			findByMonetaryUnit();
			if (exchangeRateInformation == null) {
				System.out.println("잘못된 화폐 단위입니다.");
				continue;
			}
			
			inputAmount();
			if (inputAmount <= 0) {
				System.out.println("금액을 0보다 커야합니다.");
				continue;
			}
			
			calculationAmount();	
			
		}
		
		System.out.println("프로그램 종료!");
		
	}

}
