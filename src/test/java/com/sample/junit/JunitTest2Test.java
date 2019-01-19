/**
 * 
 */
package com.sample.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sample.junit.JunitTest2;

/**
 * @author lingpanbu
 * 
 * Junit4的运行流程
1、@BeforeClass修饰的方法会在所有方法被调用前被执行
而且该方法是静态的，所以当测试类被加载后接着就会运行它
而且在内存中它存在一份示例，它比较适合加载配置文件
2、@AfterClass所修饰的方法通常用来对资源的释放，如关闭数据库的连接
3、@Before和@After会在每个测试方法的前后各执行一次。
 *
 */
public class JunitTest2Test {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("@BeforeClass 测试...");
		System.out.println();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass 测试...");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("@Before 测试...");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("@After 测试....");
		System.out.println();
	}

	@Test
	public void testAdd() {
		System.out.println("testAdd 测试...");
		assertEquals(6, new JunitTest2().add(3, 3));
		
	}
	@Test
	public void testSubtrc() {
		System.out.println("testSubtrc 测试...");
		assertEquals(0, new JunitTest2().subtrc(3, 3));
	}

}
