package com.shop.dto;

import lombok.*;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class ItemDTO {
  private Integer id;
  private String name;
  private Integer price;

  private LocalDateTime rdate;

  private String imgname;

  private Integer qty;
}
