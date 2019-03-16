package com.bishi;
import java.util.*;
public class QuNaEr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, I, J, i, j, k, t, clk;
		long x;
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		n = Integer.parseInt(str[0]);
		I = Integer.parseInt(str[1]);
		J = Integer.parseInt(str[2]);
		x = 0;

		i = 1;

		j = 0;

		for (k = 0; k < n / 2 + n % 2; k++)

		{

			if (i != I)

			{

				j = j + (n - 2 * k);

				x = x + (n - 2 * k);

			}

			else

			{

				x = x + (J - j);

				break;

			}

			if (j != J)

			{

				i = i + (n - 2 * k - 1);

				x = x + (n - 2 * k - 1);

			}

			else

			{

				x = x + (I - i);

				break;

			}

			if (i != I)

			{

				j = j - (n - 2 * k - 1);

				x = x + (n - 2 * k - 1);

			}

			else

			{

				x = x + (j - J);

				break;

			}

			if (j != J)

			{

				i = i - (n - 2 * k - 2);

				x = x + (n - 2 * k - 2);

			}

			else

			{

				x = x + (i - I);

				break;

			}

		}
		System.out.println(x);
	}

}
