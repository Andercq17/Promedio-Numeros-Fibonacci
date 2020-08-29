
package promediofibonacci;


public class PromedioFibonacci {

    
    public static void main(String[] args) {
       long x=1,n,y=0,t=0;
       double p=0;
     System.out.println(y);
     System.out.println(x);
     
    do{
        n=x+y;
        y=x;
        x=n;
        System.out.println(n);
        t++; //t= cantidaad de numeros que quiero que imprima
        p=p+n;
        }while(t<=30);
        System.out.println("el promedio de esta cantidad de numeros fibonacci es: "+(p/t)); 
    }
    
}
