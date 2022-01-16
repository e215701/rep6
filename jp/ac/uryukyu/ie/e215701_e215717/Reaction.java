package jp.ac.uryukyu.ie.e215701_e215717;
import java.util.Scanner;

public class Reaction {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("あなたの名前は？：");
            String name = scanner.next();
            System.out.println("いい名前だね！");
            System.out.println("當間先生と赤嶺先生と和田先生の３人の誰かを思い浮かべながら質問に答えてね！");
            System.out.println("'はい'と思ったら1、'違う'と思ったら２を答える");

            System.out.print("質問1");
            int age1 = scanner.nextInt();
            if (age1 == 1){
                //変数に１を足す
            }else if (age1 == 2){
                //変数に１を足す
            }else if (age1 == 3){
                //変数に１を足す
            }else{
                //もう一度質問を繰り返す
            }

            System.out.print("質問２");
            int age2 = scanner.nextInt();
            if (age2 == 1){
                //変数に１を足す
            }else if (age2 == 2){
                //変数に１を足す
            }else if (age2 == 3){
                //変数に１を足す
            }else{
                //もう一度質問を繰り返す
            }

            System.out.print("質問3");
            int age3 = scanner.nextInt();
            if (age3 == 1){
                //変数に１を足す
            }else if (age3 == 2){
                //変数に１を足す
            }else if (age3 == 3){
                //変数に１を足す
            }else{
                //もう一度質問を繰り返す
            }

        }
    }
}
