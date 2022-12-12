package Sistema;

/**
 * @author Jorge Hernandez Araya | jorge09ha
 * @author Axel Noel Cabezas Cerda | AxelCab17
 * @author Julian Aguirre Guerrero | JulianAG420
 * @author Roberto Iribarren Hernandez | Roberto2401
 * @param <T>
 */
public class Node<T> {
// Se define el nodo 
    private T value;

    private Node<T> next;
    private Node<T> back;
//Se crean los constuctores del nodo 
    public Node() {
    }

    public Node(T value) {
        this.value = value;
    }
//Se definen los get y set del nodo antes definido 
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getBack() {
        return back;
    }

    public void setBack(Node<T> back) {
        this.back = back;
    }

}
