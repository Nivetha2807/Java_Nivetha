
public class String_SplittingNumbersAndChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="June 21st 2022";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a')
			{
				if(str.charAt(i)<='z')
					System.out.print(str.charAt(i));
			}
			else if(str.charAt(i)>='A')
			{
				if(str.charAt(i)<='Z')
					System.out.print(str.charAt(i));
			}			
		}
		System.out.println();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0')
			{
				if(str.charAt(i)<='9')
					System.out.print(str.charAt(i));
			}
			
			
		}
	
	}		
	}


