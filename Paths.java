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
		if(source==null || 
			destination==null ||
			!isStationPresent(source) ||
			 !isStationPresent(destination) || 
			 map.get(source)==null)
			return false;
		return map.get(source).contains(destination);
	}

	public static void main(String[] args) {
		String sourceStation = args[0];
		String destinationStation = args[1];
		Paths newPath = new Paths();
		if(!newPath.isStationPresent(sourceStation)){
			System.out.println("No city named '"+sourceStation+"' in database");
			return;
		}
		if(!newPath.isStationPresent(destinationStation)){
			System.out.println("No city named '"+destinationStation+"' in database");
			return;
		}
		else
			System.out.println(newPath.hasDirectFlight(sourceStation,destinationStation));
	}
}

// public static void main(String[] args) {
// 		String source = args[0];
// 		String destination = args[1];
// 		Paths paths = new Paths();
// 		if(!paths.isCityPresent(source)){
// 			System.out.println("No city named '"+source+"' in database");
// 			return;
// 		}
// 		if(!paths.isCityPresent(destination)){
// 			System.out.println("No city named '"+destination+"' in database");
// 			return;
// 		}
// 		else
// 			System.out.println(paths.findFlight(source,destination));
// 	}