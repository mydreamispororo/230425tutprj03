package blog.model;

public class Blog {
	private String email;
	private String password; 
	private String name;
	private String title;
	private String blogcontent;
	private int hits;
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		if(password.equals("") || password.length() < 5) {
			System.out.println("비밀번호를 다시 입력해주세요");
			
		}else {
			this.password = password;
		}
		
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getBlogcontent() {
		return blogcontent;
	}
	
	public void setBlogcontent(String blogcontent) {
		this.blogcontent = blogcontent;
	}
	
	public int getHits() {
		return hits;
	}
	
	public void setHits(int hits) {
		this.hits = hits;
	}
	
	public String disp() {
		return "이메일 : " + this.email + " \n"
				+ "비밀번호 : " + this.password +" \n"
				+ "이름 : " + this.name +" \n"
				+ "블로그 제목 : " + this.title + " \n"
				+ "블로그 내용 : " + this.blogcontent + " \n"
				+ "조회수 : " + this.hits;
	}
	

}
