package EasyBooking.LD;

import java.util.Date;

import javax.jdo.annotations.ForeignKey;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;


public class Vuelo {
	@PrimaryKey
	private String codVuelo;
	private String origen;
	private String destino; 
	private Aerolinea aerolinea;
	private Avion avion; 
	private double duracion;
	private Date hora_salida;
	private Date hora_llegada; 
	private double precio;

	
	
	public Vuelo(String codVuelo, String origen, String destino, double duracion, Date hora_salida, Date hora_llegada,
			double precio) {
		super();
		this.codVuelo = codVuelo;
		this.origen = origen;
		this.destino = destino;
		this.duracion = duracion;
		this.hora_salida = hora_salida;
		this.hora_llegada = hora_llegada;
		this.precio = precio;
	}

	public Vuelo(String codigo, String origen, String destino,Aerolinea aerolinea, Avion avion, double duracion, Date hora_salida,
			Date hora_llegada, double precio) {
		super();
		this.codVuelo = codigo;
		this.origen = origen;
		this.destino = destino;
		this.avion = avion;
		this.duracion = duracion;
		this.hora_salida = hora_salida;
		this.hora_llegada = hora_llegada;
		this.precio = precio;
		this.aerolinea = aerolinea;
	}

	public String getCodVuelo() {
		return codVuelo;
	}
	public void setCodVuelo(String codVuelo) {
		this.codVuelo = codVuelo;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Avion getAvion() {
		return avion;
	}
	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public Date getHora_salida() {
		return hora_salida;
	}
	public void setHora_salida(Date hora_salida) {
		this.hora_salida = hora_salida;
	}
	public Date getHora_llegada() {
		return hora_llegada;
	}
	public void setHora_llegada(Date hora_llegada) {
		this.hora_llegada = hora_llegada;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Aerolinea getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}
	

	 
}
