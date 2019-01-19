/**
 * 
 */
package com.sample.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.sample.junit.JunitTest2;

@RunWith(Parameterized.class)
public class RunWithParameterTest {
	/**
	 * Junit4的参数化设置:对多组数据同时测试
1、更改默认的测试运行器为@RunWith(Parameterized.class)
2、声明变量来存放预期值和结果值
3、声明一个返回值为Collection的公共静态方法，并使用@Parameters进行修饰
4、为测试类声明一个带有的公共构造函数，并在其中为之声明变量赋值
	 */
	
	int expected = 0;
	int input1 = 0;
	int input2 = 0;
	
	@Parameters
	public static Collection<Object[]> t() {
		return Arrays.asList(new Object[][] { { 3, 1, 2 }, { 4, 3, 2 },{5,1,4} });//将数组转换成list
	}
	
	public RunWithParameterTest(int expected, int input1, int input2) {
		this.expected = expected;
		this.input1 = input1;
		this.input2 = input2;
	}
	
	
	@Test
	public final void parameterTest() {
		assertEquals(expected, new JunitTest2().add(input1, input2));
	}

}
