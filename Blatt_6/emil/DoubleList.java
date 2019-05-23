public class DoubleList {

	private DoubleNode head;

	void add(double d) {
		DoubleNode newNode = new DoubleNode(d);
		if (head == null) {
			head = newNode;
		} else {
			DoubleNode cur = head;
			while (cur.getNext() != null) {
				cur = cur.getNext();
			}
			cur.setNext(newNode);
		}
	}

	void insertFirst(double d) {
		DoubleNode oldHead = head;
		head = new DoubleNode(d);
		head.setNext(oldHead);
	}

	double get(int index) {
		if(head == null || index < 0) throw new IndexOutOfBoundsException();
		DoubleNode cur = head;
		for (int i = 0; i < index; i++) {
			cur = cur.getNext();
			if (cur == null) {
				throw new IndexOutOfBoundsException();
			}
		}
		return cur.getValue();
	}

	void remove(int index) {
		if(head == null || index < 0) throw new IndexOutOfBoundsException();
		if(index == 0) {
			head = head.getNext();
			return;
		}
		DoubleNode before = null;
		DoubleNode cur = head;
		for (int i = 0; i < index; i++) {
			before = cur;
			cur = cur.getNext();
			if (cur == null) {
				throw new IndexOutOfBoundsException();
			}
		}
		before.setNext(cur.getNext());
	}

	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		DoubleNode cur = head;
		while (cur != null) {
			strBuilder.append(cur.getValue());
			strBuilder.append(';');
			cur = cur.getNext();
		}
		return strBuilder.toString();
	}

	private static class DoubleNode {
	
		private double value;
		private DoubleNode next;

		DoubleNode () {

		}

		DoubleNode (double value) {
			this.value = value;
		}

		void setValue(double value) {
			this.value = value;
		}

		double getValue() {
			return value;
		}

		void setNext(DoubleNode next) {
			this.next = next;
		}

		DoubleNode getNext() {
			return next;
		}
	}
}