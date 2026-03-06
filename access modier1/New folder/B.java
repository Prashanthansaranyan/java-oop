package packB;
import packA.A;
public class B extends A{
	int y;
	public B(int y,int x){
		 super(x);
		 this.y=y;
	}
    public void gety(){
		System.out.println("By : "+this.y);
   }
}