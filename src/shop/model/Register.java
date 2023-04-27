package shop.model;

import java.time.LocalDate;

public class Register {
	private String userid;
	private String passwd;
	private String username;
	private String introduce;
	private LocalDate registerDate = LocalDate.now(); //현재시간
	
	public Register() {} //처음시작 값, 객체 복사
	
		
	
	public String getUserid() {
		return userid;
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getPasswd() {
		return passwd;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getIntroduce() {
		return introduce;
	}
	
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	
	public LocalDate getRegisterDate() {
		return registerDate;
	}
	
	public void setRegisterDate(LocalDate registerDate) {
		this.registerDate = registerDate;
	}
	
	
	public String disp() {
		return "아이디 : " + userid + "\n" //this 현재페이지, super 다른 페이지
				+ "비밀번호 : " + passwd + "\n"
				+ "이름 : " + username + "\n"
				+ "자기소개 : " + introduce + "\n"
				+ "회원가입일 : "+ registerDate;
	}
	
	
	
	
	

}
