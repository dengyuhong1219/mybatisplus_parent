package com.dyh.hrm.service.impl;

import com.dyh.hrm.domain.User;
import com.dyh.hrm.mapper.UserMapper;
import com.dyh.hrm.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dyh
 * @since 2019-08-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
