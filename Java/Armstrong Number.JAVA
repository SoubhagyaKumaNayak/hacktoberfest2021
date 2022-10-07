import java.lang.Math;
import java.util.*;
class ARMstrong {
	static int NthArmstrong(int n)
	{
		int count = 0;
		for (int i = 1; i <= Integer.MAX_VALUE; i++) {
			int num = i, rem, digit = 0, sum = 0;
			num = i;
			digit = (int)Math.log10(num) + 1;
        while (num > 0) {
				rem = num % 10;
				sum = sum + (int)Math.pow(rem, digit);
				num = num / 10;
			}
			if (i == sum)
				count++;
			if (count == n)
				return i;
		}
		return n;
	}
	public static void main(String[] args)
	{
    Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(NthArmstrong(n));
	}
}

