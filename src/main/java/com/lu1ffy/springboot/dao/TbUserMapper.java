package com.lu1ffy.springboot.dao;

import com.lu1ffy.springboot.model.TbUser;
import java.util.List;

public interface TbUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbUser record);

    TbUser selectByPrimaryKey(Integer id);

    List<TbUser> selectAll();

    int updateByPrimaryKey(TbUser record);
}