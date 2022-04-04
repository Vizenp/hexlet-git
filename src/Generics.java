import java.io.Serializable;


public class Generics <T extends Comparable, V extends Serializable, K extends Number>{

  private T obT;
  private V obV;
  private K obK;

  public Generics(T obT, V obV, K obK){
    this.obT = obT;
    this.obV = obV;
    this.obK = obK;
  }

  public T getObT() {
    return obT;
  }
  public V getObV() {
    return obV;
  }
  public K getObK() {
    return obK;
  }

  public void showTypes(){
    System.out.println(obT.getClass().getName() + " " + obV.getClass().getName() + " " +obK.getClass().getName());
  }  

  public static void main(String[] args) {
    Generics<Integer, String, Boolean> gen = new Generics<>(88, "gen", true);
    gen.showTypes();
  }
}
