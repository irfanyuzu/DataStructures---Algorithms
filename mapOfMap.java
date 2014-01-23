import java.util.HashMap;


public class mapOfMap {
	public static void main(String[] args){
		String Model = "";
		String carName = "";
		
		HashMap<String,HashMap<String,Integer>> car = new HashMap<String,HashMap<String,Integer>>();
		
			car.put("Ford",new HashMap<String,Integer>());
			car.put("Maruti",new HashMap<String,Integer>());
			car.put("Honda",new HashMap<String,Integer>());
			car.put("Hyundai",new HashMap<String,Integer>());
			
			car.get("Ford").put("F1", 2000);
			car.get("Ford").put("F2", 1998);
			car.get("Maruti").put("M1", 1999);
			car.get("Maruti").put("M2", 2001);
			car.get("Honda").put("Year", 2004);
			car.get("Hyundai").put("Year", 2002);
			
			int[] array = new int[6];
			int k =0;
			for(String m : car.keySet()){
				HashMap<String, Integer> temp = new HashMap<String,Integer>();
				temp = car.get(m);
				for(String s : temp.keySet()){
					array[k++] = temp.get(s);
				}
			}
			
			int min = array[0];
			for(int i=0; i<6; i++){
				if(array[i] < min)
					min = array[i];
			}			
			
						
			for(String m : car.keySet()){
				HashMap<String, Integer> temp1 = new HashMap<String,Integer>();
				temp1 = car.get(m);
				for(String s : temp1.keySet()){
					if(temp1.get(s) == min){
						Model = s;
						carName = m;
					}
				}
			}
			
			System.out.print("Earliest car was " + carName + " , Model " + Model + " and was manufactured in " + min);
	}
}
