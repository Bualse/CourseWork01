package examination.ticket;

public class Ticket {
    private static int number(int value) {
//    возведение в числа в квадрат, подразумевает умножение на само число....
        return value*value;
    }

    public static void main(String[] args) {
        System.out.println(number(9));
    }
}
