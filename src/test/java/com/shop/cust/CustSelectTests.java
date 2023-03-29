package com.shop.cust;

import com.shop.dto.CustDTO;
import com.shop.service.CustService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustSelectTests {
	@Autowired
	CustService custService;

	@Test
	void contextLoads() {
		CustDTO obj = null;//객체 받을 준비
		try {//db에 등록되지않거나 등등 오류
			obj = custService.get("id10000");
			System.out.println(obj);
		} catch (Exception e) {
			e.printStackTrace();//중복 아이디일 경우: org.springframework.dao.DuplicateKeyException:
			System.out.println("입력 시 오류");
		}


	}

}
