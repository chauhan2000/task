package upes;
class ifelse
{
int age = 17;
void func()
{
if (age >= 18)
{
System.out.println("You are welcome");
}
else if(age<18)
{
System.out.println("Please verify your aadhar");
  System.out.println("Age Verified");
}
}

public static void main(String args[])

{
  System.out.println("Running in main function");
ifelse obj = new ifelse();
obj.func();
}

}
