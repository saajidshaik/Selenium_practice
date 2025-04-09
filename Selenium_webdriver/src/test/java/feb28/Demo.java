package feb28;
import java.util.ArrayList;
import java.util.Iterator;
public class Demo {
public static void main(String[] args) {
		ArrayList<String> str= new ArrayList<String>();
		str.add("mon");
		str.add("tue");
		str.add("wed");
		str.add("thu");
		str.add("fri");
		str.add("sat");
		str.add("sun");
		Iterator<String>  x = str.iterator();
		while (x.hasNext()) {
			String each = (String) x.next();
			System.out.println(each);
			}
		}
}