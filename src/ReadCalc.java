import java.util.Scanner;

public class ReadCalc {
    public double readNextDouble() {         //метод для считаывния число типа double
        Scanner sc = new Scanner(System.in); //создаем объект класса Scanner и в конструкторе класса передать
                                             // ссылку на поток ввода(для считывания с клавиатуры)
        double i = 0;                        //создаем переменную
        if (sc.hasNextDouble()) {            //теперь смотрим если в сканере ввели целое число,производим операции с этим числом
            i = sc.nextDouble();            //сохраняем переменную и выводим на экран
        } else {
            System.out.println("Вы ввели не целое число:");//если число не целое вывести это
        }
        return i;


    }
}
