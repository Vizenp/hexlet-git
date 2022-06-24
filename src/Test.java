import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        Test someClass = new Test();
        MyClass myClass = new MyClass();

    //инициализируем колбек, передавая методу registerCallBack экземпляр MyClass, реализующий интерфейс колбек
        someClass.registerCallBack(myClass);
        someClass.doSomething();

    }
    // создаем колбек и его метод
    interface Callback{
        void callingBack();
    }

    Callback callback;

    public void registerCallBack(Callback callback){
        this.callback = callback;
    }

    void doSomething(){
        System.out.println("doSomething");
        callback.callingBack();
    }
}
class MyClass implements Test.Callback {

    @Override
    public void callingBack() {
        System.out.println("Вызов метода обратного вызова");
    }
}
