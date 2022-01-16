package jp.ac.uryukyu.ie.e215701_e215717;


public class JudgePerson{
    static int Touma;
    static int Akamine;
    static int Wada;
    /*
    int型の変数Touma,Akamine,Wadaの3つを用意する。
    Mainクラスのmainメソッドにてインスタンスを生成せずにJudge()メソッドを用いて
    いるのでフィールドとJudge()にstaticをつけている。
    */
    
    public static void Judge(String name){
    /*Touma,Akamine,Wadaそれぞれ最も大きい時で条件を分岐させる */
    if (Touma > Akamine && Touma > Wada){
        System.out.println(name + "が思い描いているのはトウマ教授ですね");
    }
    //Toumaが最も大きい値の時の出力↑       
    else if (Akamine > Touma && Akamine > Wada){
        System.out.println(name + "が思い描いているのはアカミネ教授ですね");
    }
    //Akamineが最も大きい値の時の出力↑
    else if (Wada > Touma && Wada > Akamine){
        System.out.println(name + "が思い描いているのはワダ教授ですね");
    }
    //Wadaが最も大きい値の時の出力↑
    else {System.out.println("判別ができませんでした。もう一度お試しください。");
    }
    //それ以外の時の出力↑
}


    /*InfoTouma(int Touma , int Akamine, int Wada){
        this.Touma = Touma;
        this.Akamine = Akamine;
        this.Wada = Wada; 
    }*/

    /*public void setTouma(int Touma){
        this.Touma = Touma;
    }

    public  int getTouma(){
        return this.Touma;
    }

    public void setWada(int WadaPoint){
        this.Wada = WadaPoint;
    }

    public int getWada(){
        return Wada;
    }

    public void setAkamine(int AkaminePoint){
        this.Akamine = AkaminePoint;
    }

    public int getAkamine(){
        return Akamine;
    }*/
}
