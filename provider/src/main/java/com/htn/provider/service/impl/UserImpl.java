package com.htn.provider.service.impl;

import com.htn.common.domin.User;
import com.htn.common.service.UserService;
import com.htn.provider.mapper.UserMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @Description: UserImpl
 * @Company: 深圳市东深电子股份有限公司
 * @Auther: leichengyang
 * @Date: 2019/1/11 0011
 * @Version 1.0
 */
@Service
public class UserImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User findUser() {
        return userMapper.getOne(1l);
    }
}
