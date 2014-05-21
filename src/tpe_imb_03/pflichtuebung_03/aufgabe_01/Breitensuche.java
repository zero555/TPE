package tpe_imb_03.pflichtuebung_03.aufgabe_01;

public class Breitensuche<T> implements SearchStrategy<T> {

	private NodeList<T> path;

	public Breitensuche() {
		this.path = new NodeListImpl<T>();
	}

	@Override
	public NodeList<T> search(T wert, Node<T> head) {
		NodeList<T> result = new NodeListImpl<T>();
		NodeListImpl<T> queue = new NodeListImpl<T>();
		queue.add(head);
		while (!queue.isEmpty()) {
			Node<T> node = queue.pollFirst();
			boolean exist = path.contains(node);
			if (exist == false) {
				path.add(node);
				queue.addAll(node.getChildren());
				if (node.getValue() == wert) {
					result.add(node);
				}
			}
		}
		return result;
	}

	@Override
	public NodeList<T> getPath() {
		// TODO Auto-generated method stub
		return this.path;
	}
}
