public class Practice {

    public static Node<Integer> LL(){
        Node<Integer> n1 = new Node<>(100);
        Node<Integer> n2 = new Node<>(200);
        Node<Integer> n3 = new Node<>(300);
        Node<Integer> n4 = new Node<>(400);
        Node<Integer> n5 = new Node<>(500);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        return n1;
    }

    public static void Print(Node<Integer> head){
        int count =0;
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Node<Integer> head = LL();
        Print(head);
    }
}
