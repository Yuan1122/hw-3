import java.util.Scanner;
import java.util.*;

class hw21{
	public static void main(String[] args){
		HashMap<String,Integer> hash = new HashMap<String,Integer>();
		int opt = 0;
		do{
			System.out.println("1)輸入資料. 2)查詢成績. 3)印出資料. -1)離開. :");
			Scanner option = new Scanner(System.in);
			Scanner str = new Scanner(System.in);
			if(option.hasNextInt())
				opt = option.nextInt();
			else
				continue;
			switch(opt)
			{
				case 1:
					System.out.println("學生名字 : ");
					String nam = str.nextLine();
					Scanner keyI = new Scanner(System.in);
					int i = -1;

					while(i < 0 || i > 100){
							System.out.println("學生成績 : ");
							i = keyI.nextInt();
					}
					hash.put(nam,i);
					break;
				case 2:
					System.out.println("學生名字 : ");
					nam = str.nextLine();
					if(hash.get(nam) == null)
						System.out.println("無此學生!\n");
					else
						System.out.println("分數 : " + hash.get(nam));
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