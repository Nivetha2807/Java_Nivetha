import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LettersCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		System.out.println("Enter the name");
		String str=s.next();
		StringBuilder sb=new StringBuilder();
		Map<Character,Integer> map1=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			if(map1.get(str.charAt(i))!=null) {
				map1.put(str.charAt(i),map1.get(str.charAt(i))+1);
			}
			else {
				map1.put(str.charAt(i),1 );
			}
		}
		for (Character mapkey : map1.keySet()) {
			System.out.println("key="+mapkey);
			sb.append(mapkey);
			System.out.println("Value="+map1.get(mapkey));
			sb.append(map1.get(mapkey));
			
		}
		System.out.println(sb);
	}

}
