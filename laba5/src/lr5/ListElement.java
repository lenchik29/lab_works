package lr5;

public class ListElement {
    private final int value;
    private ListElement next;

    public ListElement(int value){
        this.value=value;
    }
    //Получение значения элемента
    public int getValue(){
        return value;
    }
    //Получение следующего элемента
    public ListElement getNext() {
        return next;
    }
    //Присвоить значение
    public void SetNext (ListElement element) {
        this.next=element;
    }
}