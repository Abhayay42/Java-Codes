public class practice {

    public static Node<Integer> LL(){
        Node<Integer> n1 = new Node(12);
        Node<Integer> n2 = new Node(14);
        Node<Integer> n3 = new Node(16);
        Node<Integer> n4 = new Node(18);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;

        return n1;
    }


    public static void traverse(Node<Integer> head, int i){
        int position =1;
        Node<Integer> temp = head;
        while(temp!=null && position<i){
            temp=temp.next;
            position++;
        }
        System.out.println(temp.data);

    }

    // public static void print(Node<Integer> head){
    //     Node<Integer> temp = head;
    //     while(temp!=null){
    //     System.out.println(temp.data);
    //     temp=temp.next;
    //     }
    // }


    public static void main(String[] args) {
        Node<Integer> head = LL();
        // print(head,3);
        traverse(head,3);
    }
}
