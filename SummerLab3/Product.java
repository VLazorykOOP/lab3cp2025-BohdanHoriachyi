import java.util.ArrayList;

class Product implements Cloneable {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product clone() {
        return new Product(this.name, this.price);
    }
}

// === Observer ===

interface Observer {
    void update(Product product);
}

class User implements Observer {
    String name;

    public User(String name) {
        this.name = name;
    }

    public void update(Product product) {
        System.out.println(name + " dyznavsia pro tovar: " + product.name + " (" + product.price + " hrn)");
    }
}

class ProductPublisher {
    ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    public void notifyObservers(Product product) {
        for (Observer obs : observers) {
            obs.update(product);
        }
    }
}
