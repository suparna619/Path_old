import java.util.*;


public class Paths {
	static Map<String, List<String>> map = new HashMap<String, List<String>>();
	List<String> sourceToDestinationPath = new ArrayList<String>();
	
	static{
		List<String> bangalore = new ArrayList<String>();
		bangalore.add("Singapore");
		List<String> singapore = new ArrayList<String>();
		singapore.add("Bangalore");
		singapore.add("Seoul");
		singapore.add("Dubai");
		List<String> seoul = new ArrayList<String>();
		seoul.add("Singapore");
		seoul.add("Beijing");
		List<String> beijing = new ArrayList<String>();
		beijing.add("Tokyo");
		beijing.add("Seoul");
		List<String> dubai = new ArrayList<String>();
		dubai.add("Singapore");
		List<String> tokyo = new ArrayList<String>();
		tokyo.add("Beijing");
		
		map.put("Bangalore", bangalore);
		map.put("Singapore", singapore);
		map.put("Seoul", seoul);
		map.put("Beijing", beijing);
		map.put("Dubai", dubai);
		map.put("Tokyo", tokyo);
	}

	public boolean isStationPresent(String station){
		Set<String> sourceStations = map.keySet();
		if(sourceStations.contains(station))
			return true;
		else{
			for(String source : sourceStations){
				List<String> destinations = map.get(source) ;
				if(destinations.contains(station))
					return true;
			}
		}
		return false;
	}

	public boolean hasWay(String source, String destination){
		sourceToDestinationPath.add(source);
		return (findWay(source,destination)) ? true : false;
	}

	public boolean findWay(String source, String destination){
		if(map.get(source) == null)
			return false;
		if(map.get(source).contains(destination)){
			sourceToDestinationPath.add(destination);
			return true;
		}
		if(!map.get(source).contains(destination)){			
			int size = map.get(source).size();
			for(int i = 0; i < size; i++){
				if(!sourceToDestinationPath.contains(map.get(source).get(i))){
					sourceToDestinationPath.add(map.get(source).get(i));
					return findWay(map.get(source).get(i),destination);
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String sourceStaton = args[0];
		String destinationStation = args[1];
		Paths newPath = new Paths();
		if(!newPath.isStationPresent(sourceStaton)){
			System.out.println("No city named '" + sourceStaton + "' in database");
			return;
		}
		if(!newPath.isStationPresent(destinationStation)){
			System.out.println("No city named '" + destinationStation + "' in database");
			return;
		}
		else
			System.out.println(newPath.hasWay(sourceStaton,destinationStation));
	}
}