package com.cuijie.zk2.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

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
 * @ClassName: HashJSONTEst 
 * @Description: JDK测试类
 * @author:崔杰 
 * @date: 2019年8月12日 上午8:42:37
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans2.xml")
public class HashJSONTEst {
	
	
	@Resource
	private RedisTemplate<String, User> redisTemplate;
	
	
	@Test
	public void test_insert() {
		//建立集合
		HashMap<String, User> map = new HashMap<>();
		//存储十万条数据
		for (int i = 1; i <= 100000; i++) {
			
			map.put("User_"+i,new User(i, StringUtil.randomChineseString()+StringUtil.randomChineseString(2), RandomUitl.randomSex(), "13"+RandomUitl.randomString(9),RandomUitl.randomEmail()+RandomUitl.randomEamil2() , DateUtil.randomDate2()) );
			
		}
		//开始存储时间
		long startTime=System.currentTimeMillis();

		
			redisTemplate.opsForHash().putAll("User_key", map);
		//结束存储
		long endTime=System.currentTimeMillis();
		System.out.println("HashJSON 系列化 存储十万条数据 耗时"+(endTime-startTime)+"毫秒");
		
		
		
	}

}
