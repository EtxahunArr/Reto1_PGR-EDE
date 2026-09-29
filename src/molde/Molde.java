package molde;

public class Molde {
	
	
	String nombrenave;
	int aniocreacion;
	int   anioLanzamiento;
	int capacidad;
	int tripulantes;
	

	public Molde(String nombrenave, int aniocreacion, int anioLanzamiento, int capacidad, int tripulantes) {
		super();
		this.nombrenave = nombrenave;
		this.aniocreacion = aniocreacion;
		this.anioLanzamiento = anioLanzamiento;
		this.capacidad = capacidad;
		this.tripulantes = tripulantes;
	}
	public String getNombrenave() {
		return nombrenave;
	}
	public void setNombrenave(String nombrenave) {
		this.nombrenave = nombrenave;
	}
	public int getAniocreacion() {
		return aniocreacion;
	}
	public void setAniocreacion(int aniocreacion) {
		this.aniocreacion = aniocreacion;
	}
	public int getAnioLanzamiento() {
		return anioLanzamiento;
	}
	public void setAnioLanzamiento(int anioLanzamiento) {
		this.anioLanzamiento = anioLanzamiento;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public int getTripulantes() {
		return tripulantes;
	}
	public void setTripulantes(int tripulantes) {
		this.tripulantes = tripulantes;
	}
	@Override
	public String toString() {
		return "Molde [nombrenave=" + nombrenave + ", aniocreacion=" + aniocreacion + ", anioLanzamiento="
				+ anioLanzamiento + ", capacidad=" + capacidad + ", tripulantes=" + tripulantes + "]";
	}
	
	
	
	
}
	
	
	
	

	