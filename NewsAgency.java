import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Subscriber> subscribers = new ArrayList<>();

    // Method to add a subscriber
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber.getName() + " has subscribed.");
    }

    // Method to remove a subscriber
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber.getName() + " has unsubscribed.");
    }

    // Method to publish news
    public void publishNews(String news) {
        System.out.println("Breaking News: " + news);
        notifySubscribers(news);
    }

    // Notify all subscribers about the news
    private void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.receiveNews(news);
        }
    }
}
