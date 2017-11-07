package boletin5_1;
import java.util.Scanner;
public class Numero {
Scanner pedir = new Scanner(System.in);
int numero;

//numero = pedir.nextInt();

//constructor por defecto
public Numero(){
    }
//constructor por parámetros
public Numero(int numero){
    }
//metodo de acceso set
public void setNumero(int numero){
    
}
//metodo de acceso get
public int getNumero(){
    return numero;
}
public void mostrar(int num1){
    if (num1>=0){
        System.out.println("El numero :" + num1 + "  es positivo");
    }
}
}


