import lombok.Data;

@Data
public class Man {
    private String name;
    private int age;

    public void method1() {
        System.out.println("Man!");
    }
}
