package com.shop.Item;

import com.shop.dto.CustDTO;
import com.shop.dto.ItemDTO;
import com.shop.service.CustService;
import com.shop.service.ItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class ItemInsertTests {
	@Autowired
	ItemService itemService;//

	@Test
	void contextLoads() {
		ItemDTO obj = new ItemDTO(10000,"양말",40000,LocalDateTime.now(), "sss.jpg",20);
		try {//db에 등록되지않거나 등등 오류
			itemService.register(obj);
		} catch (Exception e) {
			e.printStackTrace();//중복 아이디일 경우: org.springframework.dao.DuplicateKeyException:
			System.out.println("입력 시 오류");
		}


	}

}
