import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        System.out.print("Введите имя: ");
          Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        if (word.equals("Вячеслав")){
                System.out.println("Привет, Вячеслав");
            }else {
            System.out.println("Нет такого имени");
        }
        }
    }

