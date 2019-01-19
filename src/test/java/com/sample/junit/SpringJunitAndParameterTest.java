/**
 * 
 */
package com.sample.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestContextManager;
import org.springframework.test.context.web.WebAppConfiguration;

import com.sample.redis.service.RedisService;
import com.sample.sys.entity.UsersEntity;

//@RunWith(value = SpringJUnit4ClassRunner.class) // 在使用所有注释前必须使用@RunWith(SpringJUnit4ClassRunner.class),让测试运行于Spring测试环境
@WebAppConfiguration
//【@ContextConfiguration 用来指定加载的Spring配置文件的位置,会加载默认配置文件,  
@ContextConfiguration(locations = { "classpath*:applicationContext.xml", "classpath*:applicationContext-redis.xml",
		"classpath*:applicationContext-mybatis.xml", "classpath*:applicationContext-db.xml",
		"classpath*:applicationContext-db-jpa.xml" })

//【@TransactionConfiguration 为配置事务性测试定义了类级别的元数据。PlatformTransactionManager默认的实例叫transactionManager，
//如果需要的PlatformTransactionManager不是“transactionManager”的话，那么可以显式配置驱动事务的PlatformTransactionManager的bean的名字。
//此外， 可以将defaultRollback标志改为false，表示不回滚。通常， @TransactionConfiguration与@ContextConfiguration搭配使用。
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
//@Transactional // 开启类级别的事物
@RunWith(Parameterized.class)
public class SpringJunitAndParameterTest {

	@Autowired
	private RedisService redisService;

	private int userid;

	private TestContextManager testContextManager;

	// 每次运行都会执行 与 @BeforeClass的区别
	@Before
	public void setUp() {
		// 自动注解与@RunWith(SpringJUnit4ClassRunner.class) 效果一样
		testContextManager = new TestContextManager(getClass());
		try {
			testContextManager.prepareTestInstance(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// (3)步骤三：为测试类声明一个带有参数的公共构造函数，并在其中为第二个环节中声明的几个变量赋值。
	public SpringJunitAndParameterTest(int userid) throws Exception {
		this.userid = userid;
	}

	// (4)步骤四：为测试类声明一个使用注解 org.junit.runners.Parameterized.Parameters 修饰的，返回值为
	// java.util.Collection 的公共静态方法，并在此方法中初始化所有需要测试的参数对。
	@SuppressWarnings("all")
	@Parameters
	public static Collection eventidData() {
		return Arrays.asList(new Object[][] { {1},{2} });

	}

	@Test
	public void springTest() {
		UsersEntity userdentity = redisService.getUserInfo(userid);
		System.out.println(userdentity.toString());

	}

}
