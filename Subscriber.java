public class Subscriber {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Method to handle receiving news
    public void receiveNews(String news) {
        System.out.println(name + " received news: " + news);
    }
}
