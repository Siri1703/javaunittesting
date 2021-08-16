public class Arithmeticadd {
    int num1,num2;
    Arithmeticadd(int num1,int num2)
    {
        this.num1=num1;
        this.num2=num2;
    }
    public int sum()
    {
        return num1+num2;
    }

    public int sub() {
        return num1-num2;
    }

    public int multiply() {
        return num1*num2;
    }

    public int  division() {
        return num1%num2;
    }
}
