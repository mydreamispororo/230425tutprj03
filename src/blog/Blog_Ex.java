package blog;

import blog.model.Blog;

public class Blog_Ex {

	public static void main(String[] args) {
		Blog blog1 = new Blog();
		Blog blog2 = new Blog();
		Blog blog3 = new Blog();
		
		//email, password, name, title, blogcontent, hits
		
		blog1.setEmail("hong@naver.com");
		blog1.setPassword("");
		blog1.setName("홍길동");
		blog1.setTitle("블로그 타이틀");
		blog1.setBlogcontent("블로그 내용");
		blog1.setHits(60);
		
		blog2.setEmail("gil@naver.com");
		blog2.setPassword("gil123");
		blog2.setName("홍길동");
		blog2.setTitle("블로그 타이틀");
		blog2.setBlogcontent("블로그 내용");
		blog2.setHits(80);
		
		blog3.setEmail("dong@naver.com");
		blog3.setPassword("dong123");
		blog3.setName("홍길동");
		blog3.setTitle("블로그 타이틀");
		blog3.setBlogcontent("블로그 내용");
		blog3.setHits(10);
		
		System.out.println(blog1.disp());
		System.out.println(); 
		System.out.println(blog2.disp());
		System.out.println();
		System.out.println(blog3.disp());
		


		
		
		
		
	}

}
