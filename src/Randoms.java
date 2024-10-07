
import java.util.Iterator;
import java.util.Random;


public class Randoms implements Iterable<Integer> {
    protected int min;
    protected int max;
    protected Random random;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random(); // генератор случайных чисел
    }

    // переопределяем метод iterator для создания итератора
    @Override
    public Iterator<Integer> iterator() { // реализуем итератор
        return new Iterator<Integer>() {  // анонимный класс, реализующий интерфейс Iterator
            @Override
            public boolean hasNext() {    // цикл бесконечный (или пока не прервем)
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(max - min + 1) + min; // случайное число число
            }
        };
    }
}
