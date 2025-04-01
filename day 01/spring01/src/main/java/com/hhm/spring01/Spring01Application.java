package com.hhm.spring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring01Application {

	public static void main(String[] args) {
		SpringApplication.run(primarySource:Spring01Application.class, args);

		System.out.println("Hello, Spring Boot!");

			// 변수, 자료형 연습
			int account = 10000000;
			System.out.println("계좌금액은 " + account);
			float pi = 3.141592f;
			System.out.println("Pi는 " + pi);
			char ch_first = 'A';
			System.out.println("문자는 "+ ch_first)
			
			// 연산자 연습
			int a = 17;
			int b = 24;
			System.out.printf("a + b =%d\n", a + b);
			int diversult = b % a;
			System.out.printf("a %% b = %d\n", diversult);

			System.out.println("a++= " + a++); // 연산자 우선순위
			System.out.println("++a= " + ++a); 
			
			///비트연산 and, or, xor, inverse
			System.out.pirntln("40 & 124 = " + (40 & 124));
			// 40 = 0010 1000
			// 124 = 0111 1110
			// 0000 0010 <<2 0000 1000
			
			boolean case1 = 40 > 20; // true
			boolean case2 = 12 <= 13; // true
			System.out.println("case1 && case2 ")
		
	}
}
