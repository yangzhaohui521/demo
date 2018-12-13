package com.demo.dao;

import com.demo.entity.User;

/**
 * @author yangchaohui
 * @date 2018/12/13 17:02
 */
public interface  UserDao {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);


}
