
public class Romboide {
private String name;
private double base;
private double altura;


public Romboide(String name, double base, double altura) {
	super();
	this.name = name;
	this.base = base;
	this.altura = altura;
}//constructor


public double calculateArea() {
	return(getBase() * getAltura());
}//calcular area


public double calculatePerimetro() {
	return((getBase()*2) + (getAltura()*2));
}//calcular perimetro


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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


@Override
public String toString() {
	return "Romboide [name=" + name + ", base=" + base + ", altura=" + altura + "]";
}//toString



}
