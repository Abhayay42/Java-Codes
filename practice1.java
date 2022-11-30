import java.util.Scanner;
public class practice1 {

    public static Node<Integer> haha(){
        Scanner s = new Scanner(System.in);
        Node<Integer> head =null , tail=null;
        int data=s.nextInt();
        
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
            data=s.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer>head){
        Node<Integer> temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }

    // public static void insert(Node<Integer> head, int elem, int pos){
    //     int count=0;
    //     Node<Integer> nodetobeinserted = new Node<Integer> (elem);
    //     Node<Integer> prev =null;
    //     while(count<pos-1){
    //         count++;
    //         prev=prev.next;
    //     }
    //     nodetobeinserted.next =prev.next;
    //     prev.next=nodetobeinserted;

    // }

    public static void main(String[] args) {
        Node<Integer> head = haha();
        // insert(head,80,2);
        print(head);

    }
}
