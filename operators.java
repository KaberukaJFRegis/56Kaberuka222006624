public class operators {
    public static void main(String a[]){
 
 //OR OPERATOR

int ab=10;  
int b=5;  
int c=20;  
System.out.println(ab>b||ab<c);//true  
System.out.println(ab>b|ab<c);//true 
System.out.println(ab>b||ab++<c);//true
System.out.println(ab);//10 
System.out.println(ab>b|ab++<c);//true  
System.out.println(ab);//11

/*       //JAVA AND OPERATOR
int ab=10;
int b=5;
int c=20;
System.out.println(ab<b&&ab<c);//false
System.out.println(ab<b&ab<c);//false

System.out.println(ab<b&&ab++<c);//false  
System.out.println(ab);//10  
System.out.println(ab<b&ab++<c);//false  
System.out.println(ab);//11

//RIGHT SHIFT OPERATOR
System.out.println(10>>2);//2  
System.out.println(20>>2);//5  
System.out.println(20>>3);//2  
       
// LEFT SHIFT OPERATOR
System.out.println(10<<2);//40
System.out.println(10<<3);//80
System.out.println(20<<2);//80
System.out.println(15<<4);//240

//ARITHMETIC OPERATORS
int ac=10;
int b=5;

System.out.println(ac+b);//15
System.out.println(ac-b);//5
System.out.println(ac*b);//50
System.out.println(ac/b);//2
System.out.println(ac%b);//0

System.out.println(10*10/5+3-1*4/2);//21

//UNARY OPERATORS

int x=10;
int y=-10;
boolean c=true;
boolean d=false;


System.out.println(~x);//-11
System.out.println(~y);//9
System.out.println(!c);//false
System.out.println(!d);//True

System.out.println(x++ + ++x);//20
System.out.println(y++ + y++);//21
System.out.println(x++);
System.out.println(++x);
System.out.println(x--);
System.out.println(--x);
*/
    }
}