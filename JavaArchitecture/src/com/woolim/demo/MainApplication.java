package com.woolim.demo;

import java.util.Scanner;

import com.woolim.demo.controller.MainController;
import com.woolim.demo.repository.Object2Repository;
import com.woolim.demo.repository.ObjectRepository;
import com.woolim.demo.service.MainService;

// com.woolim.demo 프로젝트의 실제 실행 클래스
public class MainApplication {
	
	private static MainController mainController;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		
		int input = scanner.nextInt();
		
		ObjectRepository objectRepository = new ObjectRepository(input);
		Object2Repository object2Repository = new Object2Repository();
		MainService mainService = null;
		if (input <= 0) mainService = new MainService(object2Repository);
		else mainService = new MainService(objectRepository);
		
		
		mainController = new MainController(mainService);
		mainController.printDatas();
		
		
		
	}

}
