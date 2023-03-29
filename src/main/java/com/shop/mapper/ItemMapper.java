package com.shop.mapper;

import com.shop.dto.CustDTO;
import com.shop.dto.ItemDTO;
import com.shop.frame.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper //xml문서와 연동 가능
public interface ItemMapper extends MyMapper<String, ItemDTO> {
}
