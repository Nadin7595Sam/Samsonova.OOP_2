// Окно 4: Main.java
public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        // Добавляем людей в очередь
        market.addToQueue("Анна");
        market.addToQueue("Петр");
        market.addToQueue("Мария");

        // Принимаем заказы
        market.acceptOrder("Хлеб");
        market.acceptOrder("Молоко");

        // Удаляем человека из очереди
        market.removeFromQueue();

        // Выполняем заказы
        market.fulfillOrder();

        // Обновляем состояние магазина
        market.update();
    }
}
