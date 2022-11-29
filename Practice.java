import java.util.Scanner;
public class practice {

    public static Node<Integer> out(){

        Scanner s = new Scanner(System.in);
        Node<Integer> head = null, tail=null;
        int data=s.nextInt();
        while(data!=-1){
            Node<Integer> currentnode = new Node<Integer>(data);
            if(head==null){
                head =currentnode;
                tail=currentnode;
            }
            else{
                // Node<Integer>tail = head;
                // while (tail.next!=null) {
                //     tail=tail.next;
                // }
                // tail.next=currentnode;
                tail.next=currentnode;
                    tail= currentnode;
                    

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
        Node<Integer> head = out();
        print(head);
    }
}
