public class MrBob {
    public double SimpleInterest(double Principle, double Rate, double Time){
   return(Principle*Rate*Time)/100;
    
    }
  public static void main(String args[]){
    MrBob bob = new MrBob();
    bob.SimpleInterest(100000, 05, 5)
    System.out.println("The simple interest is "+bob.SimpleInterest(100000, 5, 5));
  }

  }