package tpe_imb_03.pflichtuebung_03.aufgabe_01;

public class Graph<T> implements SearchStrategy {

	private Node<T> head;
	private Node<T> node;

	public Graph(Node<T> n) {
		this.head = n;
	}

	@Override
	public void search(String suche) {
		if (suche.equalsIgnoreCase("Breitensuche")) {

		} else if (suche.equalsIgnoreCase("Tiefenensuche")) {
		}
	}

	public void copyInto(List<T> liste) {

	}

	public void setHead(Node<T> node) {

	}

	public Node<T> getHead() {
		return head;

	}

	@Override
	public List<T> getPath() {
		return null;
	}

}
