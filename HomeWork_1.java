public class HomeWork {
    byte yearsOld = 32;
    short dayOfBirth = 6;
    int monthOfBirth = 3;
    long yearOfBirth = 1988;
    float howManyFullYears = 32.10f;
    double howMuchIsTheFish = 157.45;

    char firstLetterOfName = 'S';
    boolean youMan = true;

    String fullName = "Sergey Nirov";

    public static void main(String[] args) {
        System.out.println(solutionByFormula(4,6,8,2));
        System.out.println(checkSum(6,23));
        checkSigned(-9);
        System.out.println(checkSignedBool(5));
        helloUser("Oleg");
        leapYear(1900);
        leapYear(2000);
        leapYear(2020);
        leapYear(1997);

    }

    public static float solutionByFormula(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20){
            return true;
        }else return false;
    }

   /* 5. Написать метод, которому в качестве параметра передается целое число,
   метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
    */

    public static void checkSigned(int a){
        if(a >= 0){
            System.out.println("Число положительное");
        }else{
            System.out.println("Число отрицательное");
        }
    }

    /*6. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положитель
     */
    public static boolean checkSignedBool(int a){
        if(a >= 0){
            return false;
        }else{
           return true;
        }
    }

    /*7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
     */
    public static void helloUser(String name){
        System.out.println("Привет, " + name + "!");
    }

    /* 8. * Написать метод, который определяет, является ли год високосным,
    и выводит сообщение в консоль. Каждый 4-й год является високосным,
     кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    public static void leapYear(int year){
        if(year % 400 == 0 || year % 4 == 0 && year % 100 !=0){
            System.out.println(year + " год високосный");
        }else if(year % 100 == 0){
            System.out.println(year + " год невисокосный");
        }
        else{
            System.out.println(year + "год невисокосный");
        }
    }

}
