package com.mayab.desarrollo.patrones.estructura.adapter;


import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;  


public class AdptadorViejaANueva implements PersonaNueva {

	PersonaVieja personavieja;
	
	public AdptadorViejaANueva(PersonaVieja personavieja)
	{
		this.personavieja=personavieja;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		String nombre=personavieja.getName()+" " +personavieja.getLastName();
		return nombre;
	}
	@Override
	public String getEdad() {
		 String fecha=personavieja.getFechaNacimiento();  
		 Date fechanac = null;
		try {
			fechanac = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		  int age = 0;
		    Calendar born = Calendar.getInstance();
		    Calendar now = Calendar.getInstance();
		    if(fechanac!= null) {
		        now.setTime(new Date());
		        born.setTime(fechanac);  
		        age = now.get(Calendar.YEAR) - born.get(Calendar.YEAR);             
		        if(now.get(Calendar.DAY_OF_YEAR) < born.get(Calendar.DAY_OF_YEAR))  {
		            age-=1;
		        }
		    }  
		    String edad=age+"";
		    return edad;
	}
	
	
}
