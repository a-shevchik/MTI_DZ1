import java.util.Scanner;

public class QadrEqual {
	public static void main(String[] args) {
		double a, b, c, d, x1, x2;
		
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("Введите коэффициент a: ");
	        a = in.nextDouble();
	        if (a==0) System.out.println("Первый коэффициент не может быть равен 0");
	        
		} while (a==0);
        
        System.out.print("Введите коэффициент b: ");
        b = in.nextDouble();
        System.out.print("Введите коэффициент c: ");
        c = in.nextDouble();
        
        //System.out.println("Уравнение: " + a + "x*2+" + b + "x+" + c +"=0");
        
        //дискриминант
        d=b*b-4*a*c;
        
        if (d>0) {// имеем два вещественных корня
        	x1=(-b+Math.sqrt(d))/(2*a);
        	x2=(-b-Math.sqrt(d))/(2*a);
        	
        	System.out.println("x1: " + x1 + " x2: " + x2);
        }
        else {
        	if (d==0) {// имеем один вещественный корень
        		x1=(-b)/(2*a);
        		
        		System.out.println("x1 = x2: " + x1 );
        	}
        	else { // корней нет
        		System.out.println("Нет действительных решений уравнения");
        	}
        }
        
        
        in.close();
    }   
}
