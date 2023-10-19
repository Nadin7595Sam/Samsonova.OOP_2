// Окно 3: Market.java
import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {
    private List<String> queue = new ArrayList<>();
    private List<String> orders = new ArrayList<>();

    // Реализация методов из QueueBehaviour

    @Override
    public void addToQueue(String person) {
        queue.add(person);
        System.out.println(person + " добавлен(а) в очередь.");
    }

    @Override
    public String removeFromQueue() {
        if (!queue.isEmpty()) {
            String person = queue.remove(0);
            System.out.println(person + " удален(а) из очереди.");
            return person;
        }
        return "Очередь пуста.";
    }

    // Реализация методов из MarketBehaviour

    @Override
    public void acceptOrder(String order) {
        orders.add(order);
        System.out.println("Заказ принят: " + order);
    }

    @Override
    public String fulfillOrder() {
        if (!orders.isEmpty()) {
            String order = orders.remove(0);
            System.out.println("Заказ выполнен: " + order);
            return order;
        }
        return "Нет заказов на выполнение.";
    }

    // Метод для обновления состояния магазина
    public void update() {
        System.out.println("Состояние очереди: " + queue);
        System.out.println("Состояние заказов: " + orders);
    }
}