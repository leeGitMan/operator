package edu.kh.opex;

// 예제 코드 작성용 클래스
public class OpExample {
	
	// 기능 메소드 method : 객체 지향 프로그래밍에서 객체와 관련된 서브루틴 or 함수
	// void는 return 값이 없는 메소드에 작성한다.
	// 단순 출력만 할 때
	
	public void ex1() {
		System.out.println("OpExample 클래스에 " + "ex1() 기능 수행");
		
	}
	
	
	// tip: 하나의 메소드 안에는 하나의 기능만 정의!
	public void ex2() {
		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++;
		iNum2--;
		
		
		System.out.println("iNum1:" + iNum1);
		System.out.println("iNum2:" + iNum2);
		
		
	}
	
	public void ex3() {
		// 전위 연산: ++3, --2 연산자가 값의 앞쪽에 위치한다.
		// 다른 연산자 보다 먼저 증가 혹은 감소 한다.
		
		int temp1 = 5;
		System.out.println(++temp1 + 5);
		
		//후위 연산: 10++, 6-- ,연산자 뒤쪽 배치
		// 다른 연산자 보다 나중에 증가 또는 감소
		
		int temp2 = 3;
		System.out.println(temp2-- + 2 );
		// 3 + 2 = 5
		// temp2 <= 2(1감소)
		System.out.println(temp2);
		
	}
	
	public void ex4() {
		// 비교 연산자
		// >, <, >=, <=, ==, !=
		// 비교 연산자의 결과는 논리 값이 나온다(T,F)
		// 등호(=)가 포함된 연산자에서 등호는 항상 오른쪽 --> =표시는 항상 오른쪽
		int a1 = 10;
		int b = 20;
		
		System.out.println(a1 > b); // false
		System.out.println(a1 < b); // true
		System.out.println(a1 != b); // true
		System.out.println( (a1 == b) == false); // true
			// () 괄호 안에 있는 거 먼저 연산
			// false == false --> true
		
		int c = 4;
		int d = 5;
		
		System.out.println( c + 1 <=d); // true
					// 산술 연산이 비교 연산보다 우선 순위가 높다!!! 낚이지 말자
		
		int temp = 723;
		
		System.out.println("temp 는 짝수 입니까?" + ( temp % 2 == 0)); // false
		
	
		
	}
	
	

	public void ex5() {
		// 논리 연산자 : &&(and), ||(or)
		// &&: 둘다 T이면 T이다.
		int a2 = 101;
		// a는 100 이상이면서 짝수 인가?
		System.out.println((a2 >= 100) && (a2 % 2 == 0)); // false
		
		// ||: 하나만 T여도 T이다.
		// ||: 둘다 false면 false이다.
		
		int c= 10;
		// c는 10을 초과하거나 짝수이다.
		
		System.out.println((c > 10) || (c % 2 == 0)); //true
		
		
		
	}
	
	public void ex6() {
		
		// 논리 부정 연산자 : !
		// 논리 값을 반대로 바꾸는 것
		
		boolean bool1 = true;
		
		System.out.println(bool1 != true);
		System.out.println(!bool1);
	
		
	}
	
	public void ex7() {
		
		// 복합 대입 연산자:  +=, -=, *=, /=, %=
		// -> 피연산자가 자신과 연산 후 결과를 다시 자신에게 대입
		
		int a = 10;
		
		a++; // 11
		
		a += 4; // == a = a + 4;
		
		System.out.println(a);
		
		a -= 10;
		
		System.out.println(a);
		
		a *= 3;
		System.out.println(a);
		
		a %= 6;
		System.out.println(a);
		
		
		
		
		
		
		
	}
	
	
	public void ex8() {
		
		// 삼항 연산자는 if와 비슷한 역할을 한다.
		// 조건식 ? 식1 : 식2
		// 조건식 결과가 T이면 식1이 수행 F이면 식2가 수행
		int num = 30;
		String str1 = "num은 30보다 크다";
		String str2 = "num은 30 이하다.";
		
		String result = num > 30 ? str1 : str2;
		System.out.println(result);
		
				
		
		
		
		
		
	}

}
