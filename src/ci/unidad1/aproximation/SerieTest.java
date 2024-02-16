/*
* ITESS-TICS
* Enero-Junio 2024
* Cálculo Integral
* TI202 BRUNO
* 16 Febrero 2024
* Cálculo de series Test
* brunitosi123@gmail.com
*/

package ci.unidad1.aproximation;


public class SerieTest {
    public static void main(String ... args){
        Serie s = new Serie(1,25);
        
        s.compute();
        s.print();
    }    
}
