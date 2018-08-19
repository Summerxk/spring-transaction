/**
 * 
 */
package cn.tamilin.transaction.demo2.service;

import org.springframework.stereotype.Service;

import cn.tamilin.transaction.demo1.dao.AccountDao;

/**
 * @author summer
 * @Since Jul 30, 2018 9:59:16 PM
 */
@Service
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
