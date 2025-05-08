
public class Cuadrado {
private String nombre;
private double base;
private double Altura;
private double lado;



public Cuadrado(String nombre, double base, double altura, double lado) {
	super();
	this.nombre = nombre;
	this.base = base;
	Altura = altura;
	this.lado = lado;
}//constructor


public double calculateArea() {
	return(getLado() * getLado());
}//calcular area


public double calculatePerimetro() {
	return getLado() * 4;
}//calcular perimetro


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public double getBase() {
	return base;
}


public void setBase(double base) {
	this.base = base;
}


public double getAltura() {
	return Altura;
}


public void setAltura(double altura) {
	Altura = altura;
}


public double getLado() {
	return lado;
}


public void setLado(double lado) {
	this.lado = lado;
}


@Override
public String toString() {
	return "Cuadrado [nombre=" + nombre + ", base=" + base + ", Altura=" + Altura + ", lado=" + lado + "]";
}






}
