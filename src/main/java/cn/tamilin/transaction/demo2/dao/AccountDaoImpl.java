/**
 * 
 */
package cn.tamilin.transaction.demo2.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;

/**
 * @author summer
 * @Since Jul 30, 2018 10:03:37 PM
 */
@Service
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	@Override
	public void outMoney(String out, Double money) {
		String sql = "update account set money = money - ? where name = ?";
		this.getJdbcTemplate().update(sql, money, out);
	}

	@Override
	public void inMoney(String in, Double money) {
		String sql = "update account set money = money + ? where name = ?";
		this.getJdbcTemplate().update(sql, money, in);
	}

}
