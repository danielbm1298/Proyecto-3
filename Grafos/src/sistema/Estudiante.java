package sistema;

public class Estudiante {
	Linked_List amigos_conduc;
	Linked_List amigos_estudiant;
	int cant_calif;
	int suma_calif;
	float calif_prom=suma_calif/cant_calif;
	int carne;
	Vertice posicion;
	public Vertice getPosicion() {
		return posicion;
	}
	public void setPosicion(Vertice posicion) {
		this.posicion = posicion;
	}
	public Linked_List getAmigos_conduc() {
		return amigos_conduc;
	}
	public void setAmigos_conduc(Linked_List amigos_conduc) {
		this.amigos_conduc = amigos_conduc;
	}
	public Linked_List getAmigos_estudiant() {
		return amigos_estudiant;
	}
	public void setAmigos_estudiant(Linked_List amigos_estudiant) {
		this.amigos_estudiant = amigos_estudiant;
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
