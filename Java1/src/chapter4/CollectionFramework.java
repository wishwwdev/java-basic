package chapter4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// CollectionFramework
// 데이터를 저장, 검색, 수정, 삭제 표준화된 데이터 구조를 제공하는 인터페이스 및 그 구현체들
// 단순한 배열만을 사용했을 때 발생하는 여러 문제 및 불편사항을 해결함
public class CollectionFramework {

	public static void main(String[] args) {
		
		// 배열의 문제
		// 1. 배열을 생성할 때 사용할 배열의 길이를 미리 지정해야함
		//		-> 유연한 배열 사용을 불가능하게 함
		int[] intArray = new int[10];
		
		// 2. 데이터를 추가할 때 빈 요소를 찾아야하는 불편함이 있음
		// 		-> 배열 요소의 null인 위치에 값을 넣기 위한 로직을 작성해야함
		// 		-> 배열의 길이를 초과하는 경우 요소를 추가할 수 없음
		
		// 3. 데이터를 삭제할 때 중간에 빈 요소가 생기기 때문에
		// 	  추가적으로 뒤에 오는 요소를 앞으로 당기는 로직을 작성해야함
		
		// 4. 만약 중복된 데이터를 추가하고 싶지 않다면 배열에서
		// 	  해당 요소가 중복되는지 검사하는 로직을 작성해야함
		
		// 위의 문제를 해결하기위해 CollectionFramework를 사용할 수 있음
		
		// 1. List Interface
		// '순서가 존재'하며 '중복된 요소를 허용'하는 데이터 구조
		// 기본적인 배열과 가장 유사한 형태
		// 구현체 : ArrayList, LinkedList
		// ArrayList : 내부적인 배열을 사용해서 데이터를 저장 - 인덱스를 이용한 접근이 빠름
		// LinkedList : 내부적인 이중 연결 배열을 사용해서 데이터를 저쟝 - 추가, 삭제가 빠름
		List<String> arrayList = new ArrayList<>();		// ArrayList메서드는 List인터페이스의 구현체임
		List<Integer> intList = new ArrayList<>();		// 앞에 데이터타입을 적어주는 이유는 
		List linkedList = new LinkedList();				// 나중에 리스트안의 값이 많아졌을때, 무슨 타입인지 알수 없어서 미리 타입을 한정해줌
		
		// List Interface의 메서드 : add(), get(), set(), remove(), size()
		// add() : 요소 추가
		// get() : 요소 검색
		// set() : 요소 수정
		// remove() : 요소 삭제
		// size() : 리스트의 길이
		arrayList.add("String");
		arrayList.add(1, "Comment");
		arrayList.add(1, "Reply"); 	// 값이 밀려서 1번인덱스에 Reply, 2번 인덱스에 Comment가 됨
		
		System.out.println(arrayList.get(2));
		String str1 = arrayList.get(0);	// 37번에서 arrayList의 타입은 String이라고 명시해줬기 때문에 앞에 타입을 적을 필요없음
		
		arrayList.set(0, "Hello");
		System.out.println(arrayList.get(0));
		
		arrayList.remove(0);
		System.out.println(arrayList.get(0));
		
		System.out.println(arrayList.size());
		
		System.out.println("=============================");
		
		// 2. Set Interface
		// 순서가 존재하지 않고 중복을 허용하지 않는 데이터 구조
		// 집합 개념
		
		// 구현체 : HashSet, LinkedHashSet, TreeSet
		// HashSet : 해싱을 사용해서 데이터를 관리 - 검색속도가 빠름
		// LinkedHashSet : 해싱을 사용해서 데이터를 순서대로 관리
		// TreeSet : Tree기법을 사용해서 데이터를 관리 - 데이터가 정렬되어 있음
		Set<Integer> intSet = new HashSet<>();
		
		// Set Interface의 메서드 : add(), remove(), contains()
		// add() : 추가
		// remove() : 삭제
		// contains() : 포함여부 확인
		intSet.add(10);
		intSet.add(2);
		intSet.add(10);
		intSet.add(3);
		intSet.add(3);
		intSet.add(4);
		intSet.add(5);
		intSet.add(5);
		
		intSet.remove(10);
		System.out.println(intSet.size());
		
		boolean hasTen = intSet.contains(2);
		System.out.println(hasTen);
		
		for (Integer integer: intSet) {
			System.out.println(integer);
		}
		
		// 3. Map Interface 
		// 순서가 존재하지 않고 key와 value가 한 쌍으로 관리되며 key에 대해서
		// 중복을 허용하지 않는 데이터 구조
		// key와 value의 집합
		
		// 구현체 : HashMap, LinkedHashMap, TreeMap
		// HashMap : 해싱을 사용하여 key와 value를 저장 - key에 대한 접근이 빠름
		// LinkedHashMap : 추가한 순서대로 데이터를 관리
		// TreeMap : Tree기법을 사용해여 Key를 정렬하여 관리
		Map<String, String> stringMap = new HashMap<>();
		
		// Map Interface의 메서드 : put(), get(), remove(), containsKey()
		// put() : 추가, 수정
		// get() : 검색
		// remove() : 제거
		// containsKey() : key의 존재 여부 확인
		stringMap.put("사과", "apple");
		stringMap.put("바나나", "banana");
		stringMap.put("사과", "apple1");
		
		stringMap.remove("사과");
		
		String value1 = stringMap.get("사과");
		System.out.println(value1);
		boolean hasApple = stringMap.containsValue("사과");
		System.out.println(hasApple);
		
		
		
		
		
		
	}

}
