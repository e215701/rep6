package jp.ac.uryukyu.ie.e215701_e215717;

class Answer {
    private int ToumaPoint;
    private int AkaminePoint;
    private int WadaPoint;
    
    Answer(int ToumaPoint, int AkaminePoint, int WadaPoint){
        this.ToumaPoint = ToumaPoint;
        this.AkaminePoint = AkaminePoint;
        this.WadaPoint = WadaPoint;
    }

    int getTouma(){
        return ToumaPoint;
    }

    int getAkamine(){
        return AkaminePoint;
    }

    int getWada(){
        return WadaPoint;
    }
}
