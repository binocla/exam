package task4;

import java.util.Arrays;

public class PostOffice implements Receive, Print {
    private String address;
    private String zipCode;
    private Letter[] letters;

    public PostOffice(String address, String zipCode, Letter[] letters) {
        this.address = address;
        this.zipCode = zipCode;
        this.letters = letters;
    }

    public PostOffice(String address) {
        this(address, null, null);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Letter[] getLetters() {
        return letters;
    }

    public void setLetters(Letter[] letters) {
        this.letters = letters;
    }

    @Override
    public void receive() {
        System.out.println("New letter has arrived!");
    }

    @Override
    public void print() {
        for (int i = 0; i < letters.length; i++) {
            letters[i].print();
        }
    }

    @Override
    public String toString() {
        return "PostOffice{" +
                "address='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", letters=" + Arrays.toString(letters) +
                '}';
    }
}
