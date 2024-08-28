public class WashQueue {
    Node rear = null;
    Node front = null;
    boolean isEmpty() {
        return this.front == null && this.rear == null;
    }

    public void addCar(Car car){
        Node newNode = new Node(car);
        if(this.rear == null){
            this.front = newNode;
            this.rear = newNode;
        }else{
        this.rear.next = newNode;
        this.rear = newNode;
    }}

    public void washCar(){
        if(isEmpty()){
            System.out.println("there is no car to wash");
            return;
        }
        else if(this.front == this.rear){
            this.front = null;
            this.rear = null;
            return;
        }
        this.front = this.front.next;
    }

    public void printTotalCars(){
        Node curr = this.front;
        int i = 0;
        while (curr != null) {
            i++;
            curr = curr.next;
        }System.out.println("Total Cars: " + i);
    }

    public void printFirstCar(){
        System.out.println("Car Type: " + this.front.car.type);
        System.out.println("Car Color: " + this.front.car.color);
        System.out.println("Car plate: " + this.front.car.plateNumber);

    }
    
}
