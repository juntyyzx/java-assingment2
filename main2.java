import java.util.Scanner;
public class main2 {
    public static void main(String[] args) {
        posNegZeros();
    }
    public static void nNums(int n){
        for (int i = 0; i <= n; i++ ) {
            System.out.println(i);
        }
    } 
    public static void oddSum(int n){
        int c = 0;
        for (int i = 0; i <= n; i++){
            if (i % 2 == 0) {
                c += i;
            }
            else {
                continue;
            }
        }
        System.out.println(c);
    }
    public static void factorial(long n){
        long f = 1;
        for (long i = 1; i <= n; i++){
            f *= i;
        }
    System.out.println(f);
    }
    public static void numSum(int n){
        int c = 0;
        while (n > 0) {
        c += n % 10;
        n /= 10;    
        }
        System.out.println(c);
    }
    public static void reversedNum(int n){
        while(n > 0){
            System.out.print(n % 10);
            n /= 10;
        }
    } 
    public static void simpleOrComp(int n){
        int c = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                c += 1;
            }
        }
        if (c == 2){
            System.out.println("Простое");
        }
        else {
            System.out.println("Составное");
        }
        }
    public static void nod(int x, int y) {
        while (y > 0) {
            int r = x % y;
            x = y;
            y = r;
            
        }
    System.out.println(x);
    }
    public static void sumAndMid() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
        }
        double mid = (double) sum / n;
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + mid);

    }

    public static void minAndMax() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int max = nums[0];
        int min = nums[0];

        int indexMin = 0;
        int indexMax = 0;

        for (int i = 1; i < n; i++) {
            if (min > nums[i]){
                min = nums[i];
                indexMin = i;
            }
            if (max < nums[i]) {
                max = nums[i];
                indexMax = i;
            }
        }
        System.out.println("Максимальное: " + max + " Индекс: " + indexMax);
        System.out.println("Минимальное: " + min + " Индекс: " + indexMin);
    }

    public static void posNegZeros(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
        nums[i] = sc.nextInt();
        }
        int pos = 0;
        int neg = 0;
        int zeros = 0;
        for (int i = 0; i < n; i++){
            if (nums[i] > 0) {
                pos += 1;
            }
            else if (nums[i] < 0) {
                neg += 1;
            }
            else {
                zeros += 1;
            }
        }
        System.out.println("Положительных:" + pos);
        System.out.println("Отрицательных: " + neg);
        System.out.println("Нулей: " + zeros);
    }

    public static void reversedArray() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
    }


    }
    }
