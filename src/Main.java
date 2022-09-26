public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b);
        // отсутствует проверка деления на ноль,
        // можно реализовать ее тернарным оператором и при делении на ноль выдавать null,
        // который приведет к NullPointerException

        calc.println.accept(c);
    }
}