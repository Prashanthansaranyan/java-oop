class C extends A implements IB{
	int z;
	C(){
		this.z=30;
	}
	void getx(){
		System.out.println("Ax is "+super.x);
	}
	public void gety(){
		System.out.println("IBY is "+Y);
	}
	void getz(){
		System.out.println("Cz is "+this.z);
	}
	
}