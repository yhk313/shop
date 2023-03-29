package com.shop.frame;

import java.util.List;

public interface MyService<K,V> {///화면 연결
  public void register(V v) throws Exception; //등록
  public void modify(V v) throws Exception; //
  public void remove(K k) throws Exception; //
  public V get(K k) throws Exception; //

  public List<V> get() throws Exception; //

}
