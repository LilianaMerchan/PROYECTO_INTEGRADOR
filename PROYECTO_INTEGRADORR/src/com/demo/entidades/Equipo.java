package com.demo.entidades;

public class Equipo {

	private String Nombredelequipo;
	private String Nombredelcapitan;
	private String Apellidosdelcapitan;
	private int numerodeintegrantedelequipo;
	
    public Equipo(){	
	}
    public Equipo(String Nombredelequipo, String  Nombredelcapitan, String Apellidosdelcapitan,
			int numerodeintegrantedelequipo) {
		super();
		this.Nombredelequipo = Nombredelequipo;
		this.Nombredelcapitan = Nombredelcapitan;
		this.Apellidosdelcapitan = Apellidosdelcapitan;
		this.numerodeintegrantedelequipo= numerodeintegrantedelequipo;
	}
	public String getNombredelequipo() {
		return Nombredelequipo;
	}
	public void setIdentificacion(String Nombredelequipo) {
		this.Nombredelequipo = Nombredelequipo;
	}
	public String getNombredelcapitan() {
		return Nombredelcapitan;
	}
	public void setNombredelcapitan(String Nombredelcapitan) {
		this.Nombredelcapitan = Nombredelcapitan;
	}
	public String getApellidosdelcapitan() {
		return Apellidosdelcapitan;
	}
	public void setApellidosdelcapitan(String Apellidosdelcapitan) {
		this.Apellidosdelcapitan = Apellidosdelcapitan;
	}
	public int getnumerodeintegrantedelequipo() {
		return numerodeintegrantedelequipo;
	}
	public void setnumerodeintegrantedelequipo(int numerodeintegrantedelequipo) {
		this.numerodeintegrantedelequipo = numerodeintegrantedelequipo;
	}

	@Override
	public String toString() {
		return "Equipo [Nombredelequipo=" + Nombredelequipo+ ", Nombredelcapitan="
				+ Nombredelcapitan + ",Apellidosdelcapitan=" + Apellidosdelcapitan + ", numerodeintegrantedelequipo=" + numerodeintegrantedelequipo + "]";
	}
	public static int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void add(Equipo equipo) {
		// TODO Auto-generated method stub
		
	}
	public static String get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}



	

