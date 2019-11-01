package cn.tedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.entity.User;
import cn.tedu.mapper.UserMapper;
import cn.tedu.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	public List<User> find() {
		return userMapper.find();
	}
	
	public User get(Integer id){
		return userMapper.get(id);
	}

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		
		
	}

	@Override
	public void delete(Integer id) {
		
		
	}

	


}
