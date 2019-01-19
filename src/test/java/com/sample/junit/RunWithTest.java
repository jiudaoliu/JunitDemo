/**
 * 
 */
package com.sample.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ JunitTest2Test.class, JunitAnotationTest.class })
public class RunWithTest {
	/**
	 * @RunWith(Suit.class) 翻译成中文就是 测试运行器，JUnit所有的测试方法都是由测试运行器负责执行
	 * @Suite.suiteClasses({TaskTes1.class,TaskTes2.class,TaskTes3.class})//数组的形式
	 * 
	 * 1、测试套件就是组织测试类一起运行的
	 * 2、写一个作为测试套件的入口类，这个类里不包含其他的方法
	 * 3、更改测试运行器Suite.class
	 * 将要测试类作为数组传入到Suit.SuiteClasses({})
	 */
}
