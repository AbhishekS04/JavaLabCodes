//! wap a java prog to implement interface for a single class

interface In1{
    int s =10;
    public void show();
}
class Num implements In1{
   int val , sum ;
   Num(int x){
       val = x;
   }
   public void sum (){
       sum = val + s;
   }
   public void show(){
       display();
   }
void display(){
    System.out.println("Sum : "+sum);
   }
}
public class main {
    public static void Main(String[] args) {
        Num n = new Num(42);
        n.sum();
        n.show();
    }
}

// ? Output : Sum : 52