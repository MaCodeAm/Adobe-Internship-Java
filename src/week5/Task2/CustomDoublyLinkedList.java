package week5.Task2;

public class CustomDoublyLinkedList<T> {

    private DoublyLinkedNode<T> first;
    private DoublyLinkedNode<T> last;
    private int size;

    public void add( T t){
        if(contains(t)){
            System.out.println("Duplicate data");
            return;
        }
       DoublyLinkedNode<T> node = new DoublyLinkedNode<>(t);
        if(first == null){
            first = node;
            last = node;
            size++;
            return;
        }
       last.setNext(node);
        node.setPrevious(last);
        last = node;
        size++;
    }
    public void addAtTheBeginning(T t){
        if(contains(t)){
            System.out.println("Duplicate data");
            return;
        }
        DoublyLinkedNode<T> node = new DoublyLinkedNode<>(t);
        first.setPrevious(node);
        node.setNext(first);
        first = node;
        size++;
    }
    public int getIndex(T t){
        DoublyLinkedNode<T> node = first;
        int result = 0;
        for(int i =0; i < size; i++){
            if(node != t ){
                node = node.getNext();
            }else {
                result = i;
                break;
            }
        }
        return result;
    }

    public DoublyLinkedNode<T> getNode(int index){
        DoublyLinkedNode<T> node = first;
        for(int i = 0; i < index; i++){
            node = node.getNext();
        }
        return node;
    }

    public void remove(int index){
        DoublyLinkedNode<T> node = getNode(index - 1);
        node.setNext( node.getNext().getNext());
        node.setPrevious(getNode(index - 1));
    }

    public void addAtTheEnd(T t){
        if(contains(t)){
            System.out.println("Duplicate data");
            return;
        }
        DoublyLinkedNode<T> node = new DoublyLinkedNode<>(t);
        last.setNext(node);
        node.setPrevious(last);
        last = node;
        size++;
    }

    public void addAtTheGivenIndex(int index, T t){
        if(contains(t)){
            System.out.println("Duplicate data");
            return;
        }
        DoublyLinkedNode<T> node = getNode(index);
        DoublyLinkedNode<T> tempNode = new DoublyLinkedNode<>(t);
        node.setPrevious(tempNode);
        tempNode.setPrevious(node);
        size++;

    }
    public boolean contains(T t){
        boolean result = false;
        DoublyLinkedNode<T> node = first;
        for(int i =0; i < size; i++){
            if(first.getValue().equals(t)){
                result = true;
                break;
            }
        }
        return result;
    }


}
