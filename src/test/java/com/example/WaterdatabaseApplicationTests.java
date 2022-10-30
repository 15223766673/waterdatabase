package com.example;

import com.example.domin.User;
import com.example.mapper.UserMapper;
import com.example.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;


@SpringBootTest(classes = WaterdatabaseApplication.class)
class WaterdatabaseApplicationTests {

	@Autowired
	private TestService testService;


	@Autowired
	private UserMapper userMapper;
	@Autowired
	private RedisTemplate redisTemplate;
	@Test
	void contextLoads() {
		testService.add();
	}
	@Test
	void testSet() {
		redisTemplate.boundValueOps("name").set("tianzhou");
	}

	@Test
	void testGet()
	{
		Object ob = redisTemplate.boundValueOps("name").get();
		System.out.println(ob);
	}
	@Test
	void testfind()
	{
		List<User> list = userMapper.findAllUser();
		System.out.println(list.get(0).getUserName());
	}

}
