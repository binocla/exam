package task4;

public class Letter extends Message implements Print {
    private String from;
    private String to;
    private boolean isParcel;

    public Letter(String from, String to, String content, boolean isParcel) {
        this(from, to, content);
        this.content = content;
        this.isParcel = isParcel;
    }

    public Letter(String from, String to, String content) {
        super(content);
        this.from = from;
        this.to = to;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isParcel() {
        return isParcel;
    }

    public void setParcel(boolean parcel) {
        isParcel = parcel;
    }

    @Override
    public String getFrom() {
        return "Письмо от: " + from;
    }

    @Override
    public String getTo() {
        return "Письмо к: " + to;
    }

    @Override
    public String getContent() {
        return "Содержание письма: " + content;
    }

    @Override
    public String typeOfContent() {
        return "Letter";
    }

    @Override
    public void print() {
        System.out.println("Письмо от " + from + " к " + to);
    }

    @Override
    public String toString() {
        return "Letter{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", isParcel=" + isParcel +
                '}';
    }
}
