package com.shop.service;

import com.shop.dto.CustDTO;
import com.shop.frame.MyService;
import com.shop.mapper.CustMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustService implements MyService<String, CustDTO> {
  @Autowired
  CustMapper custMapper; //service 는 dao 이용
  @Override
  public void register(CustDTO custDTO) throws Exception {
    custMapper.insert(custDTO);
  }

  @Override
  public void modify(CustDTO custDTO) throws Exception {
    custMapper.update(custDTO);
  }

  @Override
  public void remove(String s) throws Exception {
    custMapper.delete(s);//해당아이디값을 삭제
  }

  @Override
  public CustDTO get(String s) throws Exception {
    return custMapper.select(s);//해당 객체 리턴
  }

  @Override
  public List<CustDTO> get() throws Exception {
    return custMapper.selectall();// 전체사용자정보를 리스트형태로 담아서 보내준다.
  }
}
