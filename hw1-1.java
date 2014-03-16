import java.util.Scanner;
import java.util.*;
class hw11{
	public static void main(String arg[]){
		ArrayList <String> myList = new ArrayList<String>();
		int count=0;
		System.out.println("½Ð¿é¤J¦r¦ê : ");
		Scanner stdIn = new Scanner(System.in);
		String s = stdIn.nextLine();
		s=s.toLowerCase();
		String [] tokens = s.split(" |;|,|!|-|\\?|\\.");  /*¤Á³Î¦r¦ê*/
		for (String temp:tokens){
			if(temp.length()>0){
				try{
					count +=Integer.parseInt(temp); /*²Ö­p¼Æ¦r*/
				}
				catch (Exception e){
					myList.add(temp);
				}
			}
		}
		for(String a:myList)
			System.out.println(a);
		System.out.println("count = " + count);
	}
}