

class Outter{
	public class Inner{
		
	}
	public static class SInner{
		
	}
}
public class OutterInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter out = new Outter();
		//Inner inner = out.new Inner();//错误
		//out.Inner a = out.new Inner();//错误
		Outter.Inner inner = out.new Inner();
		Outter.Inner in = new Outter().new Inner();//必须要先有外部类对象（对于非静态内部类来说）
		
		Outter.SInner sin = new Outter.SInner();
		//Outter.SInner si = out.new SInner();//错误，实例化对象不能引用内部静态类。
		

	}

}
