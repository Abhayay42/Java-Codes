public class Traversing5 {

    public static Node<Integer> LL() {
        Node<Integer> n1 = new Node<>(30);
        Node<Integer> n2 = new Node<>(60);
        Node<Integer> n3 = new Node<>(90);
        Node<Integer> n4 = new Node<>(120);
        Node<Integer> n5 = new Node<>(150);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        return n1;
    }

    public static void Trav(Node<Integer> head, int i) {
        int position = 1; 
        Node<Integer> temp = head;

        while (temp != null && position < i) {
            temp = temp.next;
            position++;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        Node<Integer> head = LL();
        Trav(head, 3);

    }
}
