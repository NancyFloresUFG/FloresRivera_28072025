/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package floresrivera_28072025;

/*
Nancy Beatriz Flores Rivera
FR100524
 */
public class Main { 
       
    //Variables globales
    public static String nombres = "Nancy Beatriz";
    public static String apellidos = "Flores Rivera";
    public static int anio_nacimiento = 2005;
    public static int mes_nacimiento = 5; 
    public static float estatura = 1.50f; //Estatura en metros
    public static float peso = 94.5f; //Peso en libras 
    public static char genero = 'F';
    public static String estado_familiar = "Soltera.";
    public static double salario_mensual = 150.0d;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double imc = 0.0d;
        float tasa_kg = 0.453592f; //Libra equivale a 0.453592
        int dias_laborales = 2;
        int horas_laborales = 3; //Horas laborales al día
        
        //LIBRAS A KILOGRAMOS
        float peso_kg = Main.peso * tasa_kg;
        //ESTATURA AL CUADRADO
        float estatura_al_cuadrado = Main.estatura * Main.estatura;
        //IMC
        imc = peso_kg / estatura_al_cuadrado;
        //SALARIO DIARIO 
        double salario_diario = Main.salario_mensual / dias_laborales;
        //SALARIO POR HORA
        double salario_hora = salario_diario / horas_laborales;
        
        //SALIDA DE DATOS
        System.out.println("Holi " + Main.nombres + " " + Main.apellidos + " <3");
        System.out.println("Su peso en libras es: " + Main.peso + ", pero en kilogramos es: " + peso_kg);
        System.out.println("Su indice de masa corporal es: " + imc);
        System.out.println("Su salario mensual es: " + Main.salario_mensual);
        System.out.println("Su salario diario es: " + salario_diario);
        System.out.println("Su salario por hora es: " + salario_hora);
    }
    
}
