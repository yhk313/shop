package com.shop.frame;

import java.util.List;
//표준화된 인터페이스
public interface MyMapper<K,V> {
  //CRUD 표준
  public void insert(V v) throws Exception;

  public void update(V v) throws Exception;

  public void delete(K k) throws Exception;

  public V select(K k) throws Exception;//key 값을 주면 Value

  public List<V> selectall() throws Exception;// 전체를 다담아서 List형태로
}
