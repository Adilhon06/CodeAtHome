import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите ваше имя");
            String name = scanner.nextLine();

            System.out.println("Введите вашу фамилию");
            String lastName = scanner.nextLine();
            System.out.println("Здраствуйте" + name + lastName);


        }


    }
}