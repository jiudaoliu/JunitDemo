/**
 * 
 */
package com.sample.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;//擦他妈的需要手动导入太坑了吧
import org.springframework.test.context.web.WebAppConfiguration;

import com.sample.redis.service.RedisService;
import com.sample.sys.entity.UsersEntity;

@RunWith(value = SpringJUnit4ClassRunner.class) // 在使用所有注释前必须使用,让测试运行于Spring测试环境
@WebAppConfiguration //由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
//@ContextConfiguration 用来指定加载的Spring配置文件的位置,会加载默认配置文件,  
@ContextConfiguration(locations = { "classpath*:applicationContext.xml",
		"classpath*:applicationContext-redis.xml", "classpath*:applicationContext-mybatis.xml",
		"classpath*:applicationContext-db.xml",
		"classpath*:applicationContext-db-jpa.xml" })

//【@TransactionConfiguration 为配置事务性测试定义了类级别的元数据。PlatformTransactionManager默认的实例叫transactionManager，
//如果需要的PlatformTransactionManager不是“transactionManager”的话，那么可以显式配置驱动事务的PlatformTransactionManager的bean的名字。
//此外， 可以将defaultRollback标志改为false，表示不回滚。通常， @TransactionConfiguration与@ContextConfiguration搭配使用。
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
//@Transactional // 开启类级别的事物
public class SpringJunitTest {

	@Autowired
	private RedisService redisService;

	@Test
	public void springTest() {
		UsersEntity userdentity = redisService.getUserInfo(1);
		System.out.println(userdentity.toString());

	}

}
