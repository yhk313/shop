package com.shop.cust;

import com.shop.dto.CustDTO;
import com.shop.service.CustService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CustSelectAllTests {
	@Autowired
	CustService custService;

	@Test
	void contextLoads() {
		List<CustDTO> list = null;
		try {//db에 등록되지않거나 등등 오류
			list = custService.get();
			for(CustDTO c:list){
				System.out.println(c);
			}
		} catch (Exception e) {
			e.printStackTrace();//중복 아이디일 경우: org.springframework.dao.DuplicateKeyException:
			System.out.println("입력 시 오류");
		}


	}

}
