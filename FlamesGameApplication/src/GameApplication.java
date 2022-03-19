
public class GameApplication {

	public static void main(String[] args) {
		String s1 = "Ajay";
		String s2 = "Priya";
		int i, j, count = 0, temp = 0;
		for(i = temp;i<s1.length();i++) {
			for(j = 0;j<s2.length();j++) {
				if(String.valueOf(s1.charAt(i)).equalsIgnoreCase(String.valueOf(s2.charAt(j)))) {
					count +=1;
					s1 = s1.replace(String.valueOf(s1.charAt(i)), "");
					temp = 0;
					i = temp;
					s2 = s2.replace(String.valueOf(s2.charAt(j)), "");
					break;
				}
			}
		}
		
		StringBuffer s3 = new StringBuffer("flames");
		int d = s1.length()+s2.length();
		for(i = 0;i<5;i++) {
			int n = -1, l= 0, p = 0;
			for(j = 1;j<=d;j++) {
				n++;
				l++;
				if(n > s3.length()-1) {
					if(l == d) {
						s3.deleteCharAt(p);
						String s4 = s3.substring(p, s3.length());
						s3.delete(p, s3.length());
						s3.insert(0, s4);
						break;
					} else {
						p++;
						if(p == s3.length()) {
							p = 0;
						}
					}
				}
				else {
					char e = s3.charAt(n);
					if(l == d) {
						s3.deleteCharAt(n);
						String s4 = s3.substring(n, s3.length());
						s3.delete(n, s3.length());
						s3.insert(0, s4);
						break;
					}
				}
			}
		}
		
		
		
		System.out.println("Total Count = "+(s1.length()+s2.length()));
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3.charAt(0));
		
		char result = s3.charAt(0);
		
		switch(result) {
		case 'f':
			System.out.println(s2+" is your Friend");
			break;
		case 'l':
			System.out.println(s2+" is your Friend");
			break;
		case 'a':
			System.out.println(s2+" is your Friend");
			break;
		case 'm':
			System.out.println(s2+" is your Friend");
			break;
		case 'e':
			System.out.println(s2+" is your Friend");
			break;
		case 's':
			System.out.println(s2+" is your Friend");
			break;
		default:
			System.out.println("There is some error in processing your Output!!!" 
					+ "Please check your inputs and then try again!!");
		}
		
	}
}
