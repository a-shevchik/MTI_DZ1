import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
				
		Scanner in = new Scanner(System.in);
		
		System.out.print("Введите целое число: ");
        int n = in.nextInt();
        int a=n, div = 1, res = 0;
        
        while (a>0){
        	a = a- div;  div = div + 2;
        	res += a < 0 ? 0 : 1; 
        }
        
        System.out.println("Квадратный корень из " + n + ": " + res);
        
        //Проверка результата
        
        if (n==(res*res)) System.out.println("Результат правильный: "+res+" * "+res+" = "+n);
        in.close();
	}

}
