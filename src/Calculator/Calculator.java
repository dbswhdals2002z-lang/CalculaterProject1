package Calculator;

public class Calculator {
   // 1. 속성
    int num;
    int num2;
    char operatoer;



    // 2. 생성자
    Calculator(int num, int num2, char operatoer) {
        this.num = num;
        this.num2 = num2;
        this.operatoer = operatoer;


        // 3. 기능
        Calculator calculator =new Calculator(10,5,'+');
        System.out.println("calculator = " + calculator);

        Calculator calculator1 =new Calculator(10,5,'-');
        System.out.println("calculator1 = " + calculator1);

        Calculator calculator2=new Calculator(10,5,'/');
        System.out.println("calculator2 = " + calculator2);

        Calculator calculator3=new Calculator(10,5,'*');
        System.out.println("calculator3 = " + calculator3);





}
