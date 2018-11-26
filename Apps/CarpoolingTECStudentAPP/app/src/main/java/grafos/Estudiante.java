package grafos;

public class Estudiante {
	Linked_List<Conductor> amigos_conduc;
	String nombre;

	int cant_calif=1;
	int suma_calif;
	float calif_prom;
	int carne;
	Vertice posicion;
	public Estudiante(String nombre,int carne,Vertice posicion) {
		this.nombre=nombre;
		this.carne=carne;
		this.posicion=posicion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Vertice getPosicion() {
		return posicion;
	}
	public void setPosicion(Vertice posicion) {
		this.posicion = posicion;
	}
	public Linked_List<Conductor> getAmigos_conduc() {
		return amigos_conduc;
	}
	public void setAmigos_conduc(Linked_List amigos_conduc) {
		this.amigos_conduc = amigos_conduc;
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
