import java.util.*;
public class overallCode {

    public static Node<Integer> input(){
        Scanner s = new Scanner(System.in);
        Node<Integer> head = null , tail = null;
        int data = s.nextInt();
        while(data!=-1){
            Node<Integer> currnode = new Node<Integer>(data);
            if(head==null){
                head = currnode;
                tail = currnode;
            }
            else{
                tail.next=currnode;
                tail=currnode;
            }
            data = s.nextInt();
        }
        return head;
        }
        

        // public static void insert


        public static void print(Node<Integer> head){
            Node<Integer> temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }


    public static void main(String[] args) {
        Node<Integer> head = input();
        print(head);
    }
}
