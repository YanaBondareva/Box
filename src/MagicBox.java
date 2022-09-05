import java.util.Random;

public class MagicBox<T> {

    protected T[] values;

    public MagicBox(int objectsAmmount) {
        this.values = (T[]) new Object[objectsAmmount];
    }

    public boolean add(T item) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == null) {
                values[i] = item;

                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == null)
                throw new RuntimeException("Коробка не заполнена осталось " + (values.length - i + 1) + " пустых ячеек");
        }
        Random random = new Random();
        int randomInt = random.nextInt(values.length);
        return values[randomInt];
    }
}



