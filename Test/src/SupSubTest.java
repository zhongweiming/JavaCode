

class Super{
	Super(int a){
		
	}
}

public class SupSubTest extends Super{

	public static int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public SupSubTest() {
		super(10);//父类构造方法必须在子类构造方法的第一行执行，
		//且如果父类构造方法含有参数的话，子类必须显示写出父类构造方法并且提供参数
	}

}
