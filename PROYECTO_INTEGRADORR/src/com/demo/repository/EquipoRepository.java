package com.demo.repository;

import java.util.ArrayList;

import com.demo.entidades.Equipo;

public class EquipoRepository {

private static ArrayList<Equipo> Equipos=new ArrayList<Equipo>();
	
	public EquipoRepository(){
		Equipos.add(new Equipo("055555555", "Eduardo", "Guzmàn", 18));
		Equipos.add(new Equipo("0444444", "Liliana", "Merchàn", 20));
		Equipos.add(new Equipo("0222222", "Jefferson", "Mora", 21));
		Equipos.add(new Equipo("0999999", "Isabel", "Pardo", 22));
	}
	
	public static void ingresar(Equipo Equipo){
		Equipos.add(Equipo);
	}
	
	public ArrayList<Equipo> getEquipos(){
		return Equipos;
	}
	
	public Equipo getEquipo(String  Nombredelequipo){
		for(int i=0;i<Equipo.size();i++){
			if(Equipos.get(i).getNombredelequipo().equals( Nombredelequipo))
				return Equipos.get(i);
		}
		return null;
	}
	

}




