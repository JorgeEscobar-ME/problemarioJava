import java.util.Scanner;

public class Loops {
    public Loops() {
    }

    public void p1(){
        int i=1;
        while (i<=100){
            System.out.println(i);
            i++;
        }
    }
    public void p2(){
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=100);
    }

    public void p3(){
        int i;
        for (i=1; i<=100;i++){
            System.out.println(i);
        }
    }

    public void p4(){
        int i=100;
        while (i>=1){
            System.out.println(i);
            i=i-1;
        }
    }

    public void p5(){
        int i=100;
        do {
            System.out.println(i);
            i=i-1;
        }while (i>=1);
    }

    public void p6(){
        for (int i=100; i>=1;i=i-1){
            System.out.println(i);
        }
    }

    public void p7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija un numero N: ");
        int N = sc.nextInt();
        int decision;
        while (true){
            System.out.println("Elige el metodo: \n 1. for \n 2. while \n 3. do, while");
            decision= sc.nextInt();
            if (decision!=1 && decision!=2 && decision!=3){
                System.out.println("No es un numero valido");
            }else {
                break;
            }
        }

        int i;
        if (decision==1){
            for (i=1; i<=N; i++){
                System.out.println(i);
            }

        } else if (decision==2) {
            i=1;
            while (i<=N){
                System.out.println(i);
                i++;
            }

        } else if (decision==3) {
            i=1;
            do {
                System.out.println(i);
                i++;
            }while (i<=N);

        }
    }
    public void p8(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija un numero N: ");
        int N = sc.nextInt();
        int decision;
        while (true){
            System.out.println("Elige el metodo: \n 1. for \n 2. while \n 3. do, while");
            decision= sc.nextInt();
            if (decision!=1 && decision!=2 && decision!=3){
                System.out.println("No es un numero valido");
            }else {
                break;
            }
        }

        int i;
        if (decision==1){
            for (i=N; i>0; i=i-1){
                System.out.println(i);
            }
        } else if (decision==2) {
            i=N;
            while (i>0){
                System.out.println(i);
                i=i-1;
            }
        } else if (decision==3) {
            i=N;
            do {
                System.out.println(i);
                i=i-1;
            }while (i>0);
        }
    }

    public void p9(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero menor: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el numero mayor");
        int b = sc.nextInt();

        for (int i=a; i<=b; i++){
            System.out.println(i);
        }
    }

    public void p10(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero menor: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el numero mayor");
        int b = sc.nextInt();
        System.out.println("Los numeros pares desde " + a + " hasta " + b + " son: ");

        for (int i=a; i<=b; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }

    public void p11(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int a = sc.nextInt();
        System.out.println("Los multiplos desde 1 hasta " + a + " son: ");
        for (int i=1; i<=a; i++){
            if (a%i==0){
                System.out.println(i + " es multiplo de " + a);
            }
        }
    }

    public void p12(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa lee numeros y detecta si son positivos o negativos y pares o impares. se detiene si escribes alto.");

        while (true){
            String x = sc.next();
            if (x.equals("alto")){
                break;
            }else {
                int numero = Integer.parseInt(x);
                if (numero>=0){
                    System.out.println("El numero es positivo");
                }else {
                    System.out.println("El numero es negativo");
                }
                if (numero%2==0){
                    System.out.println("El numero es par");
                } else {
                    System.out.println("El numero no es par");
                }

            }
        }
    }

    public void p13(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa pasa millas a km. puedes detenerlo escribiendo alto.");
        while (true){
            String x = sc.next();
            if (x.equals("alto")){
                break;
            }else {
                double y=Float.parseFloat(x)*0.621371;
                String resultado = String.format("%.2f", y);
                System.out.println(x + "km es igual a " + resultado + " millas");
            }
        }
    }

    public void p14(){
        System.out.println("Este programa cuenta cuantos numeros ingreso. Escriba alto para detener");
        int contador=0;
        Scanner sc = new Scanner(System.in);
        do {
            String numero = sc.next();
            if (numero.equals("alto")){
                break;
            }else {
                double x = Double.parseDouble(numero);
                contador=contador +1;
            }
        }while (true);
        System.out.println("Ingresaste: " + contador + " numeros");
    }

    public void p15(){
        System.out.println("Este programa cuenta cuantos numeros ingreso. Escriba alto para detener");
        int contador=0;
        Scanner sc = new Scanner(System.in);
        do {
            String numero = sc.next();
            if (numero.equals("alto")){
                break;
            }else if (Double.parseDouble(numero)>0) {
                contador=contador +1;
            }
        }while (true);
        System.out.println("Ingresaste: " + contador + " numeros positivos");
    }
}


