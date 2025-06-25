public class Main {
    public static void main(String[] args) {
        Product original = new Product("Pylosos", 2500);
        Product copy = original.clone();
        copy.name = "Klonovanyi pylosos";

        Logger logger = new LoggerAdapter();
        logger.log("Dodano tovar: " + copy.name);

        ProductPublisher publisher = new ProductPublisher();
        publisher.addObserver(new User("Anna"));
        publisher.addObserver(new User("Ihor"));

        publisher.notifyObservers(copy);
    }
}
