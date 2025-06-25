import java.util.Scanner;


public class App {
    private final static String WELCOME_MENSAGE = ("seja bem vindo!!");
    static int age;

    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        System.out.println(WELCOME_MENSAGE);

        var scanner = new Scanner(System.in);
        System.out.println("qual é o seu nome? ");
        String name = scanner.next();
        System.out.println("quantos anos vc tem? ");
        int age = scanner.nextInt();
        System.out.printf("Prazer %s pode entrar \n", name);
        System.out.println("o que deseja consultar tecle o numero desejado \n1 posso ter carteira de motorista?");
        var ask = scanner.nextInt();

        if (ask == 1) {
            canIDrive(age);
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
}
