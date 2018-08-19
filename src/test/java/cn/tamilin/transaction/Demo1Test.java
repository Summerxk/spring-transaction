/**
 * 
 */
package cn.tamilin.transaction;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tamilin.transaction.demo1.service.AccountService;

/**
 * @author summer
 * @Since Jul 30, 2018 11:55:03 PM
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class Demo1Test {

	@Resource(name = "accountService")
	private AccountService accountService;
	
	@Test
	public void testDemo1() {
		accountService.transfer("aaa", "bbb", 200d);
	}
}
