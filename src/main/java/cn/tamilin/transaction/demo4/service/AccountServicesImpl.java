/**
 * 
 */
package cn.tamilin.transaction.demo4.service;

import org.springframework.transaction.annotation.Transactional;

import cn.tamilin.transaction.demo1.dao.AccountDao;

/**
 * @author summer
 * @Since Jul 30, 2018 9:59:16 PM
 */
/**
 * @Transactional 属性
 * propagation : 事务的传播行为
 * isolation：事务的隔离级别
 * readOnly：只读
 * rollbackFor:发生哪些异常回滚
 * noRollbackFor: 发生哪些异常不回滚
 */
@Transactional
public class AccountServicesImpl implements AccountService {

	private AccountDao accountDao;

	@Override
	public void transfer(String out, String in, Double money) {
		accountDao.outMoney(out, money);
		//int i = 1 /0;
		accountDao.inMoney(in, money);
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

}
