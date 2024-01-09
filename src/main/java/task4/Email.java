package task4;

public class Email extends Message implements Send {
    private String from;
    private String to;
    private String subject;
    private boolean hasAttachments;

    public Email(String from, String to, String subject, String content, boolean hasAttachments) {
        super(content);
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.hasAttachments = hasAttachments;
    }

    public Email(String from, String to, String subject) {
        this(from, to, subject, null, false);
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean isHasAttachments() {
        return hasAttachments;
    }

    public void setHasAttachments(boolean hasAttachments) {
        this.hasAttachments = hasAttachments;
    }

    @Override
    public String getFrom() {
        return "Email от: " + from;
    }

    @Override
    public String getTo() {
        return "Email к: " + to;
    }

    @Override
    public String getContent() {
        return "Содержание письма: " + content +
                "\nЕсть ли вложения? " + hasAttachments;
    }

    @Override
    public String typeOfContent() {
        return "Email";
    }

    @Override
    public void send() {
        System.out.println("Email has successfully sent to " + to);
    }

    @Override
    public String toString() {
        return "Email{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", hasAttachments=" + hasAttachments +
                '}';
    }
}
