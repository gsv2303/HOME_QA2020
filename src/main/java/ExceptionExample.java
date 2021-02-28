import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {

    //   public static <let> void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.gecko.driver",
//                "D:\\ШАГ\\ШАГ Автотестирование\\ДЗ\\Lesson14 Selenium\\geckodriver.exe");
//        WebDriver webDriver = new FirefoxDriver();

//        Scanner scanner = new Scanner(System.in);
//        int res;
//        System.out.println("Enter a=");
//        int a = scanner.nextInt();
//        System.out.println("Enter b=");
//        int b = scanner.nextInt();
//        System.out.printf("Enter operation=");
//        String op = scanner.next();
//        switch (op.charAt(0)) {
//            case '+':
//                res = a + b;
//                break;
//            case '-':
//                res = a - b;
//                break;
//            case '*':
//                res = a * b;
//                break;
//            case '/':
//                if (b != 0)
//                    res = a / b;
//                else
//                    System.out.println("Делить на 0 нельзя");
//                break;
//        }
//    }


// public static void main(String[] args){
//            Scanner scanner = new Scanner(System.in);
//            int res;
//            System.out.println("Enter a=");
//            byte a = scanner.nextByte();
//            System.out.println("Enter b=");
//            byte b = scanner.nextByte();
//            System.out.printf("Enter operation=");
//            String op = scanner.next();
//            switch (op.charAt(0)) {
//                case '+':
//                    res = a + b;
//                    break;
//                case '-':
//                    res = a - b;
//                    break;
//                case '*':
//                    res = a * b;
//                    break;
//                case '/':
//                    if (b != 0)
//                        res = a / b;
//                    else
//                        System.out.println("Делить на 0 нельзя");
//                    break;
//            }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int res = 0;
//        int a = 0;
//        int b = 0;
//        System.out.println("Enter a=");
//        try {
//            a = scanner.nextInt();
//        } catch (InputMismatchException exception) {
//            System.out.printf("Програссв выдала исключение=");
//            exception.printStackTrace();
//        }
//        System.out.println("Enter b=");
//        try {
//            b = scanner.nextInt();
//        } catch (InputMismatchException exception) {
//            System.out.printf("Програссв выдала исключение=");
//            exception.printStackTrace();
//        }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        int a = 0;
        int b = 0;
        try {
            System.out.printf("Enter operation=");
            String op = scanner.next();
            switch (op.charAt(0)) {
                case '+':
                    res = a + b;
                    break;
                case '-':
                    res = a - b;
                    break;
                case '*':
                    res = a * b;
                    break;
                case '/':
                    if (b != 0) res = a / b;
                    else
                        System.out.println("Делить на 0 нельзя");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("ошибка ввода");
        } catch (ArithmeticException e) {
            System.out.println("Арифметическая ошибка");
        }
        System.out.println("Программа отработала, результат = " + res);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}