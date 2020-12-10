package com.b2b.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LevelOne {
    public int number1;
    public  int number2;
    public String OnedecimalSum() {
         number1 = (int) (Math.random() * 9 + 1);
         number2 = (int) (Math.random() * 9 + 1);

         if (number1==1 || number2 ==1){
        return number1 +" + "+ number2 + " = ?";
    }
         return "try again";
    }

    public List<String> getAnswer(){

        String opton1 = ""+(number1 + (int) (Math.random() * 9 + 1));
        String opton2 = ""+(number1 + (int) (Math.random() * 7 + 1));
        String opton3 = ""+(number1 + (int) (Math.random() * 4 + 1));
        String opton4 = ""+(number1 + number2);

        List<String> answers = new ArrayList<>();
        answers.add(opton1);
        answers.add(opton2);
        answers.add(opton3);
        answers.add(opton4);

        Collections.shuffle(answers);



      return answers;

    }

}
