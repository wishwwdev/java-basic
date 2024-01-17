package chapter4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

// Random Class
// 임의의 난수를 생성해주는 클래스
// 기본적으로 정수의 난수를 많이 생성하지만 실수 및 논리 값도 난수로 생성할 수 있음
public class RandomClass {

	public static void main(String[] args) {
		Random random1 = new Random();
		// 1. 정수의 난수 생성
		int randomInt = random1.nextInt();
		System.out.println(randomInt);
		// 2. 정수에 범위를 지정해서 난수 생성
		int randomInt2 = random1.nextInt(5);
		System.out.println(randomInt2);
		int randomInt3 = random1.nextInt(5, 10);
		System.out.println(randomInt3);
		// 3. 실수 및 논리 형태의 난수 생성
		double randomDouble = random1.nextDouble();
		System.out.println(randomDouble);
		boolean randomBoolean = random1.nextBoolean();
		System.out.println(randomBoolean);
		// 4. 난수 생성시의 시드 지정
		// 모든 프로그래밍 언어는 난수를 생성할 수 없음
		// 특정한 값을 기준으로 그 값의 연산 결과를 난수로 인식
		Random random2 = new Random(10);		// 괄호 안의 숫자가 달라지면 나오는 값도 달라짐. 
		int randomInt4 = random2.nextInt();		// 괄호 안에 1일때 10,3,5 이렇게 나오고, 8일때 6,3,7 이렇게 나온다면
		System.out.println(random2.nextInt());	// 다른 값을 넣었다 다시 1을 넣더라도 값은 10,3,5가 나옴
		System.out.println(random2.nextInt());	// 마찬가지로 다른 값을 넣었다 다시 8을 넣더라도 값은 6,3,7이 나옴
		System.out.println(random2.nextInt());
		System.out.println(random2.nextInt());
		System.out.println(random2.nextInt());
		
		// UUID
		// 16진수의 값으로 난수의 문자열을 만들어주는 클래스
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
		
		System.out.println("==========");
		
		// 연금복권 추첨
		// 1~5조 0~9까자의 중복을 허용한 수 6개
		// 1 0 1 8 8 3 2
		Random random = new Random();
		
		List<Integer> annuity = new ArrayList<>();
		for (int count = 0; count < 7; count++) {
			if (count == 0) {
				int jo = random.nextInt(5) + 1;			// random으로 0 ~ 4까지의 수를 뽑아내고 거기에 1더하기함
				annuity.add(jo);
				continue;
			}
			int number = random.nextInt(10);
			annuity.add(number);
		}
		
		for (int number: annuity) System.out.print(number + " ");
		System.out.println(" ");
		
		// 로또 추첨
		// 중복을 허용하지 않는 1~45까지의 수 6개
		// 4 8 20 21 43 45
		Set<Integer> lotto = new TreeSet<>();
		while(lotto.size() < 6) {
			int number = random.nextInt(45) + 1;
			lotto.add(number);
		}
		
		for (int number: lotto) System.out.print(number + " ");
		System.out.println(" ");
		
		// 람다식과 스트림 API
		lotto.stream().forEach(number -> System.out.print(number + " "));
		
		
	}

}
