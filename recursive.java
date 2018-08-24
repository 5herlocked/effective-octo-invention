public class recursive {

	public static void main (String ... args) {
	
		solve (5, 1);
	}

	public static String solve (int limit, int current) {
		if (limit == current)
			System.out.println(current);
		
		System.out.println(current + " " + solve (limit, current++));
		return ((Integer)current).toString();
	}
}