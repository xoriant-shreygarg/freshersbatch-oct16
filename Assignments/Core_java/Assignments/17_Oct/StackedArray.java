class StackedArray {
	private int ary[];
	private int indexOfTop;
	
	public StackedArray(){
		this.ary = new int[10];
		this.indexOfTop = 0;
	}
	
	public void push(int number) {
		this.ary[this.indexOfTop++] = number;
	}
	public int pop() {
		if(indexOfTop>-1){
			this.indexOfTop--;
			int temp = this.ary[this.indexOfTop];
			this.ary[this.indexOfTop] = -2;
			return temp;
			}
		return -1;
	}
	public static void main(String args[]){
		StackedArray stackedArray = new StackedArray();
		stackedArray.push(1);
		stackedArray.push(2);
		stackedArray.push(3);
		stackedArray.push(4);
		System.out.println(""+stackedArray.pop());
		System.out.println(""+stackedArray.pop());
		stackedArray.push(5);
		System.out.println(""+stackedArray.pop());
		System.out.println(""+stackedArray.pop());
	}
}