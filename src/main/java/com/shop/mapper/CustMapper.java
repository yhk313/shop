package com.shop.mapper;

import com.shop.dto.CustDTO;
import com.shop.frame.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//인터페이스에서 인터페이스를 상속받을 땐 extends
//crud 가능
@Repository
@Mapper //xml문서와 연동 가능
public interface CustMapper extends MyMapper<String, CustDTO> {
  //xml 호출
  //insert
  //update
  //delete
  //select
  //selectall


}
