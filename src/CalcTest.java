public class CalcTest {
    public static void main(String[] args){     //основная функция входа в программу
        ReadCalc readCalc = new ReadCalc();    //ссылка на экземпляр класса=новый объект
        double one;                            //создаем числа
        double two;

        int action;

        do {

            System.out.println("Введите первое число");
            one = readCalc.readNextDouble();      //присваиваем что он считает с клавиатуры
            System.out.println("Введите второе число");
            two = readCalc.readNextDouble();
            Calculator calculator = new Calculator(one, two); //создали ссылку и инициализировали через конструктор и передали параметры
            System.out.println("Выберете действия:");
            System.out.println("1. Сложить");
            System.out.println("2. Вычесть");
            System.out.println("3. Умножить");
            System.out.println("4.Разделить");
            System.out.println("5. Взять остаток");
            System.out.println("0.Выйти из программы");
            System.out.println("Введите номер пункта:");

            action = (int) readCalc.readNextDouble();
            switch (action) {     // помогает разбить программу на ветки
                case 1:
                    System.out.println("Сумма: " + calculator.add());
                    break;
                case 2:
                    System.out.println("Разность: " + calculator.subs());
                    break;
                case 3:
                    System.out.println("Произведени: " + calculator.multi());
                    break;
                case 4:
                    System.out.println("Частное: " + calculator.div());
                    break;
                case 5:
                    System.out.println("Остаток: " + calculator.mod());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Вы ввели не верное значение");
            }
        } while(action != 0); //чтобы работало постоянноиспользуем цик do while






    }
}
