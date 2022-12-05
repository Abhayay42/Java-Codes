import java.util.Scanner;

public class NodeDeletion7 {

    public static Node<Integer> haha() {
        Scanner s = new Scanner(System.in);
        Node<Integer> head = null, tail = null;
        int data = s.nextInt();
        //hello
        while (data != -1) {
            Node<Integer> currnode = new Node<Integer>(data);
            if (head == null) {
                head = currnode;
                tail = currnode;
            } else {
                tail.next = currnode;
                tail = currnode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    // public static Node<Integer> insert(Node<Integer> head, int elem, int pos) {
    // Node<Integer> nodetobeinserted = new Node<Integer>(elem);
    // if (pos == 0) {
    // nodetobeinserted.next=head;
    // return nodetobeinserted;
    // }
    // else {

    // int count = 0;
    // Node<Integer> prev = head;
    // while (count < pos - 1 && prev != null) {
    // count++;
    // prev = prev.next;
    // }
    // if (prev != null) {
    // nodetobeinserted.next = prev.next;
    // prev.next = nodetobeinserted;
    // }
    // return head;
    // }
    // // print(head);
    // }

    public static Node<Integer> delete(Node<Integer> head, int posi) {
        if (head == null) {
            return head;
        }
        if (posi == 0) {
            return head.next;
        }
        int count = 0;
        Node<Integer> currhead = head;
        while (currhead != null && count < (posi - 1)) {
            count++;
            currhead = currhead.next;
        }
        // if( currhead.next==null){
        // return head;
        // }
        if (currhead != null) {

            currhead.next = currhead.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = haha();
        // head =insert(head, 80, 0);
        head = delete(head, 6);
        print(head);

    }
}

