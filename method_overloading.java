class bank 
{
 int getintrest()
 {
  return 0;
 }
 }
 class sbI extends bank
 {
  int getintrest()
  {
   return 8;
  }
 }
class icici extends bank
{
 return 7;
}
}
class axis extends bank
{
 int getintrest()
{
 return 7;
}
}
class axis extends bank
{
 int getintrest()
{
 return 9;
}
}
class method_overriding
{
public static void main(string args[])
{
 sbI s=new sbI();
 icici i=new icici();
 axis a=new axis();

system.out.println("sbI intrest rate:"+s.getintrest());
system.out.println("icici intrest rate:"+s.getintrest());
system.out.println("axis intrest rate:"+s.getintrest());
}
 