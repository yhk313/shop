package com.shop.cust;

import com.shop.dto.CustDTO;
import com.shop.service.CustService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustDeleteTests {
	@Autowired
	CustService custService;

	@Test
	void contextLoads() {
//		CustDTO obj = new CustDTO("id101","pwd10","james");
		try {//db에 등록되지않거나 등등 오류
			custService.remove("id101");//id값
			System.out.println("삭제완료");
		} catch (Exception e) {
			e.printStackTrace();//중복 아이디일 경우: org.springframework.dao.DuplicateKeyException:
			System.out.println("입력 시 오류");
		}


	}

}
