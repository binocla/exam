package task4;

public class Notification extends Message implements Receive, Send {
    private String from;
    private String to;

    public Notification(String from, String to, String content) {
        super(content);
        this.from = from;
        this.to = to;
    }

    public Notification(String from, String to) {
        this(from, to, "New notification!");
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public void receive() {
        System.out.println("New Telegram notification!");
    }

    @Override
    public void send() {
        System.out.println("Notification has successfully sent!");
    }

    @Override
    public String getFrom() {
        return "Уведомление от: " + from;
    }

    @Override
    public String getTo() {
        return "Уведомление к: " + to;
    }

    @Override
    public String getContent() {
        return "Текст уведомления: " + content;
    }

    @Override
    public String typeOfContent() {
        return "Notification";
    }

    @Override
    public String toString() {
        return "Notification{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
