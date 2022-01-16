package jp.ac.uryukyu.ie.e215701_e215717;

public class JudgePerson {
    static int Touma =5;
    static int Akamine=2;
    static int Wada=3;

    public static void main(String[] args) {
        
        if (Touma > Akamine && Touma > Wada){
            System.out.println("あなたが思い描いているのはトウマ教授ですね");
        }       
        else if (Akamine > Touma && Akamine > Wada){
            System.out.println("あなたが思い描いているのはアカミネ教授ですね");
        }
        else if (Wada > Touma && Wada > Akamine){
            System.out.println("あなたが思い描いているのはワダ教授ですね");
        }
        else {System.out.println("else");
        }
    }

}
