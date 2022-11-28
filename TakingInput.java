import java.util.*;
public class TakingInput {

    public static Node<Integer> inputLL(){
        Scanner s = new Scanner(System.in);
        Node<Integer> head=null;
        int data = s.nextInt();
        while(data!=-1){
            Node<Integer> currentNode = new Node<Integer>(data);

            if(head==null){
                head =currentNode;
            }else{
                 Node<Integer> tail = head;
                 while (tail.next!=null) {
                    tail=tail.next;
                 }
                 tail.next=currentNode;
            }

            data=s.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head){
            Node<Integer> temp = head;
            while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
            }
        }
    public static void main(String[] args) {
        Node<Integer> head = inputLL();
        print(head);
    }
}
