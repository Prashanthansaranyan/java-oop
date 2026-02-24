class MainStudent{
	public static void main(String agrs []){
		Student obj=new Student();
			obj.SetStudent();
		    obj.getStudent();
		Student obj1=new Student();
			obj1.SetStudent(2000);
			obj1.getStudent();
		Student obj2=new Student();
			obj2.SetStudent("saran");
			obj2.getStudent();
		Student obj3=new Student();
			obj3.SetStudent(4000,"yan");
			obj3.getStudent();
		Student obj4=new Student();
			obj4.SetStudent("paavi",5000);
			obj4.getStudent();			
	}
}	