class student
{
  int rollno;
  String name;
  static String college="vsc";
  
  student (int r,String n)
  {
    rollno=r;
	name=n;
  }
  void display()
  {
    System.out.println(rollno+""+name+""+college);
  }
   public static void main(String args[])
  {
    student s1=new student(10,"xyz"); 
    student s2=new student(20,"abc"); 	
	s1.display();
	s2.display();
  }
}  