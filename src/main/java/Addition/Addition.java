package Addition;

public class Addition {
    private int a;
    private int b;
    public Addition(){

    }

    public Addition (int a,int b){
        this.a = a;
        this.b = b;
        System.out.println("Calling from int ");
    }
    public Addition (double a,double b){
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("Calling from double ");
    }
    public Addition (String a,String b){
        this.a = Integer.parseInt(a) ;
        this.b = Integer.parseInt(b) ;
        System.out.println("Calling from String ");
    }

    public void sum(){
        System.out.println("Addition is : " + (this.a + this.b));
    }
}
