import java.util.Scanner;

public class Basics {
    public Basics() {
    }
    public void p3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        float numero = sc.nextFloat();
        System.out.println("El numero ingresado es: "+numero+ ", el doble de ese número es: " + 2*numero +
                " y el triple de ese número es " + 3*numero);
    }
    public void p2 (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte la temperatura en grados centígrados: ");
        float celsius=sc.nextFloat();
        float farenheit=32+(9*celsius/5);
        System.out.println("La temperatura en farenheit es: " + farenheit);
    }

    public void p4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte la temperatura en grados centígrados: ");
        float celsius=sc.nextFloat();
        float farenheit=32+(9*celsius/5);
        System.out.println("La temperatura en farenheit es: " + farenheit);
    }

    public void p5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el radio: ");
        float radio = sc.nextFloat();
        double longitud = 2*Math.PI*radio;
        double area = Math.PI*Math.pow(radio,2);
        System.out.println("La circunferencia tiene longitud: " + String.format("%.2f",longitud) + " y área: " + String.format("%.2f", area));
    }

    public void p6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte velocidad en km/h: ");
        float velocidad=sc.nextFloat();
        System.out.println("La velocidad en m/s es: " + String.format("%.2f", velocidad*1000/3600) + "m/s");
    }

    public void p7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud del cateto 1: ");
        float cateto1=sc.nextFloat();
        System.out.println("Ingrese la longitud del cateto 2: ");
        float cateto2=sc.nextFloat();
        double hipotenusa = Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));
        System.out.println("La hipotenusa mide: " + hipotenusa);
    }

    public void p8(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Radio de la esfera: ");
        float radio =sc.nextFloat();
        double volumen = (4.0/3.0)*Math.pow(radio,3)*Math.PI;
        System.out.println("El volumen de la esfera: " + volumen);
    }

    public void p9(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte los lados a, b, c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("El area es: "+ area);
    }

    public void p10(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un numero de tres cifras");
        int number = sc.nextInt();
        System.out.println("El primer digito es: " + number/100);
        System.out.println("El segundo digito es: " + (number/10)%10);
        System.out.println("El tercer digito es: " + number%10);
    }

    public void p11(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de 5 cifras: ");
        int number = sc.nextInt();
        System.out.println(number/10000 + "\n" + number/1000 + "\n" + number/100 + "\n" + number/10 + "\n" + number);
    }

    public void p12(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de 5 cifras: ");
        int number = sc.nextInt();
        System.out.println(number%10 + "\n" + (number -(number/100)*100) + "\n" + (number -(number/1000)*1000) + "\n" + (number -(number/10000)*10000) + "\n" + number);
        System.out.println(number%10 + "\n" + number%100+ "\n" + number%1000+ "\n" +number%10000+ "\n" +number );
    }
    public void p13(){
        Scanner sc = new Scanner(System.in);
        int dia,mes,anio,suma,suerte;
        System.out.println("Ingrese el dia de nacimiento: ");
        dia = sc.nextInt();
        System.out.println("Ingrese el mes de nacimiento: ");
        mes = sc.nextInt();
        System.out.println("Ingrese el año de nacimiento: ");
        anio = sc.nextInt();
        suma=dia+mes+anio;
        suerte=(suma%10+((suma/10)%10)+((suma/100)%10)+(suma/1000));
        System.out.println("Tu numero de la suerte es " + suerte);
    }

    public void p14(){
        float precio, cantidad, iva, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio sin iva del producto: ");
        precio= sc.nextFloat();
        System.out.println("Ingrese la cantidad de productos: ");
        cantidad = sc.nextFloat();
        System.out.println("Ingrese el porcentaje de iva");
        iva = sc.nextFloat();
        total=precio*cantidad*(100+iva)/100;
        System.out.println("El precio total es: "+total + "pesos");
    }

    public void p15(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga un numero de varias cifras: ");
        int N = sc.nextInt();
        System.out.println("Diga cuantas cifras quiere quitarle: ");
        int m = sc.nextInt();
        int resultado = (int) (N/(Math.pow(10,m)));
        System.out.println("El resultado es: "+ resultado);
    }

    public void p16(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en farenheit: ");
        float farenheit = sc.nextFloat();
        System.out.println("La temperatura en Reaumur es: " + 4*(farenheit-32)/9);
    }
}