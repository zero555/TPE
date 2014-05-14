package tpe_imb_03.pflichtuebung_03.aufgabe_01;

public class Node<T> extends Graph {

	private String name;
	private Node<T> wert;
	private Node<T> child;

	public Node(String name, Node<T> wert) {
		this.name = name;
		this.wert = wert;
	}

	public void addChild(Node<T> node) {
		this.child = node;
	}

	public Node<T> getChildren(Node<T> node) {
		if (child.getChildren(node).child.getChildren(child) == null) {
			return child.getChildren(node);
		}

		return child.getChildren(child);
	}

	public String getName() {
		return name;
	}

	public Node<T> getValue() {
		return wert;
	}
}