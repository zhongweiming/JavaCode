import java.util.Scanner;
public class BigSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0,k=0;
		char str1[]={0};
		char str2[]={0};
		char str3[]= {0};
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		str1 = str.toCharArray();
		while(i<str.length())
		    {
		        if(str1[i]>='A'&&str1[i]<='Z')
		        {
		            str2[j++]=str1[i];
		        }
		        else if(str1[i]>='a'&&str1[i]<='z') {
		            str3[k]=str1[i];
		            k++;
		        }
		        i++;
		    }
		    for(int z=0;z<j;z++)
		    {
		        str3[k]=str2[z];
		        k++;
		    }
		 System.out.println(str3);

	}

}
