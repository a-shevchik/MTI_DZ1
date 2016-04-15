//Задача 2
//Вывод в консоль всех простых чисел от 1 до 1000
public class PrimeNum {
	public static void main(String[] args) {
		//Используется алгоритм "Перебор делителей"
		
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
