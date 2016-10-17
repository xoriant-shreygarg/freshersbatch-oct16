class QueuedArray {
	private int ary[];
	private int rear,front;
	
	public QueuedArray(){
		this.ary = new int[10];
		this.rear = 0;
		this.front = 0;
	}
	
	public void push(int number) {
		this.ary[this.front++] = number;
	}
	public int pop() {
			int temp = this.ary[this.rear];
			this.ary[this.rear] = -2;
			this.rear++;
			return temp;
	}
	public static void main(String args[]){
		QueuedArray queuedArray = new QueuedArray();
		queuedArray.push(1);
		queuedArray.push(2);
		queuedArray.push(3);
		queuedArray.push(4);
		System.out.println(""+queuedArray.pop());
		System.out.println(""+queuedArray.pop());
		queuedArray.push(5);
		System.out.println(""+queuedArray.pop());
		System.out.println(""+queuedArray.pop());
		System.out.println(""+queuedArray.pop());
	}
}