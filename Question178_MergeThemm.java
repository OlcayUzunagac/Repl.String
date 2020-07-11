package week6_String;

public class Question178_MergeThemm {

	public static void main(String[] args) {
		// olcay // Jul 9, 2020
		
		System.out.println(mergeStrings("wocader", "1"));
	}
	
	public static String mergeStrings(String s1, String s2) {
		
		String extra="";
		String main="";
		
		if(s1.length()>s2.length()) {
			extra = s1.substring(s2.length());
			for(int i=0; i<s2.length();i++) {
				for(int j=i;j<=i;j++) {
					main=main+s1.charAt(i)+s2.charAt(j);
				}
			}
			
		}else {
			extra = s2.substring(s1.length());				
			for(int i=0; i<s1.length();i++) {
				for(int j=i;j<=i;j++) {
					main=main+s1.charAt(i)+s2.charAt(j);
			}
		}
			
		}
		main=main.concat(extra);
		return main;
	
	}

}
