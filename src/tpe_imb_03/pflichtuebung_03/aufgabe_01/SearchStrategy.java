package tpe_imb_03.pflichtuebung_03.aufgabe_01;

public interface SearchStrategy<T> {

	public NodeList<T> search(T wert, Node<T> node);
	
	public NodeList<T> getPath();
	
}
