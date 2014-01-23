import java.util.HashMap;

public class mapOfMap {
	public static void main(String[] args) {
		String carModel = "";
		String carName = "";

		HashMap<String, HashMap<String, Integer>> car = new HashMap<String, HashMap<String, Integer>>();

		car.put("Ford", new HashMap<String, Integer>());
		car.put("Maruti", new HashMap<String, Integer>());
		car.put("Honda", new HashMap<String, Integer>());
		car.put("Hyundai", new HashMap<String, Integer>());

		car.get("Ford").put("F1", 2000);
		car.get("Ford").put("F2", 1998);
		car.get("Maruti").put("M1", 1999);
		car.get("Maruti").put("M2", 2001);
		car.get("Honda").put("H01", 2004);
		car.get("Hyundai").put("HY1", 2002);
		car.get("Hyundai").put("HY2", 1995);
		car.get("Hyundai").put("HY3", 1990);

		
		int count = 0;
		int min = 0;
		
		for (String m : car.keySet()) {
			for (String v : car.get(m).keySet()) {
				if (count == 0){
					min = car.get(m).get(v);
					carModel = v;
					carName = m;
					count++;
				}
				else {
					if(car.get(m).get(v) < min){
						min = car.get(m).get(v);
						carModel = v;
						carName = m;
					}
				}				
			}
		}



		System.out.print("Earliest car was " + carName + ", Model " + carModel
				+ " and was manufactured in " + min);
	}
}
