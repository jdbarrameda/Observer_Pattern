public class Main {
    public static void main(String[] args) {
        // Create a NewsAgency
        NewsAgency newsAgency = new NewsAgency();

        // Create Subscribers
        Subscriber alice = new Subscriber("Alice");
        Subscriber bob = new Subscriber("Bob");
        Subscriber charlie = new Subscriber("Charlie");

        // Manage subscriptions
        newsAgency.subscribe(alice);
        newsAgency.subscribe(bob);

        // Publish breaking news
        newsAgency.publishNews("New technology breakthrough!");

        // Unsubscribe Bob and subscribe Charlie
        newsAgency.unsubscribe(bob);
        newsAgency.subscribe(charlie);

        // Publish another breaking news
        newsAgency.publishNews("Election results announced!");
    }
}
