import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception { 
System.out.println("Qual o numero de capivaras no parque? ");
Scanner objetoEntrada = new Scanner(System.in); // Create a scanner object
String numeroCapivaras = objetoEntrada.next();// read user input

int num=0;
 try {
    num= Integer.parseInt(numeroCapivaras);
    System.out.println(num);
    if (num > 30) 
    throw new Exception ("> de 30!");
       System.out.println("Numero de Capivaras eh okS !");
}catch (Exception e) {
    System.out.println("Demasiadas Capivaras !");
}/* catch (Exception f) {
    System.out.println("Erro de entrada de dados!");
} */

} 
}
