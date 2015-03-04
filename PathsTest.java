import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.*;


public class PathsTest {
	
	@Test
	public void isCityPresent_checks_whether_city_is_prsent() {
		Paths paths = new Paths();

		assertTrue(paths.isStationPresent("Bangalore"));
		assertTrue(paths.isStationPresent("Singapore"));
		assertTrue(paths.isStationPresent("Seoul"));
		assertTrue(paths.isStationPresent("Beijing"));

		assertTrue(paths.isStationPresent("Dubai"));
		assertTrue(paths.isStationPresent("Tokyo"));
		
		assertFalse(paths.isStationPresent("Chennai"));
		assertFalse(paths.isStationPresent("Stockholm"));
	}

	@Test
	public void hasWay_returns_true_for_path_between_Bangalore_to_Singapore() {
		Paths newPath = new Paths();
		assertTrue(newPath.hasWay("Bangalore","Singapore"));
		assertTrue(newPath.hasWay("Singapore","Bangalore"));
	}


	@Test
	public void hasWay_returns_true_for_path_between_Singapore_to_Seoul() {
		Paths newPath = new Paths();
		assertTrue(newPath.hasWay("Singapore","Seoul"));
		assertTrue(newPath.hasWay("Seoul","Singapore"));
	}

	@Test
	public void hasWay_returns_true_for_path_between_Singapore_to_Dubai() {
		Paths newPath = new Paths();
		assertTrue(newPath.hasWay("Singapore","Dubai"));
		assertTrue(newPath.hasWay("Dubai","Singapore"));
	}

	@Test
	public void hasWay_returns_true_for_path_between_Seoul_to_Beijing() {
		Paths newPath = new Paths();
		assertTrue(newPath.hasWay("Seoul","Beijing"));
		assertTrue(newPath.hasWay("Beijing","Seoul"));
	}

	@Test
	public void hasWay_returns_true_for_path_between_Beijing_to_Tokyo() {
		Paths newPath = new Paths();
		assertTrue(newPath.hasWay("Beijing","Tokyo"));
		assertTrue(newPath.hasWay("Tokyo","Beijing"));
	}

	@Test
	public void hasWay_returns_false_for_path_between_Singapur_to_Beijing() {
		Paths newPath = new Paths();
		assertFalse(newPath.hasWay("Singapore","Beijing"));
		assertFalse(newPath.hasWay("Beijing","Singapore"));
	}
	
	@Test
	public void hasWay_returns_false_for_NULL_to_Tokyo() {
		Paths newPath = new Paths();
		assertFalse(newPath.hasWay(null,"Tokyo"));
	}

	@Test
	public void hasWay_returns_false_for_Singapore_to_NULL() {
		Paths newPath = new Paths();
		assertFalse(newPath.hasWay("Singapore",null));
	}

	@Test
	public void hasWay_returns_false_for_path_between_null_to_null() {
		Paths newPath = new Paths();
		assertFalse(newPath.hasWay(null,null));
	}

	@Test
	public void hasPath_returns_true_if_there_is_flight_between_Bangalore_and_Tokyo (){
		Paths path = new Paths();
		assertTrue(path.hasWay("Bangalore","Tokyo"));
	}

	@Test
	public void hasPath_returns_true_if_there_is_flight_between_Tokyo_and_Bangalore (){
		Paths path = new Paths();
		assertTrue(path.hasWay("Tokyo", "Bangalore"));
	}

	@Test
	public void hasWay_returns_true_for_Bangalore_to_Seoul() {
		Paths newPath = new Paths();
		assertTrue(newPath.hasWay("Bangalore","Seoul"));
	}

	@Test
	public void hasWay_returns_true_for_Seoul_to_Bangalore() {
		Paths newPath = new Paths();
		assertTrue(newPath.hasWay("Seoul","Bangalore"));
	}

	@Test
	public void hasWay_returns_true_for_Bangalore_to_Dubai() {
		Paths newPath = new Paths();
		assertTrue(newPath.hasWay("Bangalore","Dubai"));
	}

	@Test
	public void hasWay_returns_true_for_Dubai_to_Bangalore() {
		Paths newPath = new Paths();
		assertTrue(newPath.hasWay("Dubai","Bangalore"));
	}

	@Test //[Falling Test]
	public void hasWay_returns_true_for_Singapore_to_Tokyo() {
		Paths newPath = new Paths();
		assertTrue(newPath.hasWay("Singapore","Tokyo"));
	}

	@Test
	public void hasWay_returns_true_for_Tokyo_to_Singapore() {
		Paths newPath = new Paths();
		assertTrue(newPath.hasWay("Tokyo","Singapore"));
	}	
}