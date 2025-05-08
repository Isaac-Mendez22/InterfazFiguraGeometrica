
public class Main implements FiguraGeometrica {
	
public static void main(String[] args) {
	Triangulo t1 = new Triangulo ("Bermudas", 20, 10, 15);
	Triangulo t = new Triangulo("Triangulo T", 200, 100, 150);
	Cuadrado cuad = new Cuadrado("Cuadrado", 8, 8, 8);
	Rectangulo rect = new Rectangulo("Rectangulo", 20, 30, 20, 30);
	Rombo rom = new Rombo("Rombo", 30, 45, 20);
	Romboide rombi = new Romboide ("Romboide", 20, 30, 40);
	Trapecio trap = new Trapecio ("Trapecio", 20, 40, 20, 40, 50, 50);
	
	Main.imprimirCalculos(t1);
	Main.imprimirCalculos(t);
	Main.imprimirCalculos(cuad);
	Main.imprimirCalculos(rom);
	Main.imprimirCalculos(rombi);
	Main.imprimirCalculos(trap);
	
	
	
	}//main
	public static void imprimirCalculos(FiguraGeometrica t) {
		System.out.println(t);
		System.out.println("+----------------------------------------------------------------------------------------+");
		System.out.println("| El área de ["+ t.getNombre() + "]");
		System.out.println("| es " + t.calculateArea());
		System.out.println("| El perimetro de [" + t.getNombre() + "]");
		System.out.println("| es " + t.calculatePerimetro());
		System.out.println("+----------------------------------------------------------------------------------------+");
	}//imprimirCalculos
}
