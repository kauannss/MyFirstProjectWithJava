import java.util.Scanner;


public class App {
    private final static String WELCOME_MENSAGE = ("seja bem vindo!!");
    static int age;

    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        
        System.out.println(WELCOME_MENSAGE);

        System.out.println("qual é o seu nome? ");
        String name = scanner.next();

        System.out.println("quantos anos vc tem? ");
        int age = scanner.nextInt();

        System.out.printf("Prazer %s pode entrar \n", name);
        
        System.out.println
        ("o que deseja consultar tecle o numero desejado \n1 posso ter carteira de motorista? \n2 quero fazer uma soma \n3 quero fazer uma subtração \n4 quero fazer uma multiplicação \n5 quero fazer uma divisão \n6 quero calcular a área de um quadrado \n");
        var ask = scanner.nextInt();

        if (ask == 1) {
            canIDrive(age);
        } else if (ask == 2) {
            sum(args);
        }else if (ask == 3) {
            sub(args);
        }else if (ask == 4) {
            mult(args);
        }else if (ask == 5) {
            div(args);
        }else if (ask == 6) {
            squareArea(args);
        }

    }


    public static void canIDrive(int age) throws Exception{
        boolean boolEmancipated = false;

        System.out.println("vc é emancipado? Y/N");

        var emancipated = scanner.next();

        if (emancipated.equals("Y")) {
            boolEmancipated = true;
        } else if (emancipated.equals("N")){
            boolEmancipated = false;
        }

        var result = age > 17 || (boolEmancipated == true && age > 15);

        System.out.println("você pode dirigir? " + result);
    }


    public static void sum(String[] args) {
        System.out.println("qual é o 1º numero deseja utilizar?");
        var first = scanner.nextInt();
        System.out.println("qual é o 2º numero deseja utilizar?");
        var second = scanner.nextInt();

        System.out.printf("%s + %s = %s\n", first, second, (first+second));
    }


    public static void sub(String[] args) {
        System.out.println("qual é o 1º numero deseja utilizar?");
        var first = scanner.nextInt();
        System.out.println("qual é o 2º numero deseja utilizar?");
        var second = scanner.nextInt();

        System.out.printf("%s - %s = %s \n", first, second, (first-second) );
    }


    public static void mult(String[] args) {
        System.out.println("qual é o 1º numero deseja utilizar?");
        var first = scanner.nextInt();
        System.out.println("qual é o 2º numero deseja utilizar?");
        var second = scanner.nextInt();

        System.out.printf("%s * %s = %s \n", first, second, (first*second) );
    }


    public static void div(String[] args) {
        System.out.println("qual é o 1º numero deseja utilizar?");
        var first = scanner.nextFloat();
        System.out.println("qual é o 2º numero deseja utilizar?");
        var second = scanner.nextFloat();

        System.out.printf("%s / %s = %s \n", first, second, (first/second) );
    }


    public static void squareArea(String[] args) {
        System.out.println("qual é o tamanho do lado do quadrado?");
        var side = scanner.nextFloat();

        System.out.printf("a área do quadrado é %s \n", (side*side));
    }


    
}
