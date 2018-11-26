package sistema;

public class Vertice {
    final private String id;
     private String nombre;


    public Vertice(String id, String name) {
        this.id = id;
        this.nombre = name;
    }
    public String getid() {
        return id;
    }
    public void SetName(String nombre) {
    	this.nombre=nombre;
    	
    }

    public String getname() {
        return nombre;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vertice other = (Vertice) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return nombre;
    }

}

