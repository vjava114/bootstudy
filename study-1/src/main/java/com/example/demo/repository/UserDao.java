package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;


/* 
 * xml과 연결할수 있도록 해줌. xml에도 본 인터페이스  명시가 필요함. 아마도 xml을 읽어들인후 본 인터페이스에 DI 시키는것같음.
 * getUser() 같은 메소드에, sqlSession을 주입해준다. 
 * 
*/
@Mapper	
@Repository /* Component sacan되기 위해서 작성해줌. */
public interface UserDao {
	public User getUser(@Param("userId") Integer userId);
}
