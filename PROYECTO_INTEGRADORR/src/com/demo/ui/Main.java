package com.demo.ui;

import java.util.ArrayList;

import com.demo.entidades.Equipo;
import com.demo.repository.EquipoRepository;

public class Main {

	public static void main(String[] args) {
		EquipoRepository clienteRepository=new EquipoRepository();
		Equipo cl1=new Equipo("02222222", "Maria", "Chilàn", 19);
		Equipo cl2=new Equipo("09999999", "Daniela", "Alvarado", 18);
		
		EquipoRepository.ingresar(cl1);
		EquipoRepository.ingresar(cl2);
		
		ArrayList<Equipo> temp=clienteRepository.getEquipos();
		
		for(int i=0;i<temp.size();i++){
			System.out.println(temp.get(i));
		}
		
		
	}

}