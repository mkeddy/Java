import java.util.ArrayList;
import java.util.HashMap;

public class Arrays {
	public void run() {
		
		HashMap<String, String> capitalCities = new HashMap<>();
		
		capitalCities.put("Ireland", "Dublin");
		capitalCities.put("England", "Londin"); //incorrect spelling
		capitalCities.put("France", "Paris");
		
		System.out.println(capitalCities.get("Ireland"));
		
		capitalCities.replace("England", "London"); //correct spelling
		System.out.println(capitalCities.get("England"));
		
		capitalCities.remove("France"); 
		capitalCities.put("Germany", "Berlin");
		System.out.println(capitalCities.get("Germany"));
		
		capitalCities.remove("France");
		System.out.println(capitalCities.get("France"));
	}

}
