/*
* ITESS-TICS
* Enero-Junio 2024
* Cálculo Integral
* TI202 BRUNO
* 12 Febrero 2024
* Aproximación de áreas usando sumas
* brunitosi123@gmail.com
*/
package ci.unidad1.aproximation;


public class FunctionAproximation {
    private double xIni;
    private double xEnd;
    private int n;
    private double dx;
    private double x[];
    private double fx[];
    private double area;

    public FunctionAproximation(double xIni, double xEnd, int n) {
        this.xIni = xIni;
        this.xEnd = xEnd;
        this.n = n;
        
        this.x = new double[n+1];
        this.fx = new double[n+1];
    }
    
    public void compute() {
        dx = (xEnd - xIni) / n;
        area = 0.0;
        for(int i = 0; i <= n; i++){
            x[i] = xIni + 1*dx;
            fx[i] =x[i] * x[i];
            area = area + fx[i] * dx;
        }
        
    }

    public double getArea() {
        return area;
    }
    
}
