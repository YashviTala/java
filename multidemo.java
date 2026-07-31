class x
{
 public void methodx()
 {
  System.out.println("class xmethod");
 }
}
class y extends x
{
 public void methody()
 {
  System.out.println("class ymethod");
 }
}
class z extends y
{
 public void methodz()
 {
  System.out.println("class zmethod");
 }
}
class multidemo
{
 public static void main(String args[])
 {
   z obj=new z();
   obj.methodx();
   obj.methody();
   obj.methodz();
 }
} 