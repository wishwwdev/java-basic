package com.woolim.demo.service;

import com.woolim.demo.repository.Object2Repository;
import com.woolim.demo.repository.ObjectRepository;
import com.woolim.demo.repository.Repository;

// com.woolim.demo 프로젝트의 실제 비즈니스 로직을 담당하는 클래스
public class MainService {
	
	private Repository repository; 
//	private ObjectRepository objectRepository;
//	private Object2Repository object2Repository;
	
	public MainService(Repository repository) { 				// 추상화에 의존하는 형태임
		this.repository= repository;							// Repository라는 인터페이스를 만들고, 그 안에 추상 클래스를 만든 후
	}															// ObjcetRepository와 Object2Repository 각각의 클래스에서
																// implements키워드를 사용하여 인터페이스를 구현 후, 
	public void printDatas() {									// 추상 클래스를 오버라이딩함
		int[] dates = repository.getDatas();
		for (int data : dates) System.out.println(data);		
	}

//	public void printDatas2() {
//		int[] dates = object2Repository.getDatas();
//		for (int data : dates) System.out.println(data);		
//	}
	
}
