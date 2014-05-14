package tpe_imb_03.pflichtuebung_03.aufgabe_01;

/**
 * Einfache Datenstruktur zur Verwaltung einer Reihe von Elementen.
 * 
 * @param <T>
 *            Typ der gespeicherten Elemente.
 */
public interface NodeList extends List<Node> {
	/**
	 * Überprüft, ob ein Element bereits vorhanden ist.
	 * 
	 * @param e
	 *            Element auf das geprüft werden soll
	 * @return true wenn vorhanden, andernfalls false
	 */
	public abstract boolean contains(Object e);

	/**
	 * Fügt am Ende ein Element hinzu.
	 * 
	 * @param e
	 *            Element, das hinzugefügt werden soll.
	 * @return ist immer true
	 */
	public abstract boolean add(Node e);

	/**
	 * Fügt am Anfang ein Element hinzu.
	 * 
	 * @param e
	 *            Element, das angefügt werden soll.
	 */
	public abstract void addFirst(Node e);

	/**
	 * Liefert das erste Element zurück, ohne es zu entfernen.
	 * 
	 * @return das erste Element.
	 */
	public abstract Node peekFirst();

	/**
	 * Überprüft, ob Elemente vorhanden sind.
	 * 
	 * @return true wenn die Datenstruktur leer ist, andernlass false
	 */
	public abstract boolean isEmpty();

	/**
	 * Entfernt das erste Element und liefert es zurück.
	 * 
	 * @return das erste Element
	 */
	public abstract Node pollFirst();

	/**
	 * Löscht den Inhalt der List.
	 */
	public abstract void clear();
}
