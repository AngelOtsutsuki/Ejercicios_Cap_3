public class Ejer3_5<E> {

    // PREGUNTA
    /* El método removeFirst de la clase SinglyLinkedList incluye un caso especial
       para restablecer el campo tail a null cuando se elimina el último nodo
       de una lista (ver líneas 51 y 52 del fragmento de código 3.15).
       ¿Cuáles son las consecuencias si eliminamos esas dos líneas del código?
       Explique por qué la clase funcionaría o no con tal modificación.
     */
    

    // RESPUESTA
    /*
        No hay consecuencias negativas si se eliminan estas líneas
        (de hecho, habría un ligero aumento de la eficiencia sin ellas).
        Si bien el estado interno puede parecer incoherente con la
        referencia a la cola de un nodo caduco,
        esa referencia a la cola nunca se accede a una lista vacía,
        por lo que la incoherencia no tiene ningún efecto.
     */


    
    //---------------- Clase de nodo anidado ----------------
    private static class Node<E> {
        private E element; // referencia al elemento almacenado en este nodo
        private Node<E> next; // referencia al siguiente nodo de la lista
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }
        public E getElement( ) { return element; }
        public Node<E> getNext( ) { return next; }
        public void setNext(Node<E> n) { next = n; }
    } //----------- Fin de la clase Node anidada -----------

    // variables de instancia de SinglyLinkedList
    private Node<E> head = null; // nodo principal de la lista (o null si está vacío)
    private Node<E> tail = null; // último nodo de la lista (o null si está vacío)
    private int size = 0; // number of nodes in the list
    public Ejer3_5( ) { } // construye una lista inicialmente vacía
    
    // métodos de acceso
    public int size( ) { return size; }
    public boolean isEmpty( ) { return size == 0; }
    public E first( ) { // devuelve (pero no elimina) el primer elemento
        if (isEmpty( )) return null;
        return head.getElement( );
    }
    public E last( ) { // devuelve (pero no elimina) el último elemento
        if (isEmpty( )) return null;
        return tail.getElement( );
    }
    
    // métodos de actualización
    public void addFirst(E e) { // añade el elemento al principio de la lista
        head = new Node<>(e, head); // crear y vincular un nuevo nodo
        if (size == 0)
        tail = head; // caso especial: el nuevo nodo también se convierte en cola
        size++;
    }
    public void addLast(E e) { // añade el elemento al final de la lista
        Node<E> newest = new Node<>(e, null); // nodo será finalmente la cola
        if (isEmpty( ))
            head = newest; // caso especial: lista previamente vacía
        else
        tail.setNext(newest); // nuevo nodo después de la cola existente
        tail = newest; // el nuevo nodo se convierte en la cola
        size++;
    }
    public E removeFirst( ) { // elimina y devuelve el primer elemento
        if (isEmpty( )) return null; // nada que eliminar
        E answer = head.getElement( );
        head = head.getNext( ); // se convertirá en nula si la lista sólo tiene un nodo
        size--;
        /*if (size == 0)
            tail = null; // caso especial ya que la lista está vacía*/
        return answer;
    }
}
