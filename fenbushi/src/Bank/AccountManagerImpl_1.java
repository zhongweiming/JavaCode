package Bank;
import java.util.*;
import org.omg.PortableServer.*;

public class AccountManagerImpl_1
	extends Bank.AccountManagerPOA
{
	protected Hashtable accountList;
	
	public AccountManagerImpl_1()
	{
		accountList = new Hashtable();
	}
	
	public synchronized Bank.Account open(String name)
	{
		Bank.Account account = (Bank.Account)accountList.get(name);
		
		if(account == null){
			AccountImpl accountServant = new AccountImpl(2000);
			try{
				//��ȱʡ��POA�����������ȱʡ��POA���Ǹ�POA
				org.omg.CORBA.Object obj = 
					_default_POA().servant_to_reference(accountServant);
				//����������խ��ΪAccount����
				account = Bank.AccountHelper.narrow(obj);
			}catch(Exception exc){
				exc.printStackTrace();
			}
			
			accountList.put(name, account);
			System.out.println("�¿��˻���" + name);
		}
		
		return account;
	}
}			