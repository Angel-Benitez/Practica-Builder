public class Triangulo {
    private double lado1,lado2,lado3;
    public Triangulo() {
        // TODO Auto-generated constructor stub
    }
    void setlados(double L1, double L2, double L3) {
        lado1=L1;
        lado2=L2;
        lado3=L3;
    }
    boolean EsEscaleno(boolean escaleno) {
        if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
        	escaleno=true;
        }
        return escaleno;
        }
    boolean EsIsoceles(boolean isoceles) {
        if (lado1==lado2 || lado1==lado3 || lado2==lado3) {
            isoceles=true;
        }
        return isoceles;
    }
    boolean EsEquilatero(boolean equilatero) {
        if (lado1==lado2 && lado1==lado3) {
            equilatero=true;
        }
        return equilatero;
    }
}

