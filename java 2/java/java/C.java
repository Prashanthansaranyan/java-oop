class C extends B{
	int z;
	C(int z,int x,int y){
		super(y,x);
		this.z=z;
	}
    void getz(){
	  System.out.println("C = "+this.z);
    }
}