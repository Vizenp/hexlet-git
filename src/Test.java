import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        Test someClass = new Test();
        Button button = new Button();

        someClass.registerCallBack(button);
        someClass.doSomething();

    }
    interface Callback{
        void callingBack();
    }

    Callback callback;

    public void registerCallBack(Callback callback){
        this.callback = callback;
    }

    void doSomething(){
        System.out.println("button is pressed");
        callback.callingBack();
    }
}
class Button implements Test.Callback {

    @Override
    public void callingBack() {
        System.out.println("Вызов метода обратного вызова");
    }
}
