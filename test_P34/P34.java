package s108ae5001;

public class P34 {
	public static void main(String[]args)
	{
		int num1 = 3;
		int num2 = 9;
		
		System.out.println("num1和num2的各種運算:");
		System.out.println("num1+num2等於"+(num1+num2));
		System.out.println("num1-num2等於"+(num1-num2));
		System.out.println("num1*num2等於"+(num1*num2));
		System.out.println("num1/num2等於"+(num1/num2));
		System.out.println("num1%num2等於"+(num1%num2));
		
		int a = 1;
		int b = 0;
		int c = 0;
		
		b = a++;
		c = ++a;
		
		System.out.println("因為是在指定值之後才會遞增,所以b的值為"+b);
		System.out.println("因為是在遞增之後才指定值,所以c的值為"+c);
	
				
		
	}

}
