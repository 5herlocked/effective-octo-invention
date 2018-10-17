//author: Shardul Vaidya
//Thursday, 12:45

public class Homework4 {
	public static void main (String ... args) {
        System.out.println(repeat("cs", 9));
        System.out.println(isReverse("RaceCar", "raCecaR"));
        System.out.println(starString(4));
	}
	
	private static String repeat(String s, int times) {
        if (times == 0) return "";
        
        return s + repeat(s, times-1);
    }
    
    private static boolean isReverse(String a, String b) {
        // In collaboration with Jose
        if (a.length() == 0 && b.length() == 0) return true;
        
        else if (a.length() != b.length()) return false;
        
        if (a.charAt(0) == b.charAt(b.length()-1))
            return isReverse(a.substring(1), b.substring(0,b.length()-1)) && true;
        
        return false;
    }
    
    private static String starString(int n) { return starString(n, "*"); }
    
    private static String starString(int n, String s) {
        if (n == 1)
            return "**";
        
        // Compund effect on the number of strings per iteration
        String number = s + s;
        
        return number + starString(n-1, number);
    }
}
