package com.lu1ffy.springboot.dao;

import com.lu1ffy.springboot.model.Order;
import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer oid);

    int insert(Order record);

    Order selectByPrimaryKey(Integer oid);

    List<Order> selectAll();

    int updateByPrimaryKey(Order record);
}