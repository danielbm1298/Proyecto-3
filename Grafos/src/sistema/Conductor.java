package sistema;

public class Conductor {
	Linked_List<Conductor> amigos_cond;
	Linked_List<Estudiante> amigos_est;
	Vertice posicion;
	int cant_calif;
	int suma_calif;
	float calif_prom=suma_calif/cant_calif;
	int carne;
	int cant_viajes;

	
	
	public Vertice getPosicion() {
		return posicion;
	}
	public void setPosicion(Vertice posicion) {
		this.posicion = posicion;
	}
	public Linked_List<Estudiante> getAmigos_est() {
		return amigos_est;
	}
	public void setAmigos_est(Linked_List<Estudiante> amigos_est) {
		this.amigos_est = amigos_est;
	}
	public Linked_List<Conductor> getAmigos_cond() {
		return amigos_cond;
	}
	public void setAmigos_cond(Linked_List<Conductor> amigos_cond) {
		this.amigos_cond = amigos_cond;
	}
	public int getCant_viajes() {
		return cant_viajes;
	}
	public void setCant_viajes(int cant_viajes) {
		this.cant_viajes = cant_viajes;
	}
	public int getCant_calif() {
		return cant_calif;
	}
	public void setCant_calif(int cant_calif) {
		this.cant_calif = cant_calif;
	}
	public int getSuma_calif() {
		return suma_calif;
	}
	public void setSuma_calif(int suma_calif) {
		this.suma_calif = suma_calif;
	}
	public float getCalif_prom() {
		return calif_prom;
	}
	public void setCalif_prom(float calif_prom) {
		this.calif_prom = calif_prom;
	}
	public int getCarne() {
		return carne;
	}
	public void setCarne(int carne) {
		this.carne = carne;
	}

	

}
