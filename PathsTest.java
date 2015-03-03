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
	public void hasDirectFlight_returns_true_for_Bangalore_to_Singapore() {
		Paths newPath = new Paths();
		assertTrue(newPath.hasDirectFlight("Bangalore","Singapore"));
	}

	@Test
	public void hasDirectFlight_returns_false_for_Bangalore_to_Tokyo() {
		Paths newPath = new Paths();
		assertFalse(newPath.hasDirectFlight("Bangalore","Tokyo"));
	}

	@Test
	public void hasDirectFlight_returns_true_for_Singapore_to_Seoul() {
		Paths newPath = new Paths();
		assertTrue(newPath.hasDirectFlight("Singapore","Seoul"));
	}

	@Test
	public void hasDirectFlight_returns_true_for_Singapore_to_Dubai() {
		Paths newPath = new Paths();
		assertTrue(newPath.hasDirectFlight("Singapore","Dubai"));
	}

	@Test
	public void hasDirectFlight_returns_true_for_Seoul_to_Beijing() {
		Paths newPath = new Paths();
		assertTrue(newPath.hasDirectFlight("Seoul","Beijing"));
	}

	@Test
	public void hasDirectFlight_returns_true_for_Beijing_to_Tokyo() {
		Paths newPath = new Paths();
		assertTrue(newPath.hasDirectFlight("Beijing","Tokyo"));
	}

	@Test
	public void hasDirectFlight_returns_false_for_Bangalore_to_Seoul() {
		Paths newPath = new Paths();
		assertFalse(newPath.hasDirectFlight("Bangalore","Seoul"));
	}

	@Test
	public void hasDirectFlight_returns_false_for_Bangalore_to_Dubai() {
		Paths newPath = new Paths();
		assertFalse(newPath.hasDirectFlight("Bangalore","Dubai"));
	}

	@Test
	public void hasDirectFlight_returns_false_for_Singapur_to_Beijing() {
		Paths newPath = new Paths();
		assertFalse(newPath.hasDirectFlight("Singapore","Beijing"));
	}

	@Test
	public void hasDirectFlight_returns_false_for_Singapore_to_Tokyo() {
		Paths newPath = new Paths();
		assertFalse(newPath.hasDirectFlight("Singapore","Tokyo"));
	}

	@Test
	public void hasDirectFlight_returns_false_for_NULL_to_Tokyo() {
		Paths newPath = new Paths();
		assertFalse(newPath.hasDirectFlight(null,"Tokyo"));
	}

	@Test
	public void hasDirectFlight_returns_false_for_Singapore_to_NULL() {
		Paths newPath = new Paths();
		assertFalse(newPath.hasDirectFlight("Singapore",null));
	}

	@Test
	public void hasDirectFlight_returns_false_for_null_to_null() {
		Paths newPath = new Paths();
		assertFalse(newPath.hasDirectFlight(null,null));
	}
}