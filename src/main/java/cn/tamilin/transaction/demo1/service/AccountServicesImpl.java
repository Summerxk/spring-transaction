/**
 * 
 */
package cn.tamilin.transaction.demo1.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import cn.tamilin.transaction.demo1.dao.AccountDao;

/**
 * @author summer
 * @Since Jul 30, 2018 9:59:16 PM
 */
@Service
public class AccountServicesImpl implements AccountService {

	private AccountDao accountDao;

	private TransactionTemplate transactionTemplate;

	@Override
	public void transfer(String out, String in, Double money) {
		
		transactionTemplate.execute(new TransactionCallbackWithoutResult () {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				accountDao.outMoney(out, money);
				//int i = 1 /0;
				accountDao.inMoney(in, money);
			}
		});
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

}
