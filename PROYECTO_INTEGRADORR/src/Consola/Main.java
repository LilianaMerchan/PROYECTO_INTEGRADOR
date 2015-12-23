package Consola;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.demo.entidades.Equipo;

public class Main {

	public static void main(String[] args) {
		Equipo.add(new Equipo("055555555", "Eduardo", "Guzmàn", 18));
		Equipo.add(new Equipo("0444444", "Liliana", "Merchàn", 20));
		Equipo.add(new Equipo("0222222", "Jefferson", "Mora", 21));
		
		ArrayList<Equipo> clientes=new ArrayList<Equipo>();
		Equipo cl1 = null;
		clientes.add(cl1);
		Equipo cl2 = null;
		clientes.add(cl2);
		Equipo cl3 = null;
		clientes.add(cl3);
		/*
		Cliente temp1=clientes.get(0);
		Cliente temp2=clientes.get(1);
		Cliente temp3=clientes.get(2);
		
		
		System.out.println(temp1);
		System.out.println(temp2);
		System.out.println(temp3);
		
		
		System.out.println("Tamaño de Cientes: "+clientes.size());
        for (int i=0;i<clientes.size();i++){
        	Cliente temp=clientes.get(i);
			System.out.println(temp);
		}
        */
		
		int op=0;
		do {
			System.out.println("<1> Ingresar Equipo ");
			System.out.println("<2> Modificar Integrante");
			System.out.println("<3> Eliminar Equipo");
			System.out.println("<4> Mostrar Equipo ");
			System.out.println("<5> Salir del sistema ");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Eliga una opcion por favor:");
			op=sc.nextInt();
			
			Iterator<Equipo> nombreIterator;
			switch (op){
			case 1: 
				System.out.println("Ingrese Nombredelequipo");
			    String nombres=sc.next();
			    System.out.println("Ingrese Nombredelcapitan");
			    String nombrescapi=sc.next();
			    System.out.println("Ingrese Apellidosdelcapitan");
			    String apellidoscap=sc.next();
			    System.out.println("Ingrese numerodeintegrantedelequipo");
			    int integrante=sc.nextInt();
			    
			    Equipo cl=new Equipo(apellidoscap, apellidoscap,nombres,integrante);
			   Equipo.add(cl);
			    break;
			case 2: 
				
			case 3:

				int numElementos = Equipo.size();
				System.out.println("El ArrayList tiene: "+numElementos+" elementos");

				
				System.out.println("Eliminamos el primer elemento del ArrayList ("+Equipo.get(0)+")...");
				clientes.remove(0);

			
				System.out.println("Lista de clientes actualizadas: ");
				nombreIterator = clientes.iterator();
				while(nombreIterator.hasNext()){
					Equipo elemento = nombreIterator.next();
					System.out.print(elemento+" / ");
				}

				
				numElementos = clientes.size();
				System.out.println("nNumero de elementos del ArrayList tras las eliminaciones = "+numElementos);
				break;
				
			case 4:
				System.out.println("Lista de clientes");
				for(int i=0;i<clientes.size();i++){
					Equipo temp=clientes.get(i);
					System.out.println(temp);
					
				}
			}
		}while (op!=5);
	}
}

