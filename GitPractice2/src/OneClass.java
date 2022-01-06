import java.util.HashSet;
import java.util.Set;

public class OneClass {

	public static void main(String[] args) {
		
		int [] num = {1,1,2,2,3,3,4,4,5,6,7,8,8,9,9};
		Set<Integer> set = new HashSet<>();
		for (int i=0;i<num.length;i++) {
			set.add(num[i]);
		}
		System.out.println(set);
	}
	public static void newNumber(int a, int b){
		System.out.println(a + b);

}
