package Intro_Lab_Tasks;

public class ArrayQueue {

  private Object[] queue;
  private int front;
  private int rear;
  private int size;

  public ArrayQueue(int arrayLen) {
    this.queue = new Object[arrayLen];
    this.front = 0;
    this.rear = 0;
    this.size = 0;
  }

  public void enqueue(Object element) {
    if (size == queue.length) {
      System.out.println("queue overflow");
      return;
    }
    queue[rear] = element;
    rear = ++rear % queue.length;
    size++;
  }

  public Object dequeue() {
    if (size == 0)
      return null;
    Object temp = queue[front];
    front = ++front % queue.length;
    size--;
    return temp;
  }

  public Object peek() {
    if (size == 0)
      return null;
    return queue[front];
  }

  public boolean isEmpty() { return size == 0; }
}
