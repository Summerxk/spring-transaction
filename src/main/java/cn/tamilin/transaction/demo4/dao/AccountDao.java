/**
 * 
 */
package cn.tamilin.transaction.demo4.dao;

/**
 * @author summer
 * @Since Jul 30, 2018 10:01:57 PM
 */
public interface AccountDao {

	public void outMoney(String out, Double money);

	public void inMoney (String in, Double money);
}
