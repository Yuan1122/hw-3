import java.util.Scanner;
import java.util.*;
import java.io.*;

class hw31{
	public static void main(String[] args)throws IOException{
		HashMap<String,Integer> hash = new HashMap<String,Integer>();
		int opt = 0,count = 0;
		Scanner stdIn = new Scanner(System.in);
		try{
				FileReader cptr = new FileReader("hw31.txt");
				BufferedReader fileOpen = new BufferedReader(cptr);

				String str = fileOpen.readLine();
				count=Integer.parseInt(str);

				while( (str = fileOpen.readLine()) != null ){
					String[] tokens = str.split(" |,|!|-|_|\\.|\\?");
					String word = tokens[0];
					int countNum = Integer.parseInt(tokens[1]);
					hash.put(word,countNum);
			}
			cptr.close();
		}
		catch(IOException e){
			System.out.println("�LŪ����e�O��!\n\n");
		}

		while(true){
			System.out.println("1)��J�r�� 2)�j�M��r 3)�L�X���G -1)���}�@: ");
			opt = stdIn.nextInt();
			if(opt == 1){
				String s = stdIn.nextLine();
				System.out.println("�п�J�r�� : ");
				s = stdIn.nextLine();
				s=s.toLowerCase();
				String [] tokens = s.split(" |,|!|-|_|\\.|\\?");
				for (String str:tokens){
					if(str.length()>0){
						try{
							count +=Integer.parseInt(str);
						}
						catch (Exception e){
							if(hash.get(str) == null)
								hash.put(str,1);
							else{
								int valueNum = hash.get(str) + 1;
								hash.put(str,valueNum);
							}
						}
					}
				}
			}
			else if(opt == 2){
				Scanner sear = new Scanner(System.in);
				System.out.print("����r(�Ʀr����) : ");
				String key = sear.nextLine();
				if(hash.get(key) == null)
					System.out.println("�L�����!\n");
				else
					System.out.println("�X�{���� :" + hash.get(key));
			}
			else if(opt == 3){
				for(Object t : hash.keySet())
						System.out.println(t + " : " + hash.get(t));
					System.out.println("�Ʀr�`�X = " + count);
			}
			else if(opt == -1){
				FileWriter fWrite = new FileWriter("hw31.txt");
				BufferedWriter buFileWite = new BufferedWriter(fWrite);
				String tempValue = Integer.toString(count);
				buFileWite.write(tempValue);
				buFileWite.newLine();
				for(Object k : hash.keySet()){
					buFileWite.write(k + " " + hash.get(k));
					buFileWite.newLine();
				}
				buFileWite.flush();
				buFileWite.close();
				break;
			}
		}
    }
}