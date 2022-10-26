import java.io.*;

public class Ejer3_9 {

	Node head; // cabeza de la lista

	// Lista enlazada Nodo.
	// El nodo es una clase estática anidada
	// para que main() pueda acceder a ella
	static class Node {

		int data;
		Node next;

		// Constructor
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	// Método para insertar un nuevo nodo
	public static Ejer3_9 insert(Ejer3_9 list, int data)
	{
		// Crea un nuevo nodo con los datos dados
		Node new_node = new Node(data);
		new_node.next = null;

		// Si la Ejer3_9 está vacía, entonces haz el nuevo nodo como head
		if (list.head == null) {
			list.head = new_node;
		}
		else {
			// Si no, recorre hasta el último nodo e insertar el nuevo nodo allí
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}

			// Insertar el new_node en el último nodo
			last.next = new_node;
		}

		// Devuelve la lista por head
		return list;
	}

	// Método para imprimir el Ejer3_9.
	public static void printList(Ejer3_9 list)
	{
		Node currNode = list.head;

		System.out.print("Ejer3_9: ");

		// Recorrido por la Ejer3_9
		while (currNode != null) {
			// Imprime los datos en el nodo actual
			System.out.print(currNode.data + " ");

			// Pasar al siguiente nodo
			currNode = currNode.next;
		}

		System.out.println();
	}

	// Método para eliminar un nodo de la Ejer3_9 por POSICIÓN
	public static Ejer3_9
	deleteAtPosition(Ejer3_9 list, int index)
	{
		// Almacenar el nodo de head
		Node currNode = list.head, prev = null;

		// CASO 1:
		// Si el índice es 0, entonces el propio nodo head debe eliminado
        //

		if (index == 0 && currNode != null) {
			list.head = currNode.next; // Changed head

			// Mostrar el mensaje
			System.out.println(
				index + " posición del elemento eliminado");

			// Devuelve la lista actualizada
			return list;
		}

		// CASO 2:
		// Si el índice es mayor que 0 pero menor que el tamaño de Ejer3_9
        //

		// El contador
		int counter = 0;

		// Cuenta para el index que se va a borrar,
		// mantener la pista del nodo anterior
		// ya que es necesario para cambiar currNode.next
		while (currNode != null) {

			if (counter == index) {
				// Ya que el nodo currNode es la posición requerida
				// posición Desvincular currNode de linked list
				prev.next = currNode.next;

				// Mostrar el mensaje
				System.out.println(
					index + " posición del elemento eliminado");
				break;
			}
			else {
				// f current position is not the index
				// continúa con el siguiente nodo
				prev = currNode;
				currNode = currNode.next;
				counter++;
			}
		}

		//  Si se encontró el elemento de posición, debería estar
		// en currNode Por lo tanto el currNode no debe ser
		// nulo


		// CASO 3:
        // El index es mayor que el tamaño del Ejer3_9
		//
		// En este caso, el currNode debe ser null
		if (currNode == null) {
			// Mostrar el mensaje
			System.out.println(
				index + " posición del elemento eliminado");
		}

		// Devuelve la lista actualizada
		return list;
	}

	// **************MÉTODO MAIN**************

	// para crear una Singly linked list con n nodos
	public static void main(String[] args)
	{
		/* Empieza con la lista vacía. */
		Ejer3_9 list = new Ejer3_9();

		//
		// ******INSERCIÓN******
		//

		// Insertar los valores
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 8);

		// Imprime la Ejer3_9
		printList(list);

		//
		// ******ELIMINACIÓN EN LA POSICIÓN******
		//

		// Eliminar el nodo en la posición 0
		deleteAtPosition(list, 0);

		// Imprime la Ejer3_9
		printList(list);

		// Eliminar el nodo en la posición 2
		deleteAtPosition(list, 2);

		// Imprimi la Ejer3_9
		printList(list);

		// Eliminar el nodo en la posición 1
		deleteAtPosition(list, 10);

		// Imprime la Ejer3_9
		printList(list);
	}
}