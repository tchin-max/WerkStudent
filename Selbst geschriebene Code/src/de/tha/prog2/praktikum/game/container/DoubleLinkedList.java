package de.tha.prog2.praktikum.game.container;

import java.util.ArrayList;
import java.util.Iterator;

public class DoubleLinkedList extends AbstractContainer {
	private java.util.List<Object> arrayList = new ArrayList<>();


    private class Node {
        Object data;
        Node next;
        Node prev;

        Node(Object data) {
            this.data = data;
        }
    }

    private Node head;
    private int count;

    public DoubleLinkedList() {
        head = new Node(null);
        head.next = head;
        head.prev = head;
        count = 0;
    }

    @Override
    public boolean add(Object o) {
        if (this.contains(o)) {
            throw new AlreadyExistsException("Element schon vorhanden");
        }

        Node newListElem = new Node(o);
        newListElem.prev = head.prev;
        newListElem.next = head;
        head.prev.next = newListElem;
        head.prev = newListElem;
        count++;
        return true;
    }

    @Override
    public Object get(int idx) {
        if (idx < 0 || idx >= count) {
            throw new OutOfIndexException("Ungültiger Index: " + idx);
        }

        Node node = head.next;
        for (int i = 0; i < idx; i++) {
            node = node.next;
        }
        return node.data;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean remove(Object o) {
        Node node = head.next;
        while (node != head) {
            if (o.equals(node.data)) {
                node.prev.next = node.next;
                node.next.prev = node.prev;
                count--;
                return true;
            }
            node = node.next;
        }
        throw new ElementNotFoundException("Element nicht in der Liste enthalten");
    }

    @Override
    public void get(Container c) {
    }

	@Override
	public Iterator iterator() {
		Container c = new DoubleLinkedList ();
		Iterator iter = c.iterator();
		
		
		return iter;		
	}
}
