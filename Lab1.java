public class Lab1 {

    // задание 3
    public int charToNum(char x) {
        return x - '0';
    }

    // задание 4
    public boolean isPositive(int x) {
        return x > 0;
    }

    // задание 8
    public boolean isDivisor(int a, int b) {
        return a % b == 0;
    }

    // задание 9
    public boolean isEqual(int a, int b, int c) {
        return a == b && a == c;
    }

    // задание 10
    public int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);

    }
    public int runLastNumSum() {
        int sum = 0;
        sum = sum + lastNumSum(1, 2);
        sum = sum + lastNumSum(11, 30);
        sum = sum + lastNumSum(9, 19);
        sum = sum + lastNumSum(32, 18);
        sum = sum + lastNumSum(10, 233);
        return sum;

    }

    // задание 2

    public double safeDiv(int x, int y) {
        if (y == 0) return 0;
        return (double) x / y;
    }

    // задание 5

    public int max3(int x, int y, int z) {
     if (x >= y && x >= z) return x;
     if (y >= x && y >= z) return y;
     return (int) z;
    }

    // заданине 6

    public boolean sum3(int x, int y, int z) {
        if (x + y == z || y + z == x || z + x == y) return true;
        return false;
    }

    // задание 7

    public int sum2 (int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) return 20;
        return sum;

    }

    // задание 10

    public void printDays(String x) {
        switch (x) {
            case "понедельник": System.out.println("понедельник, вторник ,среда, четверг, пятница, суббота, воскресенье"); break;
            case "вторник": System.out.println("вторник, среда, четверг, пятница, суббота, воскресенье"); break;
            case "среда": System.out.println("среда, четверг, пятница, суббота, воскресенье"); break;
            case "четверг": System.out.println("четверг, пятница, суббота, воскресенье"); break;
            case "пятница": System.out.println("пятница, суббота, воскресенье"); break;
            case "суббота": System.out.println("суббота, воскресенье"); break;
            case "воскресенье": System.out.println("воскресенье"); break;
            default: System.out.println("это не день недели"); break;


        }

    }
    
    // задание 1

    public String listNums (int x) {
        String result = "";
        for (int i = 0; i <= x; i++) {
            result += i + " ";
        }
        return result.trim();
    }

    // задание 4

    public int pow (int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    // задание 6

    public boolean equalNum (int x) {
        int LastDigit = x % 10;
        while (x > 0) {
            int CurrentDigit = x % 10;
            if (CurrentDigit != LastDigit) {
                return false;
            }
            x = x / 10;
        }
        return true;
    }

    // задание 7

    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // задание 9

    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // задание 1

    public int findFirst (int[] arr, int x){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    // задание 2

    public int findLast (int[] arr, int x){
        for (int i = arr.length - 1; i >= 0 ; i--){
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    // задание 5

    public int[] add (int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            result[pos+i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            result[i+ ins.length] = arr[i];
        }
        return result;
    }

    // задание 8

    public int[] concat (int[] arr3,int[] arr4){
        int[] result  = new int[arr3.length + arr4.length];
        for (int i = 0; i < arr3.length; i++){
            result[i] = arr3[i];
        }
        for (int i = 0; i < arr4.length; i++){
            result[arr3.length + i] = arr4[i];
        }
        return result;
    }

    // задание 10
    public static int[] deleteNegative(int[] arr5) {
        int count = 0;
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] >= 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int j = 0;
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] >= 0) {
                result[j] = arr5[i];
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Lab1 lab1 = new Lab1();
        System.out.println("---Задание 1---");
        System.out.println("Задание №3: " + lab1.charToNum('3'));
        System.out.println("Задание №4: " + lab1.isPositive(3));
        System.out.println("Задание №8: " + lab1.isDivisor(4,2));
        System.out.println("Задание №9: " + lab1.isEqual(2,2, 2));
        System.out.println("Задание №10: ");
        System.out.println("Пример: ");
        System.out.println("1+2 это " + lab1.lastNumSum(1, 2));
        System.out.println("11+30 это " + lab1.lastNumSum(11, 30));
        System.out.println("9+19 это " + lab1.lastNumSum(9, 19));
        System.out.println("32+18 это " + lab1.lastNumSum(32, 18));
        System.out.println("10+233 это " + lab1.lastNumSum(10, 233));
        System.out.println("Итого " + lab1.runLastNumSum());
        System.out.println("---Задание №2---");
        System.out.println("Задание №2: " + lab1.safeDiv(2,0));
        System.out.println("Задание №2: " + lab1.safeDiv(8,4));
        System.out.println("Задание №5: " + lab1.max3(5,7,7));
        System.out.println("Задание №5: " + lab1.max3(8,-1,4));
        System.out.println("Задание №6: " + lab1.sum3(5,7,2));
        System.out.println("Задание №6: " + lab1.sum3(8,-1,4));
        System.out.println("Задание №7: " + lab1.sum2(5,7));
        System.out.println("Задание №7: " + lab1.sum2(8,-1));
        System.out.println("Задание №10: ");
        System.out.println("x = понедельник");
        System.out.println("результат:");
        lab1.printDays("понедельник");
        System.out.println("---Задание №3---");
        System.out.println("Задание №1: " + lab1.listNums(5));
        System.out.println("Задание №4: " + lab1.pow(5,2));
        System.out.println("Задание №6: " + lab1.equalNum(55555));
        System.out.println("Задание 7:");
        square(4);
        System.out.println("Задание 9:");
        rightTriangle(4);
        System.out.println("---Задание №4---");
        int[] arr1 = {1,2,3,4,2,2,5};
        int x1 = 2;
        System.out.println("Задание №1:");
        System.out.println("arr=" + java.util.Arrays.toString(arr1));
        System.out.println("x = " + x1);
        System.out.println("Результат: " + lab1.findFirst(arr1, x1));
        int[] arr2 = {1,2,3,4,2,2,5};
        int x2 = 2;
        System.out.println("Задание №2:");
        System.out.println("arr=" + java.util.Arrays.toString(arr2));
        System.out.println("x = " + x2);
        System.out.println("Результат: " + lab1.findLast(arr2, x2));
        System.out.println("Задание №5:");
        int[] arr = {1, 2, 3, 4, 5};
        int[] ins = {7, 8, 9};
        int pos = 3;
        System.out.println("arr=" + java.util.Arrays.toString(arr));
        System.out.println("ins=" + java.util.Arrays.toString(ins));
        System.out.println("pos=" + pos);
        System.out.println("результат: " + java.util.Arrays.toString(lab1.add(arr, ins, pos)));
        System.out.println("Задание №8:");
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {7, 8, 9};
        System.out.println("arr1=" + java.util.Arrays.toString(arr3).replace(", ", ","));
        System.out.println("arr2=" + java.util.Arrays.toString(arr4).replace(", ", ","));
        System.out.println("результат: " + java.util.Arrays.toString(lab1.concat(arr3, arr4)).replace(", ", ","));
        System.out.println("Задание №10:");
        int[] arr5 = {1, 2, -3, 4, -2, 2, -5};
        System.out.println("arr=" + java.util.Arrays.toString(arr5).replace(", ", ","));
        System.out.println("результат: " + java.util.Arrays.toString(lab1.deleteNegative(arr5)).replace(", ", ","));






    }

}