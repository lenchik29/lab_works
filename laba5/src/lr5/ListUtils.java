package lr5;
public class ListUtils {
    //Вставка элемента
    public static ListElement insert(ListElement first, int value) {
        ListElement p = new ListElement(value);
        p.SetNext(first);
        return p;
    }
    //Фильтрование по значениям, кратным трем
    public static ListElement filter(ListElement first) {
        ListElement p = null;
        while (first != null) {
            if (first.getValue() % 3 == 0) {
                p = insert(p, first.getValue());
            }
            first = first.getNext();
        }
        return p;
    }
    //рекурсивное возведение элементов в куб
    public static ListElement map(ListElement first) {
        if (first == null) {
            return null;
        }
        int value = first.getValue();
        return insert(map(first.getNext()), value * value * value);
    }
    //суммирование кубов
    public static int reduce(ListElement first) {
        int rez = 0;
        while (first != null) {
            rez += first.getValue();
            first = first.getNext();
        }
        return rez;
    }
}

