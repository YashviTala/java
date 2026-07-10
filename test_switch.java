class test_switch
{
 public static void main(String args[])
 {
  int x=Integer.parseInt(args[0]);
  switch(x)
  {
   case 1:System.out.println("monday");break;
   case 2:System.out.println("tuesday");break;
   case 3:System.out.println("wednesday");break;
   case 4:System.out.println("thursday");break;
   case 5:System.out.println("friday");break;
   case 6:System.out.println("satursday");break;
   case 7:System.out.println("sunday");break;
   default:System.out.println("invalid number of day");
  }
 }
}