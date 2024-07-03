public class Queue {

   Node front; 
   Node rear;

   public Queue() {
        this.front = null;
        this.rear = null;
   }

   void enqueue(Order data) {
   
        Node newNode = new Node(data);

        if (this.rear == null) {
            this.front = newNode;
            this.rear = newNode;
            return;
        }

        this.rear.next = newNode;
        this.rear = newNode;
    }

    void dequeue() {
        // queue is not empty 
        if (this.front != null) {

            // 1 update pointer 
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;
        }
    } 

    public Node peek() {
        return this.front;
    }
}
