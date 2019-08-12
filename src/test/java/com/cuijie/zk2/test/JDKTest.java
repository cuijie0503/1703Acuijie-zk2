package com.cuijie.zk2.test;

import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cuijie.utils.DateUtil;
import com.cuijie.utils.RandomUitl;
import com.cuijie.utils.StringUtil;
import com.cuijie.zk2.domain.User;

/**
 * 
 * @ClassName: JDKTest 
 * @Description: JDK测试类
 * @author:崔杰 
 * @date: 2019年8月12日 上午8:42:37
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans.xml")
public class JDKTest {
	
	
	@Resource
	private RedisTemplate<String, Serializable> redisTemplate;
	
	
	@Test
	public void test_insert() {
		//建立集合
		ArrayList<User> list = new ArrayList<>();
		//存入十万条数据
		for (int i = 1; i <= 100000; i++) {
			list.add(new User(i, StringUtil.randomChineseString()+StringUtil.randomChineseString(2), RandomUitl.randomSex(), "13"+RandomUitl.randomString(9),RandomUitl.randomEmail()+RandomUitl.randomEamil2() , DateUtil.randomDate2()));
		}
		//开始存储时间
		long startTime=System.currentTimeMillis();

		for (User user : list) {
			redisTemplate.opsForValue().set("u_"+user.getId(), user);
		}
		//结束存储
		long endTime=System.currentTimeMillis();
		System.out.println("JDK 系列化 存储十万条数据 耗时"+(endTime-startTime)+"毫秒");
		
		
		
	}

}
