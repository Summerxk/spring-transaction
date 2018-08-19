/**
 * 
 */
package cn.tamilin.transaction;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tamilin.transaction.demo3.service.AccountService;

/**
 * @author summer
 * @Since Jul 30, 2018 11:55:03 PM
 * spring 的声明式事务管理的方式二：基于AspectJ的XML方式的配置
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring-config3.xml")
public class Demo3Test {

	@Resource(name = "accountService")
	private AccountService accountService;
	
	@Test
	public void testDemo3() {
		accountService.transfer("aaa", "bbb", 200d);
	}
}
