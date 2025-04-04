package com.hhm.spring05;

// 부모클래스 동물
public class Animal { 
    String name;

    // 정확한 캡슐화를 위해서 필터링


    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void cry() {
        System.out.println(this.name + "이(가) 웁니다.");
    }
}
