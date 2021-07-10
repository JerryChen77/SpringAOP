package com.aop.service;

import com.aop.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Cjl
 * @date 2021/7/8 12:53
 */
public interface UserService {
    Integer save(User user);

    Integer delete(Integer id);

    Integer update(Integer fromCardId,Integer toCardId,double money);

    User select(Integer id);

    List<User> selectAll();
}