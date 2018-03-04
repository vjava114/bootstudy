package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.User;

@Mapper
public interface UserMapper {

	 @Select("select * from tb_mmt_user = #{user_id}")
	 User findByUserId(@Param("user_id") Integer userId);

}
