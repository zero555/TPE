package tpe_imb_03.pflichtuebung_03.aufgabe_01;

public class Graph<T>  {

	private Node<T> head;

	public Graph(Node<T> n) {
		this.head = n;
	}

	public NodeList<T> search(SearchStrategy<T> suche,T wert, Node<T> node) {
		NodeList<T> result= new NodeListImpl<T>();
		result=suche.search(wert, node);
		System.out.println(suche.getPath());
		return result;
	}

	public void copyInto(List<T> liste) {

	}

	public void setHead(Node<T> node) {

	}

	public Node<T> getHead() {
		return head;
	}

}
