/**
 * 
 */
package cn.tamilin.transaction;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tamilin.transaction.demo2.service.AccountService;

/**
 * @author summer
 * @Since Jul 30, 2018 11:55:03 PM
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring-config2.xml")
public class Demo2Test {

	//@Resource(name = "accountService")
	@Resource(name = "accournServiceProxy")
	private AccountService accountService;
	
	@Test
	public void testDemo2() {
		accountService.transfer("aaa", "bbb", 200d);
	}
}
