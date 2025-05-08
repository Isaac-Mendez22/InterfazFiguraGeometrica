
public class Rombo {
private String name;
private double diagonalMenor;
private double diagonalMayor;
private double lado;

public Rombo(String name, double diagonalMenor, double diagonalMayor, double lado) {
	super();
	this.name = name;
	this.diagonalMenor = diagonalMenor;
	this.diagonalMayor = diagonalMayor;
	this.lado = lado;
}


public double calculateArea() {
	return(getLado())*4;
}//calcular area


public double calculatePerimetro() {
	return (getDiagonalMayor() * getDiagonalMenor()) / 2;	
}//calcular perimetro


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getDiagonalMenor() {
	return diagonalMenor;
}


public void setDiagonalMenor(double diagonalMenor) {
	this.diagonalMenor = diagonalMenor;
}


public double getDiagonalMayor() {
	return diagonalMayor;
}


public void setDiagonalMayor(double diagonalMayor) {
	this.diagonalMayor = diagonalMayor;
}


public double getLado() {
	return lado;
}


public void setLado(double lado) {
	this.lado = lado;
}


@Override
public String toString() {
	return "Rombo [name=" + name + ", diagonalMenor=" + diagonalMenor + ", diagonalMayor=" + diagonalMayor + ", lado="
			+ lado + "]";
	}//toString

}//class Rombo
