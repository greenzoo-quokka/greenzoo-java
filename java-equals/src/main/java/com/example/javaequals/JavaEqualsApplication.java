package com.example.javaequals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class JavaEqualsApplication {

    public static void main(String[] args) {
        String stringA = "abc";
        String copyStringA = stringA;
        String newString = new String("abc");

        // equals() 메소드 : 객체끼리 내용 비교 할 수 있도록함
        System.out.println("----------------equals 비교는 값 비교");
        System.out.println("stringA.equals(copyStringA) : " + stringA.equals(copyStringA));
        System.out.println("stringA.equals(newString) : " + stringA.equals(newString));
        System.out.println("copyStringA.equals(newString) : " + copyStringA.equals(newString));
        System.out.println("");

        System.out.println("----------------주소값 출력");
        System.out.println("stringA 주소값 : " + System.identityHashCode(stringA));
        System.out.println("copyStringA 주소값 : " + System.identityHashCode(copyStringA));
        System.out.println("newString 주소값 : " + System.identityHashCode(newString));
        System.out.println("");

        // == : 대상의 주소 비교
        System.out.println("---------------- == 주소 비교");
        System.out.println("stringA == copyStringA : " + (stringA == copyStringA));
        System.out.println("stringA == newString : " + (stringA == newString));
        System.out.println("copyStringA == newString : " + (copyStringA == newString));
        System.out.println("");

        // stringA 와 copyStringA는 주소값이 같으므로 stringA를 변경한다면?
        System.out.println("---------------- stringA 변경전 주소값 비교");
        System.out.println("stringA 주소값 : " + System.identityHashCode(stringA));
        System.out.println("copyStringA 주소값 : " + System.identityHashCode(copyStringA));
        System.out.println("stringA == copyStringA : " + (stringA == copyStringA));

        System.out.println("---------------- stringA 변경");
        stringA = "def";
        System.out.println("stringA : " + stringA);
        System.out.println("copyStringA : " + copyStringA);
        System.out.println("def의 주소값 : " + System.identityHashCode("def"));
        System.out.println("stringA 주소값 : " + System.identityHashCode(stringA));
        System.out.println("copyStringA 주소값 : " + System.identityHashCode(copyStringA));
        System.out.println("stringA == copyStringA : " + (stringA == copyStringA));

        System.out.println("");
        System.out.println("---------------- Shallow, Deep Copy");
        int[] array_1 = new int[]{0,1,2};

        // 얕은복사 : Shallow Copy
        int[] array_2 = array_1;

        // 깊은복사 : Deep Copy
        int[] array_3 = array_1.clone();

        array_1[0] = 100;
        System.out.println("array_1[0][1] 주소값 : " + System.identityHashCode(array_1[0]));
        System.out.println("array_2[0][1] 주소값 : " + System.identityHashCode(array_2[0]));
        System.out.println("array_3[0][1] 주소값 : " + System.identityHashCode(array_3[0]));
        System.out.println("array_1[0][1] 값 : " + array_1[0]);
        System.out.println("array_2[0][1] 값 : " + array_2[0]);
        System.out.println("array_3[0][1] 값 : " + array_3[0]);

    }

}
