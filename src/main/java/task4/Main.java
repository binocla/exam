package task4;

public class Main {
    public static void main(String[] args) {
        Email email1 = new Email("binocla@ckorovoda.ru", "ckorovoda@ckorovoda.ru", "Оплата сервисов");
        Email email2 = new Email("tdoktora@inbox.ru", "tdoktora@inbox.ru", "Пароли", "12345", true);
        Notification notification1 = new Notification("RussianPost", "+79013213232");
        Notification notification2 = new Notification("Wildberries", "+16164998959", "Акция!!!!!♂");
        Letter letter1 = new Letter("Sergey", "Maria", "С любовью");
        Letter letter2 = new Letter("Sergey", "Danila", "С любовью (большой!");
        PostOffice postOffice = new PostOffice("Kazan", "410012", new Letter[]{letter1, letter2});

        email1.send();
        System.out.println(email1);
        System.out.println("-----");

        email2.send();
        System.out.println(email2);
        System.out.println("-----");

        notification1.send();
        notification1.receive();
        System.out.println(notification1);
        System.out.println("-----");

        notification2.send();
        notification2.receive();
        System.out.println(notification2);
        System.out.println("-----");

        letter1.print();
        System.out.println(letter1);
        System.out.println("-----");

        letter2.print();
        System.out.println(letter2);
        System.out.println("-----");

        postOffice.receive();
        postOffice.print();
        System.out.println(postOffice);
        System.out.println("-----");

        Message[] messages = new Message[6];
        messages[0] = email1;
        messages[1] = email2;
        messages[2] = notification1;
        messages[3] = notification2;
        messages[4] = letter1;
        messages[5] = letter2;

        System.out.println("-----");
        for (int i = 0; i < messages.length; i++) {
            System.out.println(messages[i]);
            System.out.println(messages[i].typeOfContent());
        }
    }
}
