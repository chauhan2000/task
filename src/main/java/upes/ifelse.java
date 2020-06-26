package upes;
class ifelse
{
int age = 17;
void func()
{
if (age >= 18)
{
System.out.println("You are welcome");
  System.out.println("Verifying Your age");
}
else if(age<18)
{
System.out.println("Please verify your aadhar");
}
}

public static void main(String args[])

{
ifelse obj = new ifelse();
obj.func();
}

}
