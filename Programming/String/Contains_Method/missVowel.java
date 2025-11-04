public class missVowel {
	public static void main(String[] args) {
		String s = "AEIOUaeiou";
		String s1="india";
		String res="";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(!s1.contains(ch+"")) res += ch;
		}
		System.out.println(res);
	}

}

