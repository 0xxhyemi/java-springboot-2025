package com.hhm.spring04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring04Application {

	public interface  myMax { // 익명함수를 위한 인터페이스
		int max(int a, int b);
	}

	public static void main(String[] args) {
		SpringApplication.run(Spring04Application.class, args);

		// 람다식
		// 1. 일반방식
		Spring04Application app = new Spring04Application();
		System.out.println(app.helloJava());

		// 2. 람다방식
		myFuncInterface fi = () -> { System.out.println(x:"Hello, Java! 람다호출");};
		fi.printHello();
	}

	// 일반 메서드 호출
	public String helloJava() {
		return "Hello, Java! 일반호출";
	}

	@FunctionalInterface // 함수형 인터페이스로 지칭
	public interface myFuncInterface {
		void printHello
	}

	public interface myCalc {
		int add(int x, int y);
		int minus(int x, int y);
	}
}

