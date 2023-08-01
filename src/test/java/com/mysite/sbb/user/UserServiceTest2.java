package com.mysite.sbb.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest2 {
	
	@Autowired
	private UserService userService;
	
	//@Test
	void testCreate() {
		
		SiteUser siteUser = new SiteUser();
		
		siteUser =
		userService.create("user12", "user12@aaa.com", "1234");
		
		System.out.println("잘 등록 되었습니다. ");
	}
	
	@Test
	void testselectUser() {
		
		userService.selectUser("user12");	//DB에서 값이 있는지 확인하기
		
		System.out.println("성공");
	}

}
