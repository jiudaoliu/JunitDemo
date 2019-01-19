/**
 * 
 */
package com.sample.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import com.sample.junit.JunitTest1;

/**
 * @author lingpanbu
 * 
 * @Test:将一个普通的方法修饰成为一个测试方法
 * @Test(expected=XXX.class)
 * 	Junit期望异常测试例如：@Test(expected=ArithmeticException.class)如果测试该方法时产生一个ArithmeticException的异常，则表示测试通过，否则测试不通过

@Test(timeout=毫秒)   设置超时时间
	如果方法执行时间小于超时限定时间，则success。反之，则会强行停止方法运行，并报出failure。
@BeforeClass：它会在所有的方法运行前被执行，static修饰
@AfterClass：它会在所有的方法运行结束后被执行，static修饰
@Before：它会在每一个测试方法运行前被执行一次
@After：它会在每一个测试方法运行结束后被执行一次
@Ignore:所修饰的测试方法会被测试运行器所忽略
@RunWith:可以更改测试运行器 org.junit.runner.Runner
 * 
 */

public class JunitAnotationTest {
	@Test//将一个普通的方法修饰成为一个测试方法
	public void test() {
		assertEquals(6, new JunitTest1().add(3, 3));
		
	}
	
	
	@Test(expected=ArithmeticException.class)//拦截各种异常
	public void divisionTest() {
		System.out.println("expected  属性测试");
		assertEquals(3, new JunitTest1().division(3, 0));
		
	}
	@Test(timeout = 1000)//限制运行的时间
	public void timeoutTest() {
		while (true) {
			System.out.println("123");
		}
	}
	
	@Ignore
	@Test
	public void ignoreTest() {
		System.out.println("Ignore 测试...");
	}
	

}
