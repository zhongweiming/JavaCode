import java.util.Vector;

public class VectorTest {
	
	Vector v;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VectorTest vt  = new VectorTest();
		vt.v = new Vector(10);
		vt.v.addElement(30.2);
		vt.v.addElement(30.3);
		vt.v.trimToSize();
		for(int i = 0;i < vt.v.size();i++) {
			System.out.println(vt.get(i));
		}
		
		
	}

	public Object get(int i) {
		return v.elementAt(i);
	}
}
