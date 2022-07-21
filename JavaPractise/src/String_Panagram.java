
public class String_Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="The quick brown fox jumps over the lazy dog";
		Boolean result= Ispanagram(s);
		System.out.println(result);
	}

	public static boolean Ispanagram(String s) {
		// TODO Auto-generated method stub
		
		if(s.length()<26)
			return false;
		else
		{
			char ch;
			for(ch = 'a';ch<='z';ch++) {
				if(s.indexOf(ch)<0)
					return false;
			}
			return true;
		}
	}

}
