import java.util.HashMap;

public class Test3 {

	public static void main(String[] args) {
		// unique number
		// hashmap

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		int ar[] = { 10, 5, 3, 4, 3, 5, 6 };

		for (int i = 0; i < ar.length; i++) {
			hm.put(ar[i], i);
		}
		System.out.println(hm);
	}

}
