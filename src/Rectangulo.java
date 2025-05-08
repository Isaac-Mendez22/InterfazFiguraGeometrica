
public class Rectangulo {
private String nombre;
private double base;
private double altura;
private double lado1;
private double lado2;

public Rectangulo(String nombre, double base, double altura, double lado) {
	super();
	this.nombre = nombre;
	this.base = base;
	this.altura = altura;
	this.lado1 = lado1;
	this.lado2 = lado2;
}//constructor


public double calculateArea() {
	return(getBase() * getAltura());
}//calcular area


public double calculatePerimetro() {
	return (getBase() * 2) * (getAltura()*2);
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
	return altura;
}
public void setAltura(double altura) {
	this.altura = altura;
}
public double getLado1() {
	return lado1;
}
public void setLado(double lado1) {
	this.lado1 = lado1;
}


public double getLado2() {
	return lado2;
}


public void setLado2(double lado2) {
	this.lado2 = lado2;
}


@Override
public String toString() {
	return "Rectangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + ", lado1=" + lado1 + ", lado2=" + lado2 + "]";
	}//toString

}
