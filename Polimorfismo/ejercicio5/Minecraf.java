package ejercicio5;

public abstract  class Minecraf {
	protected String nombre;

    public abstract void accion();
    
    public void colocar() {
        System.out.println("Bloque colocado en el suelo");
    }
    
    public void colocar(String orientacion) {
        System.out.println("Bloque colocado en " + orientacion);
    }
    
    public abstract void romper();
}
