import cars.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
public class Mobile {
	public static void main(String[] args) throws IOException
	{
		
//		Begin process. Explaining something important 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Mobile.console("Welcome. Anyway we have some cars");
		Mobile.console("This is the list of the cars. Enter the name to choose your car");
		Mobile.console("Sedan: get Sedan car");
		Mobile.console("SUV: get SUV car");
		Mobile.console("Truck: get Truck");
		Mobile.console("Bus: get Bus");
		
//		Getting car type and it will check if the class is exists or not
		Mobile.console("Type your the car type you want to choose");
		Cars carType = Mobile.getCar(br.readLine());
		if(carType instanceof Cars)
		{
			Mobile.console("Your car: "+carType.getType());
		}
		else
			Mobile.console("Cannot find car you type");
	}
	public static Cars getCar(String carType)
	{
//		Registering cars type
		Map<String, Cars> carList =new HashMap<String, Cars>();
		carList.put("sedan", new Sedan());
		if(carList.containsKey(carType))
			return carList.get(carType);
		else
			return null;
	}
	public static void console(String message)
	{
		System.out.println(message);
	}
}
