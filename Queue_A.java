public class Queue_A {
    static class Queue {
        static int arr[];
        static int size; 
        static int rear;
        static int front;


        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            // return rear == -1;
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1)% size == front;
        }

        // Add
        public static void add(int data){
            // if(rear == size-1) {
            //     System.out.println("Queue is full");
            //     return;
            // }

            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            // add 1st element
            if(front == -1){
                front = 0;
            }

            // rear = rear + 1;
            rear = (rear+1) % size;
            arr[rear] = data;
        }


        // Remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }

            // int front = arr[0];
            // for(int i=0; i<rear; i++){
            //     arr[i] = arr[i+1];
            // }
            int result = arr[front];

            // last element delete
            if(rear == front){
                rear = front = -1;
            } else{
                front = (front + 1)% size;
            }
            
            return result;
        }


        // peek
        public static int peek(){
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue Q = new Queue(5);
        Q.add(1);
        Q.add(2);
        Q.add(3);
        System.out.println(Q.remove());
        Q.add(4);
        System.out.println(Q.remove());
        Q.add(5);

        while (!Q.isEmpty()) {
            System.out.println(Q.peek());
            Q.remove(); 
        }
    }
}
