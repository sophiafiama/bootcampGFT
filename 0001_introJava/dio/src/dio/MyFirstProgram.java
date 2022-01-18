package dio;
import dio.base.Order;

public class MyFirstProgram {
    public static void main(String[] args) {
        Order order = new Order("code 1234");
        System.out.println(order.toString());
        System.out.println("Teste");
    }
}
