package shop;

import shop.db.dbinfo;
import shop.model.Login;

public class Register_Ex {

	public static void main(String[] args) {
//		//회원가입 2명 가입(...)
//		//고정배열 + for(일반for, 향상된 for)
//		
//		//1. 공간생성 : 데이터타입[] 배열명 = new 데이터타입[공간개수]
//		//2. 생성자 만들기 : 배열마다 생성자 만들어 주기
//		//3. 값 입력 : setter를 이용해서 값 저장하기
//		//4. for를 이용해서 출력 : disp()를 이용해서 출력하기
//		
//	
//		
//		Register[] person = new Register[2];
//		person[0] = new Register();//Register.java 복사
//		person[1] = new Register(); //Register.java 복사
//		
//		//person[0] = Register.java
//		//person[1] = Register.java
//		person[0].setUserid("busan1");
//		person[0].setPasswd("1111111");
//		person[0].setUsername("홍길동1");
//		person[0].setIntroduce("소개1");
//		
//		person[1].setUserid("busan2");
//		person[1].setPasswd("2222222");
//		person[1].setUsername("홍길동2");
//		person[1].setIntroduce("소개2");
//
//		
//		
//		//글자 길이는 length(), 배열길이는 length;
////		for(int i = 0; i < 배열길이; i++) {출력내용}
//		for(int i = 0; i < person.length; i++) {
//			System.out.println("================");
//			System.out.println(person[i].disp());
//		}		
//		
////		for(출력값타입 변수명 : 배열명 { 변수명으로 출력 }
//		for(Register r : person) {
//			System.out.println(r.disp());
//		}
		
		//Login
		Login login = new Login();
		dbinfo db = new dbinfo(); 
		
		login.setUserid("korea1234");
		login.setPasswd("1234");

		if(login.getUserid().equals(db.db_userid) && login.getPasswd().equals(db.db_passwd)) {
			System.out.println(login.getUserid() + "님 안녕하세요.");
			System.out.println("사이트 메인으로 이동합니다.");
			
		}else {
			System.out.println("다시 로그인 해 주세요.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
