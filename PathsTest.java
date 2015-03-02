import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.*;


public class PathsTest {
	
	@Test
	public void isCityPresent_checks_whether_city_is_prsent (){
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
}