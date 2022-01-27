package simplilearn_phase1;

public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("implicit typecasting:::");
       System.out.println("-----------------------");
       char a='A';
       System.out.println("value of A is:"+a);
       int b=a;
       System.out.println("value of b is:"+b);
       float c=a;
       System.out.println("value of C is:"+c);
       long d=a;
       System.out.println("value of d is:"+d);
       double e=a;
       System.out.println("value of e is:"+e);
       
       System.out.println("x-x-x-x-x-x-x-x-x-x-x-x");
       System.out.println("Explicit typecasting:::");
       System.out.println("------------------------");
       double x=85.6;
       System.out.println("value of X in double:"+x);
       int y=(int)x;
       System.out.println("value of Y after doing explicit-typecasting x into integer:"+y);
       
       }

}
