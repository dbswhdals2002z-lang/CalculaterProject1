package com.example.calculator;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        // 양의 정수(0 포함)를 입력받기
        // 1. 스캐너 객체 만들기 new 키워드는 객체를 class로부터 생성하는 키워드
        Scanner scanner = new Scanner(System.in); // Scanner에만 (System.in)이 들어감

        // 2. 첫번째 숫자 입력 받기
        int num = scanner.nextInt();
        System.out.print("첫 번째 양의 정수를 입력하세요: ");

        // 3. 두번째 숫자 입력 받기
        int num2 = scanner.nextInt();
        System.out.print("두 번째 양의 정수를 입력하세요: ");

        // 4. 사칙연산((➕,➖,✖️,➗) 기호 입력 받기
        String op = scanner.nextLine(); // 문자열로 입력 받기
        char operatoer = op.charAt(0); // 첫 문자 추출
        System.out.println("사칙연산 기호를 입력하세요: ");

        // 5. if문을 활용해 연산 수행하기 (먼저 덧셈 뺄셈 나눗셈 곱셈 변수 지정)
        int result1 = num + num2;
        int result2 = num - num2;
        int result3 = num / num2;
        int result4 = num * num2;
        if(operatoer == '+'){
            result1 = num + num2;
            System.out.println("result1 = " + result1);
        }
        else if(operatoer == '-'){
            result2 = num - num2;
            System.out.println("result2 = " + result2);
        }
        else if(operatoer == '/'){
            result3 = num / num2;
            System.out.println("result3 = " + result3);
        }
        else if(operatoer == '*'){
            result4 = num * num2;
            System.out.println("result4 = " + result4);
        }





    }
}
