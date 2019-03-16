import Bank.*;
import org.omg.PortableServer.*;

public class Server
{
	public static void main(String[] args)
	{
		try{
			//��ʼ��ORB
			org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);
			//��ȡ��POA������
			POA rootPOA = POAHelper.narrow(
				orb.resolve_initial_references("RootPOA"));
			//�����־�POA�Ĳ���
			org.omg.CORBA.Policy[] policies = {
				rootPOA.create_lifespan_policy(LifespanPolicyValue.PERSISTENT),
				rootPOA.create_request_processing_policy(
					RequestProcessingPolicyValue.USE_SERVANT_MANAGER)
			};
			//���¶���Ĳ��Դ���myPOA
			POA myPOA = rootPOA.create_POA("ServantActivatorPOA", rootPOA.the_POAManager(), policies);
			ServantActivator sa = new AccountManagerActivator()._this(orb);
			myPOA.set_servant_manager(sa);
			//����POA������
			rootPOA.the_POAManager().activate();
			myPOA.create_reference_with_id(
				"Zhang3".getBytes(), "IDL:Bank/AccountManager:1.0");
			myPOA.create_reference_with_id(
				"Li4".getBytes(), "IDL:Bank/AccountManager:1.0");
			//�ȴ�����ͻ����������
			System.out.println("�ʻ�����ԱZhang3��Li4�Ѿ���...\n");
			orb.run();
		}catch(Exception exc){
			exc.printStackTrace();
		}
	}
}