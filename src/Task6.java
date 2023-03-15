public class Task6 {
    public class MyDS<T> {
        private Node<T> head;
        private Node<T> tail;
        public MyDS() {
            head = null;
            tail = null;
        }
        public void add(T value) {
            Node<T> newNode = new Node<>(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }
        public void remove(Node<T> node) {
            if (node.prev == null) {
                head = node.next;
            } else {
                node.prev.next = node.next;
            }
            if (node.next == null) {
                tail = node.prev;
            } else {
                node.next.prev = node.prev;
            }
        }
        public Node<T> getHead() {
            return head;
        }
        public Node<T> getTail() {
            return tail;
        }
        public static class Node<T> {
            private T value;
            private Node<T> prev;
            private Node<T> next;
            public Node(T value) {
                this.value = value;
                this.prev = null;
                this.next = null;
            }
            public T getValue() {
                return value;
            }
            public Node<T> getPrev() {
                return prev;
            }
            public Node<T> getNext() {
                return next;
            }
        }
    }
}
