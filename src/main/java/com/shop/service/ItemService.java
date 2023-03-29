package com.shop.service;

import com.shop.dto.CustDTO;
import com.shop.dto.ItemDTO;
import com.shop.frame.MyService;
import com.shop.mapper.CustMapper;
import com.shop.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemService implements MyService<String, ItemDTO> {
  @Autowired
  ItemMapper itemMapper; //service 는 dao 이용
  @Override
  public void register(ItemDTO itemDTO) throws Exception {
    itemMapper.insert(itemDTO);
  }

  @Override
  public void modify(ItemDTO itemDTO) throws Exception {
    itemMapper.update(itemDTO);
  }

  @Override
  public void remove(String s)throws Exception {
    itemMapper.delete(s);//해당아이디값을 삭제
  }

  @Override
  public ItemDTO get(String s) throws Exception {
    return itemMapper.select(s);//해당 객체 리턴
  }

  @Override
  public List<ItemDTO> get() throws Exception {
    return itemMapper.selectall();// 전체사용자정보를 리스트형태로 담아서 보내준다.
  }
}
