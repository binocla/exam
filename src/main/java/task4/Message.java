package task4;

public abstract class Message {
    protected String content;

    public Message(String content) {
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String typeOfContent() {
        return "Abstract";
    }

    public abstract String getFrom();
    public abstract String getTo();
    public abstract String getContent();

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                '}';
    }
}
