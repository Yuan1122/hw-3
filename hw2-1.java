import java.util.Scanner;
import java.util.*;

class hw21{
	public static void main(String[] args){
		HashMap<String,Integer> hash = new HashMap<String,Integer>();
		int opt = 0;
		do{
			System.out.println("1)��J���. 2)�d�ߦ��Z. 3)�L�X���. -1)���}. :");
			Scanner option = new Scanner(System.in);
			Scanner str = new Scanner(System.in);
			if(option.hasNextInt())
				opt = option.nextInt();
			else
				continue;
			switch(opt)
			{
				case 1:
					System.out.println("�ǥͦW�r : ");
					String nam = str.nextLine();
					Scanner keyI = new Scanner(System.in);
					int i = -1;

					while(i < 0 || i > 100){
							System.out.println("�ǥͦ��Z : ");
							i = keyI.nextInt();
					}
					hash.put(nam,i);
					break;
				case 2:
					System.out.println("�ǥͦW�r : ");
					nam = str.nextLine();
					if(hash.get(nam) == null)
						System.out.println("�L���ǥ�!\n");
					else
						System.out.println("���� : " + hash.get(nam));
					break;
				case 3:
					for(Object k : hash.keySet()){
						System.out.println(k + " : " + hash.get(k));
					}
					break;
			}
		}while(opt != -1);
	}
}