import java.util.*;

public class overallCode {

    public static Node<Integer> input() {
        Scanner s = new Scanner(System.in);
        Node<Integer> head = null, tail = null;
        int data = s.nextInt();
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

    public static Node<Integer> insert(Node<Integer> head, int elem, int pos) {
        Node<Integer> newnode = new Node<Integer>(elem);
        int count = 0;
        Node<Integer> prev = head;
        if (pos == 0) {
            newnode.next = head;
            return newnode;
        } else {
            while (count < pos - 1 && prev != null) {
                count++;
                prev = prev.next;
            }
            if (prev != null) {
                newnode.next = prev.next;
                prev.next = newnode;
            }
            return head;
        }
    }

    public static Node<Integer> delete(Node<Integer> head , int pos){
        if(head==null){
            return head;
        }
        if(pos==0){
            return head.next;
        }
        Node<Integer> currhead  = head;
        int count=0;
        while(currhead!=null && count<pos-1){
            count++;
            currhead=currhead.next;
        }
        if(currhead!=null){
            currhead.next=currhead.next.next;
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

    public static void main(String[] args) {
        Node<Integer> head = input();
        head = insert(head, 90, 3);
        delete(head,2);
        print(head);
    }
}
