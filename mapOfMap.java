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

		int[] array = new int[7];
		int k = 0;

		for (String m : car.keySet()) {
			for (String v : car.get(m).keySet()) {
				array[k++] = car.get(m).get(v);
			}
		}

		int min = array[0];
		for (int i = 0; i < 7; i++) {
			if (array[i] < min)
				min = array[i];
		}

		for (String m : car.keySet()) {
			for (String v : car.get(m).keySet()) {
				if (car.get(m).get(v) == min) {
					carModel = v;
					carName = m;
				}
			}
		}

		System.out.print("Earliest car was " + carName + ", Model " + carModel
				+ " and was manufactured in " + min);
	}
}

