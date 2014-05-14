package tpe_imb_03.pflichtuebung_03.aufgabe_01;

public class Graph implements SearchStrategy {

	private static Node head;
	private Node node;

	@Override
	public void search(String suche) {
		if (suche.equalsIgnoreCase("Breitensuche")) {

		} else if (suche.equalsIgnoreCase("Tiefenensuche")) {
		}
	}

	public void copyInto(List liste) {
		liste.addFirst(this.head);
		liste.add(this.node);
	}

	public void setHead(Node node) {
		head = node;
	}

	public static Node getHead() {
		return head;
	}

	@Override
	public List getPath() {
		// TODO Auto-generated method stub
		return null;
	}

}