
public class Trapecio {
private String name;
private double altura;
private double baseMayor;
private double baseMenor;
private double lado1;
private double lado2;
private double lado3;
private double lado4;


public Trapecio(String name, double altura, double baseMayor, double baseMenor, double lado1, double lado2,
		double lado3, double lado4) {
	super();
	this.name = name;
	this.altura = altura;
	this.baseMayor = baseMayor;
	this.baseMenor = baseMenor;
	this.lado1 = lado1;
	this.lado2 = lado2;
	this.lado3 = lado3;
	this.lado4 = lado4;
}


public double calculateArea() {
	return(getAltura() * (getBaseMayor() + getBaseMenor())) / 2;
}//calcular area


public double calculatePerimetro() {
	return getLado1() + getLado2() + getLado3() + getLado4();
}//calcular perimetro



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


public double getAltura() {
	return altura;
}


public void setAltura(double altura) {
	this.altura = altura;
}


public double getBaseMayor() {
	return baseMayor;
}

public void setBaseMAyor(double baseMayor) {
	this.baseMayor = baseMayor;
}

public double getBaseMenor() {
	return baseMenor;
}

public void setBaseMenor(double baseMenor) {
	this.baseMenor = baseMenor;
}

public double getLado1() {
	return lado1;
}

public void setLado1(double lado1) {
	this.lado1 = lado1;
}

public double getLado2() {
	return lado2;
}

public void setLado2(double lado2) {
	this.lado2 = lado2;
}

public double getLado3() {
	return lado3;
}

public void setLado3(double lado3) {
	this.lado3 = lado3;
}

public double getLado4() {
	return lado4;
}

public void setLado4(double lado4) {
	this.lado4 = lado4;
}


@Override
public String toString() {
	return "Trapecio [name=" + name + ", altura=" + altura + ", baseMAyor=" + baseMayor + ", baseMenor=" + baseMenor
			+ ", lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", lado4=" + lado4 + "]";
}//toString



}//class Trapecio
