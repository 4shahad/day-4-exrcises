package T2B3;

public class T2D3 {
    public static void main(String[] args) {

       int arry[]={9,8,7,6,4,3,8};
        try {
            System.out.println(arry[9]);
            System.out.println(" it is ArrayIndexOutOfBoundsException");
       }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("out of bounds");
        }


         Author Author1= new Author("shahad","fjfkfgkl") ;
        System.out.println(Author1);
        Ball Bal1= new Ball(8,5,6,3,2);
        System.out.println(Bal1);
        Bal1.move();
        System.out.println("after move"+Bal1);
        Bal1.reflectHorizental();
        System.out.println("after reflectHorizental"+Bal1);
        Bal1.reflectVertical();
        System.out.println("reflectVertical"+Bal1);
        Employee Employee1=new Employee(123456,3000,
                "shahad","rashed");
        System.out.println(Employee1);
        System.out.println(Employee1.getAnnualSalary());
        System.out.println(Employee1.getName());
       int v=Employee1.raiseSalary(0.50);
        System.out.println(v);
        InvoceItem Inv1= new InvoceItem("123488","hiii",
               23,6.55 );
        System.out.println(Inv1);
        System.out.println(Inv1.Total());
        MyPoint myPoint1=new MyPoint(8,6);
        System.out.println(myPoint1);
        System.out.println(myPoint1.distance(2,4));
        System.out.println(myPoint1.distance3());
        System.out.println(myPoint1.getXY().toString());

        Check(12);
        
        }

    static void Check(int num)throws ArithmeticException{
        if (num%5!=0){
            throw new ArithmeticException("handel - the number is not devided by 5.");
        }else {
            System.out.println("the number is  devided by 5.");
        }
    }
    }

