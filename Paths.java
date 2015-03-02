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

	public boolean isStationPresent(String station){
		Set<String> sourceStations = map.keySet();

		if(sourceStations.contains(station))
			return true;
		else {
			for(String source : sourceStations) {
				List<String> destinations = map.get(source);
				if(destinations.contains(station))
					return true;
			}
		}

		return false;
	}

	public boolean hasDirectFlight(String source, String destination){
		return map.get(source).contains(destination);
	}
}