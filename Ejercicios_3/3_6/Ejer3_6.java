class Node
{
	int data;
	Node next;
	Node(int d)
	{
		this.data = d;
		this.next = null;
	}
}
class Ejer3_6
{
	Node start;
	Ejer3_6()
	{
		start = null;
	}
	
	// Función para empujar el nodo a la cabeza
	public void push(int data)
	{
		if(this.start == null)
		{
		Node temp = new Node(data);
		this.start = temp;
		}
		else
		{
			Node temp = new Node(data);
			temp.next = this.start;
			this.start = temp;
		}
	}
	
	// Para encontrar el penúltimo nodo de la lista enlazada
	public int findSecondLastNode(Node ptr)
	{
		Node temp = ptr;
		
		// Si la lista está vacía o contiene menos de 2 nodos
		if(temp == null || temp.next == null)
			return -1;
	
			// Este bucle se detiene en el penúltimo nodo
		while(temp.next.next != null)
		{
			temp = temp.next;
		}
		return temp.data;
	}
	
    //Ejecución
	public static void main(String[] args)
	{
		Ejer3_6 ll = new Ejer3_6();
		
		/* Utilizar la función push() para construir
		la siguiente lista 6 -> 42 -> 27 -> 58 -> 14 */
		ll.push(14);
		ll.push(58);
		ll.push(27);
		ll.push(42);
		ll.push(6);
		System.out.println(ll.findSecondLastNode(ll.start));
	}
}