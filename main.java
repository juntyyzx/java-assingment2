import java.util.Scanner;

public class main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        char grade = getGrage();
        System.out.println(getFeedback(grade));
    }
    public static void calculateTicketPrice() {
    int age = scanner.nextInt();
    double basePrice = scanner.nextDouble();
    if (age <= 7) {
        System.out.print("Цена билета: 0");
    }
    else if (age <= 17) {
        System.out.println(basePrice  / 2);
    }
    else if (age <= 64) {
        System.out.println(basePrice);
    }
    else {
        System.out.println(basePrice* 0.7);
    }
    }
    public static void calculate() {
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        char operator = scanner.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
            case '-':
                System.out.println(num1 - num2);
            case '/':
                System.out.println(num1 / num2);
            case '*':
                System.out.println(num1 * num2);
                break;
        
            default:
                System.out.println("Incorrect operator");
                break;
        }
    }
    public static void getDaysInMonth() {
        int month = scanner.nextInt();
        boolean isLeapYear = scanner.nextBoolean();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println(31);
                break;
            case 4, 6, 9, 11:
                System.out.println(30);
            case 2:
                if (isLeapYear == true) {
                    System.out.println(29);
                }
                else {
                    System.out.println(28);
                }
            default:
                System.out.println(-1);
                break;
        }
    }
    public static char getGrage(){
        int score = scanner.nextInt();
        if (score <= 59) {
            return 'F';
        }
        else if (score <= 69){
            return 'D';
        }
        else if (score <= 79){
            return 'C';
        }
        else if (score <= 89){
            return 'B';
        }
        else if (score <= 100){
            return 'A';
        }

        return '?';

    }
    public static String getFeedback(char grade) {
        switch (grade) {
            case 'A':
                return "Отличная работа!";
            case 'B':
                return "Хорошо, но есть куда расти.";
            case 'C':
                return "Удовлетворительно.";
            case 'D':
                return "На грани провала.";
            case 'F':
                return "Тест не сда, нужна пересдача.";
            default:
                return "Неизвестная оценка.";
        }
    }
}
