//������ 2
//����� � ������� ���� ������� ����� �� 1 �� 1000
public class PrimeNum {
	public static void main(String[] args) {
		//������������ �������� "������� ���������"
		
		int n, q, p;
		
		for (n=1; n<=1000; n++) {
			
			q=(int)Math.sqrt(n);
			
			mark1: {
			for (int i=2; i<=q; i++) {
				p=n%i;
				
				if (p==0) break mark1;
			}
			System.out.print(n + " ");
			}
		}
	}
}
