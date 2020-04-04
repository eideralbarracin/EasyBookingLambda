package EasyBooking.LN;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import EasyBooking.LD.Vuelo;

public class Gestor_Vuelos {

	static List <Vuelo>Lista_vuelos;
	
	
	public static void RellenarVuelos() throws ParseException
	{
		//hemen gero se leerá de la raspberry
		
		Lista_vuelos= new ArrayList<Vuelo>();
		String myDateString_ida = "13:24"; //La hora con forma de String
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		Date date_ida = sdf.parse(myDateString_ida);
		
		String myDateString_llegada = "14:40"; //La hora con forma de String
		Date date_vuelta = sdf.parse(myDateString_llegada);
		Vuelo v1 = new Vuelo("V1","BIL","MAD",1.15,date_ida, date_vuelta,100);
		
		myDateString_ida = "1:24"; //La hora con forma de String
		sdf = new SimpleDateFormat("HH:mm");
		date_ida = sdf.parse(myDateString_ida);

		myDateString_llegada = "2:54"; //La hora con forma de String
		sdf = new SimpleDateFormat("HH:mm");
		date_ida = sdf.parse(myDateString_llegada);
		
		Vuelo v2 = new Vuelo("V2","BIL","MAD",1.30,date_ida, date_vuelta,400);
		
		myDateString_ida = "20:24"; //La hora con forma de String
		sdf = new SimpleDateFormat("HH:mm");
		date_ida = sdf.parse(myDateString_ida);

		myDateString_llegada = "21:34"; //La hora con forma de String
		sdf = new SimpleDateFormat("HH:mm");
		date_ida = sdf.parse(myDateString_llegada);
		
		Vuelo v3 = new Vuelo("V3","BIL","MAD",1.10,date_ida, date_vuelta,600);
		
		myDateString_ida = "20:04"; //La hora con forma de String
		sdf = new SimpleDateFormat("HH:mm");
		date_ida = sdf.parse(myDateString_ida);

		myDateString_llegada = "20:54"; //La hora con forma de String
		sdf = new SimpleDateFormat("HH:mm");
		date_ida = sdf.parse(myDateString_llegada);
		
		Vuelo v4 = new Vuelo("V4","BIL","MAD",0.7,date_ida, date_vuelta,10);
		
		myDateString_ida = "23:24"; //La hora con forma de String
		sdf = new SimpleDateFormat("HH:mm");
		date_ida = sdf.parse(myDateString_ida);

		myDateString_llegada = "1:24"; //La hora con forma de String
		sdf = new SimpleDateFormat("HH:mm");
		date_ida = sdf.parse(myDateString_llegada);
		Vuelo v5 = new Vuelo("V5","BIL","MAD",1.5,date_ida, date_vuelta,20);
		
		myDateString_ida = "11:00"; //La hora con forma de String
		sdf = new SimpleDateFormat("HH:mm");
		date_ida = sdf.parse(myDateString_ida);

		myDateString_llegada = "14:00"; //La hora con forma de String
		sdf = new SimpleDateFormat("HH:mm");
		date_ida = sdf.parse(myDateString_llegada);
		Vuelo v6 = new Vuelo("V6","BIL","MAD",3,date_ida, date_vuelta,300);
		
		myDateString_ida = "9:00"; //La hora con forma de String
		sdf = new SimpleDateFormat("HH:mm");
		date_ida = sdf.parse(myDateString_ida);

		myDateString_llegada = "15:00"; //La hora con forma de String
		sdf = new SimpleDateFormat("HH:mm");
		date_ida = sdf.parse(myDateString_llegada);
		Vuelo v7 = new Vuelo("V7","BIL","MAD",6,date_ida, date_vuelta,200);
		
		myDateString_ida = "00:00"; //La hora con forma de String
		sdf = new SimpleDateFormat("HH:mm");
		date_ida = sdf.parse(myDateString_ida);

		myDateString_llegada = "7:00"; //La hora con forma de String
		sdf = new SimpleDateFormat("HH:mm");
		date_ida = sdf.parse(myDateString_llegada);
		Vuelo v8 = new Vuelo("V8","BIL","MAD",7,date_ida, date_vuelta,150);
		Lista_vuelos.add(v1);
		Lista_vuelos.add(v2);
		Lista_vuelos.add(v3);
		Lista_vuelos.add(v4);
		Lista_vuelos.add(v5);
		Lista_vuelos.add(v6);
		Lista_vuelos.add(v7);
		Lista_vuelos.add(v8);
		
		
	}
	
	public static List<Vuelo> devolver_Lista() 
	{
		try {
			RellenarVuelos();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Lista_vuelos;
	}
}
