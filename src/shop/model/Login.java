package shop.model;

public class Login {
	//회사이름
	//version
	//전화번호
	//=> 생성자를 이용해서 초기값으로 지정 : 초기값은 마음대로
	//아이디
	//비밀번호
	
	//필드 : 실제 값이 저장되는 곳
	
	private String companyName;
	private String ver;
	private String tel;	
	private String userid;
	private String passwd;
	
	public Login() {} //default Constructor : 기본생성자(필수)
	
	public Login(String companyName) {
		this.companyName = companyName;
		
	}
	
	public Login(String companyName, String ver) {
		this();
		this.ver = ver;
	}
	
	public Login(String companyName, String ver, String tel) {
		this();
		this.tel = tel;
	}

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

	public String getCompanyName() {
		return companyName;
	}

	public String getVer() {
		return ver;
	}

	public String getTel() {
		return tel;
	}
	
	
	public String disp() {
		return "";
		
	}
	
	
	

}







