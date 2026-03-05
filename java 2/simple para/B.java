class B extends A{
	int y;
	B(int y,int x){
		super(x);
		this.y=y;
	}
    void getS(){
		System.out.println("B = "+this.y);
 }
}