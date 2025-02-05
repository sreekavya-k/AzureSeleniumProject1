package corejava;

public class StringConcept {

	public static String removeCharAt(String s,int position) {
		return s.substring(0,position)+s.substring(position+1);
		//s+ 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//remove character at certain postion
		String str="This is Java";
		System.out.println(removeCharAt(str, 3));
		//replace substring inside a string by another one
		String str1="Hello World!";
		System.out.println(str1.replace('H', 'W'));
		System.out.println(str1.replaceFirst("He", "We"));
		System.out.println(str1.replaceAll("Hello", "Wonder"));
		StringBuffer sb= new StringBuffer("SeleniumAutomation");
		StringBuffer sb2= new StringBuffer("JavaAutomation");
		System.out.println(sb.reverse());
		System.out.println(sb2.reverse());
	}

}
