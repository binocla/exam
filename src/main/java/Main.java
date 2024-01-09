import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // Man - ascender
        // Woman - inheritor

        Man man = new Man();
        Woman woman = new Woman();
        // Восходящее преобразование (upcasting) / расширение...
        var man1 = (Man) woman; // Давай сделаем так, что woman -> man

        // Нисходящее преобразование (downcasting) / сужение...
//        var woman1 = (Woman) man;

        Man m1 = new Man();
        Man m2 = new Woman();
        Man m3 = new Child();

        Man[] men = {m1, m2, m3};
        for (int i = 0; i < men.length; i++) {
            men[i].method1();
        }

    }

//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null || o.getClass() != getClass()) {
//            return false;
//        }
//
//        Main m = (Main) o; // раз наш Object o такого же типа как и этот класс - давай его сузим до нашего этого (данного) класса!
//
//        if (m.getAge() != age) {
//            return false;
//        }
//        // сначала сравниваем примитивные типы данных, а потом уже - ссылочные
//    }
}
