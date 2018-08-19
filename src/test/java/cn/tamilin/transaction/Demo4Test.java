/**
 * 
 */
package cn.tamilin.transaction;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tamilin.transaction.demo4.service.AccountService;

/**
 * @author summer
 * @Since Jul 30, 2018 11:55:03 PM
 * spring 的声明式事务管理的方式三：基于注解的事务管理方式
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring-config4.xml")
public class Demo4Test {

	@Resource(name = "accountService")
	private AccountService accountService;
	
	@Test
	public void testDemo3() {
		accountService.transfer("aaa", "bbb", 200d);
	}
}
