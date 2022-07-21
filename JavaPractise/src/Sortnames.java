import java.util.Scanner;

public class Sortnames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number of names"+'\n');
		int n=s.nextInt();
		String names[]=new String[n];
		System.out.println("Enter the names"+'\n');
		for(int i=0;i<n;i++)
		{
			names[i]=s1.nextLine();
		}
		for(int j=0;j<n;j++)
		{
			for(int k=j+1;k<n;k++) {
				if(names[j].compareTo(names[k])>0)
				{
					String temp=names[j];
					names[j]=names[k];
					names[k]=temp;
					
				}
			}
		}
		
		for (String name : names) {
			System.out.println(name);
		}

	}

}
