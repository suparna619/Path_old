import java.util.*;


public class Paths {
	static Map<String, List<String>> map = new HashMap<String, List<String>>();

	static{
		List<String> bangalore = new ArrayList<String>();
		bangalore.add("Singapore");
		List<String> singapore = new ArrayList<String>();
		singapore.add("Seoul");
		singapore.add("Dubai");
		List<String> seoul = new ArrayList<String>();
		seoul.add("Beijing");
		List<String> beijing = new ArrayList<String>();
		beijing.add("Tokyo");

		map.put("Bangalore",bangalore);
		map.put("Singapore",singapore);
		map.put("Seoul",seoul);
		map.put("Beijing",beijing);
	}
}