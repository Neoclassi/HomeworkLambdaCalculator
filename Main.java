public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);// при делении надо учесть, чтобы не произошло математической ошибки, т.е. деления на 0
// в теле метода devide с помощью оператора if я использовал проверку делителя, и при делителе равном 0, метод возвращает 0, таким образом избегаем ошибки программы и программа работает
        calc.println.accept(c);
    }
}