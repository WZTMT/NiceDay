package First;

public class Java8Tester1 {//不能在表达式内部修改定义在外部的变量
    //在 Lambda 表达式当中不允许声明一个与局部变量同名的参数或者局部变量。
    static String salutation = "Hello! ";


    public static void main(String args[]){
        GreetingService greetService1 = message ->
        {   salutation = "H";
            System.out.println(salutation + message);
        };
        greetService1.sayMessage("Runoob");
        salutation = "HH";
        System.out.println(salutation);


    }

    interface GreetingService {
        void sayMessage(String message);
    }
}
