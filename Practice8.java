import java.util.Scanner;

public class Practice8 {
	public static boolean exists(int a[], int from, int r) {
		for(int j=0; j<from; j++) {
			if(a[j] == r) {
				return true;
			}
		}  
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int n = scanner.nextInt();
		
		if(n <= 0 || n > 100) {
			System.out.print("1~100사이로 입력하세요!");   
			scanner.close();
			return;
		}
		int array [] = new int [n];
  
		for(int i=0; i<array.length; i++) {
			int r = (int)(Math.random()*100 + 1);

			if(exists(array, i, r)) {
				i--;
				continue;
			}
			array[i] = r;   
		}

		for(int i=0; i<array.length; i++) {
			if(i%10 == 0) System.out.println(); // 다음 줄로 넘어가기
			System.out.print(array[i] + " ");
		}

		scanner.close();
	}
}