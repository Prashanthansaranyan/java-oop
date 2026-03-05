class Student1{
	int id;
	String name;
  Student1(){
	this.id=1000;
	this.name="seelan";
  }
  Student1(int id,String name){
	this.id=id;
	this.name=name;
  }
  Student1(int id){
	this.id=id;
	this.name="seelan";
  }
  Student1(String name){
	this.id=1000;
	this.name=name;
  }
  Student1(String name ,int id){
	this.id=id;
	this.name=name;
  }
   void getStudent1(){
	System.out.println("id :"+this.id);
	System.out.println("name :"+this.name);
   }
}