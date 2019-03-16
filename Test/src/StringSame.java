import java.util.Scanner;
public class StringSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int i = 0,j = str.length()-1,count = 0;
		char s[] = str.toCharArray();
		while(i<=j) {
			if(s[i]==s[j]) {
				i++;
				j--;
			}
			else {
				j--;
				count++;
			}
		}
		System.out.println(count);
		System.out.println(s);
		System.out.println(str.length());
	}

}

