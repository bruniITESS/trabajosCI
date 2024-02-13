/*
* ITESS-TICS
* Enero_Junio 2024
* Cálculo Integral
* TI202 Nam_chul Bruno Vázquez Coronado
* Aproximación de áreas usando sumas, prueba
* brunitosi123@gmail.com
*/
package ci.unidad1.aproximation;

public class FunctionAproximationTest {
    public static void main(String args[]) {
        FunctionAproximation fa = new FunctionAproximation(0.0, 4.0, 4);
        
        fa.compute();
        System.out.println("Area: " + fa.getArea());
    }
}
