/**
 * 
 */
package com.sample.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sample.junit.JunitTest1;


public class JunitTest1Test {

	/**
	 * @author lingpanbu
	 *assertEquals(a,b);//判断预期的结果和运行的结果是否相同
	 *
	 *Junit4使用详解
1、写在test目录下
2、测试的包名和被测试的包名相同
3、测试的方法名以test开头
4、测试方法上必须使用@Test进行修饰
5、测试方法必须使用publicvoid进行修饰，不能带任何的参数
6、测试单元中的每个方法必须可以独立测试、测试方法间不能有任何的依赖
7、测试类使用Test作为类名的后缀
8、对被测试类右键创建新的Junitclass 可提高效率
	 *
	 *测试用例用来达到想要的预期结果，但对于逻辑错误无能为力
Failures: 一般由单元测试使用的断言方法判断失败引起的，这 经表示，测试点发现了问题，就是说程序输出的结果和预期的不一样
Errors:是由代码异常引起的，它可以产生于测试代码本身的错误，也可以是被测试代码中的一个隐藏的bug
测试用例不是用来证明你是对的，而是用来证明你没有错
	 */
	@Test
	public void test() {
		assertEquals(6, new JunitTest1().add(3, 3));
	}

}
