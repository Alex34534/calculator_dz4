package Calculator;

public class Operation {
    public static void main(String[] args) {
        Operation ixi = new Operation();
        int a = 10000000;
        int b = 2;
        String c = "/";
        int resultt;


        Multiplication mult = new Multiplication();
        Sum sum = new Sum();
        Subtraction sub = new Subtraction();
        Division div = new Division();

        if (c.equals("/")) {
            resultt = div.execute(a, b);
            System.out.println(resultt);
        }
        if (c.equals("-")) {
            resultt = sub.execute(a, b);
            System.out.println(resultt);
        }
        if (c.equals("+")) {
            resultt = sum.execute(a, b);
            System.out.println(resultt);
        }
        if (c.equals("*")) {
            resultt = mult.execute(a, b);
            System.out.println(resultt);
        }
        if (c.equals("")) {
            System.out.println("пустота");
        }

        if (!c.equals("+") && !c.equals("/") && !c.equals("*") && !c.equals("-") && !c.equals("")) {

            ixi.execute(a, b);

        }

    }

    public int execute(int prinimay, int prinimay2) {
        System.out.println("Не заполнен знак операции или введен недопустимый знак");
        return 0;

    }
}
