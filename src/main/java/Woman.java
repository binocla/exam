import lombok.Data;

@Data
public class Woman extends Man {
    private boolean rights = false;

    @Override
    public void method1() {
        System.out.println("Woman");
    }
}
