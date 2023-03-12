import java.util.Scanner;

public class Condicionales {
    public Condicionales() {
    }

    public void p1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un numero");
        int numero = sc.nextInt();
        if (numero%2==0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
    }

    public void p2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un numero");
        int numero = sc.nextInt();
        if (numero>0){
            System.out.println("El numero es positivo");
        } else if (numero<0) {
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es cero");
        }
    }
    public void p3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un numero");
        int numero = sc.nextInt();
        if (numero%10==0){
            System.out.println("El numero es divisible entre 10");
        } else {
            System.out.println("El numero NO es divisible entre 10");
        }
    }

    public void p4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un numero 1");
        int numero1 = sc.nextInt();
        System.out.println("Inserte un numero 2");
        int numero2 = sc.nextInt();
        if (numero1==numero2){
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("Los numeros NO son iguales");
        }
    }

    public void p5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un numero 1");
        int numero1 = sc.nextInt();
        System.out.println("Inserte un numero 2");
        int numero2 = sc.nextInt();
        if (numero1<numero2){
            System.out.println("El numero 2 es el mayor");
        } else if (numero1>numero2) {
            System.out.println("El numero 1 es el mayor");
        }else {
            System.out.println("Son el mismo numero");
        }
    }

    public void p6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un numero 1");
        int numero1 = sc.nextInt();
        System.out.println("Inserte un numero 2");
        int numero2 = sc.nextInt();
        if (numero1%10==numero2%10){
            System.out.println("Los numeros terminan con la misma cifra");
        }else {
            System.out.println("Los numeros no terminan con la misma cifra");
        }
    }
    public void p7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un numero 1");
        int numero1 = sc.nextInt();
        if (numero1%3==0&&numero1%5==0){
            System.out.println("El numero es divisible por 3 y 5 al tiempo");
        }else {
            System.out.println("El numero no es divisible por 3 y por 5 al mismo tiempo");
        }
    }

    public void p8(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un numero 1");
        int numero1 = sc.nextInt();
        if (numero1%2==0||numero1%3==0){
            System.out.println("El numero es divisible por 2 o 3");
        }else {
            System.out.println("El numero no es divisible por 2 ni por 3");
        }
    }
    public void p9(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una letra mayuscula o minuscula: ");
        char letra = sc.next().charAt(0);
        if (letra==Character.toUpperCase(letra)){
            System.out.println("La letra es mayuscula");
        }else {
            System.out.println("La letra no es mayuscula");
        }
    }
    public void p10(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una letra 1");
        char letra1 = sc.next().charAt(0);
        System.out.println("Escriba una letra 2");
        char letra2 = sc.next().charAt(0);

        if (letra1==letra2){
            System.out.println("Las letras son iguales");
        }else {
            System.out.println("Las letras no son iguales");
        }
    }
    public void prueba(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 1 si es hombre y 2 si es mujer");
        int genero=sc.nextInt();

        if (genero==1){
            System.out.println("Buenos dias, caballero");
        } else if (genero==2){
            System.out.println("Buenos dias, señorita");
        } else{
            System.out.println("Esa no es una opcion valida");
        }
    }

    public void p11(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las dos letras: ");
        char letra1 = sc.next().charAt(0);
        System.out.println("Ingrese las dos letras: ");
        char letra2= sc.next().charAt(0);
        if (letra1==Character.toLowerCase(letra1)&&letra2==Character.toLowerCase(letra2)){
            System.out.println("Ambas letras son minusculas");
        } else if (letra1==Character.toLowerCase(letra1)) {
            System.out.println("La primera letra es minuscula");
        } else if (letra2==Character.toLowerCase(letra2)) {
            System.out.println("La segunda letra es minuscula");
        }else {
            System.out.println("Ninguna de las dos es minuscula");
        }
    }

    public void p12(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un caracter");
        char numero = sc.next().charAt(0);
        if (Character.getNumericValue(numero)>=0 && Character.getNumericValue(numero)<=9){
            System.out.println("El caracter es un digito");
        }else {
            System.out.println("El caracter no es un digito");
        }
    }

    public void p13(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese año: ");
        int anio = sc.nextInt();
        if (anio%4==0){
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año NO es bisiesto");
        }
    }

    public void p14(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de 3 cifras");
        int numero = sc.nextInt();
        int digito1=numero/100;
        int digito3=numero%10;
        if (digito1==digito3){
            System.out.println("El numero es capicua");
        } else {
            System.out.println("El numero no es capicua");
        }
    }

    public void p15(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a dividir el primer numero por el segundo");
        System.out.println("Ingrese el primer numero");
        float numero1 = sc.nextFloat();
        System.out.println("Ingresa el segundo numero");
        float numero2 = sc.nextFloat();
        if (numero2==0){
            System.out.println("La division por cero no es posible");
        } else {
            System.out.println("La division de " + numero1 + " por "+ numero2 + " es " + Math.round((numero1*100.0/numero2))/100.0);
        }
    }

    public void p16(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a dividir el mayor numero por el menor numero");
        System.out.println("Ingrese el primer numero: ");
        float numero1=sc.nextFloat();
        System.out.println("Ingrese el segundo numero: ");
        float numero2=sc.nextFloat();
        if (numero1==0 || numero2==0){
            System.out.println("La division por 0 no es posible");
        }else {
            if (numero1>=numero2){
                System.out.println("La division es " + (numero1/numero2));
            }else {
                System.out.println("La division es " + (numero2/numero1));
            }
        }
    }

    public void p17(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tres numeros enteros");
        int numero1=sc.nextInt();
        int numero2=sc.nextInt();
        int numero3=sc.nextInt();
        if(numero1>numero2 && numero1>numero3) {
            System.out.println("El mayor numero es " + numero1);
        } else if (numero2>numero1 && numero2>numero3) {
            System.out.println("El mayor numero es " + numero2);
        }else{
            System.out.println("El mayor numero es " + numero3);
        }
    }

    public void p18(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la hora 0 - 24:");
        int hora = sc.nextInt();
        System.out.println("Ingrese los minutos 0 - 60");
        int minutos=sc.nextInt();
        System.out.println("Ingrese los segundos 0 - 60");
        int segundos=sc.nextInt();

        if (hora<0 || hora>24){
            System.out.println("La hora no es valida");
        }else if (minutos<0 || minutos>60){
            System.out.println("La hora no es valida");
        }else if (segundos<0 || segundos>60){
            System.out.println("La hora no es valida");
        }else {
            System.out.println("La hora es valida");
        }
    }

    public void p19(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de mes 1-12: ");
        int numero = sc.nextInt();
        if (numero<0 || numero>12){
            System.out.println("El numero no es valido");
        } else if (numero == 1 || numero==3 ||numero==5||numero==7||numero==8||numero==10||numero==12) {
            System.out.println("El mes tiene 31 dias");
        } else if (numero==4||numero==6||numero==9||numero==11) {
            System.out.println("El mes tiene 30 dias");
        }else {
            System.out.println("El mes tiene 28 o 29 dias");
        }
    }

    public void p20(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una calificacion 1-10");
        float calificacion = sc.nextFloat();
        if (calificacion<0||calificacion>10){
            System.out.println("Error");
        } else if (calificacion<6){
            System.out.println("Reprobado");
        } else if (calificacion<8) {
            System.out.println("Aprobado");
        }else {
            System.out.println("Perfecto");
        }

    }
}
