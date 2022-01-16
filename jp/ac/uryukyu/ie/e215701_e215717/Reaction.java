package jp.ac.uryukyu.ie.e215701_e215717;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Reaction extends JudgePerson{
    public static void main(String[] args) {
        String bigQuestion[] = {"学生の投稿にリプをする？：", "ご飯の写真をよく投稿している？：", "講義動画を録画している？：", "Mattermostのアイコンがデンチュウ？：", "講義中にドラクエの話をする？：", "年次懇談会を開く？：", "火に関連している？：", "教授である？：", "海外の大学院を卒業している？："};
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0 ; i < 9 ; i++) { //1～10の整数値を持つリストを用意
                list.add(i);
            }
        Collections.shuffle(list);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("あなたの名前は？：");
            String name = scanner.next();
            System.out.println("いい名前だね！");
            System.out.println("當間先生と赤嶺先生と和田先生の３人の誰かを思い浮かべながら質問に答えてね！");
            System.out.println("'はい'と思ったら1、'違う'と思ったら２を答える");
  
            for(Integer l : list) {
                System.out.println(l);
                System.out.print(bigQuestion[l]);
                int i = scanner.nextInt();
                if (l >=0 && l <= 2){
                    if (i == 1){
                        Touma += 1; //変数に１を足す
                    }else {
                        continue;
                    }

                }else if (l >=3 && l <= 5){
                    if (i == 1){
                        Akamine += 1; //変数に１を足す
                    }else {
                        continue;
                    }

                }else if (l >= 6 && l <= 8){
                    if (i == 1){
                        Wada += 1; //変数に１を足す
                    }else {
                        continue;
                    }
                }
            }
            JudgePerson.Judge(name);
        }
        
    }
}