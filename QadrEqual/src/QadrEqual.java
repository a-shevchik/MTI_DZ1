import java.util.Scanner;

public class QadrEqual {
	public static void main(String[] args) {
		double a, b, c, d, x1, x2;
		
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("������� ����������� a: ");
	        a = in.nextDouble();
	        if (a==0) System.out.println("������ ����������� �� ����� ���� ����� 0");
	        
		} while (a==0);
        
        System.out.print("������� ����������� b: ");
        b = in.nextDouble();
        System.out.print("������� ����������� c: ");
        c = in.nextDouble();
        
        //System.out.println("���������: " + a + "x*2+" + b + "x+" + c +"=0");
        
        //������������
        d=b*b-4*a*c;
        
        if (d>0) {// ����� ��� ������������ �����
        	x1=(-b+Math.sqrt(d))/(2*a);
        	x2=(-b-Math.sqrt(d))/(2*a);
        	
        	System.out.println("x1: " + x1 + " x2: " + x2);
        }
        else {
        	if (d==0) {// ����� ���� ������������ ������
        		x1=(-b)/(2*a);
        		
        		System.out.println("x1 = x2: " + x1 );
        	}
        	else { // ������ ���
        		System.out.println("��� �������������� ������� ���������");
        	}
        }
        
        
        in.close();
    }   
}
