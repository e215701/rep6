/* package jp.ac.uryukyu.ie.e215701_e215717;

class Judge extends InfoTouma {
    Judge(int Touma, int Akamine, int Wada) {
        super(Touma, Akamine, Wada);
    }

     int Touma  = 1;  int Akamine = 2;  int Wada =3;


    
    public  void JudgePerson(int Touma, int Akamine, int Wada){
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

    public  static void main(String[] args){
        Judge person = new Judge(1,2,3);
        System.out.println(person);
    }

    
}
 */