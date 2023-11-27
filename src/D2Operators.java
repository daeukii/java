public class D2Operators {
    public static void main(String[] args) {
        int plus = 10 + 20;
        int minus = 20 - 10;
        int multiply = 20 * 10;
        int divide = 20 / 10;
        int modulo = 15 % 10;
        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(modulo);

        // 사칙연산의 우선순위
        int result = 10 * 5 * 3;
        System.out.println(result);
        // 괄호가 최우선
        result = (10 + 5) * 3;
        System.out.println(result);
        // %의 우선순위는?
        result = (10 + 5 % 3)/ 3 + 2 * 3;

        // 1. 데이터를 받는 애를 int가 아니라 double로 해보자.
        double doubleDivide = 21 / 10;
        System.out.println(doubleDivide);

// 2. 나누기 전에 실수로 만들어 주자.
// 피연산자 중 하나라도 double이면 결과도 double
        doubleDivide = 21 / 10.0;
        System.out.println(doubleDivide);

// 피연산자 둘다 정수 변수면?
// 형변환(Type Casting)
        int intResult = (int) 2.1;

        System.out.println(intResult);

// 선 변환을 통한 나누기 연산
        int left = 21;
        int right = 10;
        double castedResult = (double) left / right;
        System.out.println(castedResult);

// 명시적 형변환 데이터 손실
        long bigInt = 4294967296L;
        System.out.println((int) bigInt);

        // char 형 반환
        int asciiA =65;
        System.out.println((char) asciiA);
        System.out.println((char) (asciiA + 10));

        // String 덧셈
        // String Concatenation
        System.out.println("여기에 10을 입력하시오" + 10);
        System.out.println(10 + "+" + 10 + "=" + 20);
        String fomula = 10 + "+" +10 + "=" + 20;

        int count = 0;
        count++;
        System.out.println("현재 횟수: " + count);
        count++;
        System.out.println("현재 횟수: " + count);
        count--;
        System.out.println("현재 횟수: " + count);
        ++count;
        --count;
        System.out.println("최종: " + count);

        count = 10;
        System.out.println(++count);  // 11 (출력 전에 1 증가, 값 11)
        System.out.println(count++);  // 11 (출력 후에 1 증가, 값 12)
        System.out.println(--count);  // 11 (출력 전에 1 감소, 값 11)
        System.out.println(count--);  // 11 (출력 후에 1 감소, 값 10)

        int addTo = 1;
        addTo += 10;     // 11
        addTo *= addTo;  // 121

        addTo /= 12;  // addTo = addTo / 12;
        addTo %= 10;  // addTo = addTo % 10;
        addTo -= 20;  // addTo = addTo - 20;
        addTo *= -1;  // addTo = addTo * -1;

        System.out.println(addTo);

        // 비교 연산자
        int small1 = 10;
        int small2 = 10;
        int big = 21;
        double bigD = 21.0;
        System.out.println(small1 == small2);
        System.out.println(big == small1);
        System.out.println(big == bigD);
        System.out.println(small1 > small2);
        System.out.println(small1 >= small2);
        System.out.println(small1 != small2);
        System.out.println(small1 <= small2);
        System.out.println(small2 < bigD);

    }
}
