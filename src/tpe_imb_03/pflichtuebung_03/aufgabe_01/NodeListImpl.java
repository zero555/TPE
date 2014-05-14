package tpe_imb_03.pflichtuebung_03.aufgabe_01;

import java.util.Iterator;

public class NodeListImpl implements NodeList {

	@Override
	public Iterator<Node> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(Node e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addFirst(Node e) {
		e = Graph.getHead();

	}

	@Override
	public Node peekFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Node pollFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

}
