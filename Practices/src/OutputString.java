
public class OutputString {

	public static void main(String[] args) {
		
		String input="I am an automation engineer";
		String output="";
		String[] str = input.split(" ");
		int len=str.length;
		String str1=str[0].toLowerCase();
		for(int i=1;i<=len-1;i++)
		{
			StringBuilder sb = new StringBuilder(str[i]);
			StringBuilder s2= sb.reverse();
			String str2= s2.toString();
			str1=str1 + " "+str2;
		}
		
		System.out.println(str1);

	}

}
