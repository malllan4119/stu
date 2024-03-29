package cn.tedu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.tedu.entity.User;

public interface UserMapper {
	//调用xml方式
    public List<User> find();
    
    //调用注解方式
   // @Select("select * from user where id=#{id}")
	public User get(@Param("id") Integer id);

}
