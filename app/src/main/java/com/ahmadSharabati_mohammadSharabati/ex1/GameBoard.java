package com.ahmadSharabati_mohammadSharabati.ex1;



import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.TextView;

import java.util.Random;

    public class GameBoard {
        TextView [] textArr ;
        boolean gameOver;
        public boolean win = false;
        public int moves =0;
        public GameBoard(TextView[] textArr) {
            this.textArr = textArr;
        }
        public void RandomizeArray() {

            Random rgen = new Random();  // Random number generator

            for (int i = 0; i < this.textArr.length; i++) {
                int randomPosition = rgen.nextInt(this.textArr.length);
                swap(this.textArr[i],this.textArr[randomPosition]);
                moves=0;
            }


        }
        public void clicked(int i,TextView t) {

            if(i==0){
                if (this.textArr[12].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[12]);
                if (this.textArr[15].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[15]);

            }
            if(i==1){
                if (this.textArr[2].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[2]);
                if (this.textArr[5].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[5]);
            }
            if(i==2){
                if (this.textArr[1].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[1]);
                if (this.textArr[3].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[3]);
                if (this.textArr[6].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[6]);
            }
            if(i==3){
                if (this.textArr[2].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[2]);
                if (this.textArr[7].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[7]);
                if (this.textArr[4].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[4]);
            }
            if(i==4){
                if (this.textArr[8].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[8]);
                if (this.textArr[3].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[3]);

            }
            if(i==5){
                if (this.textArr[1].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[1]);
                if (this.textArr[9].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[9]);
                if (this.textArr[6].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[6]);
            }
            if(i==6){
                if (this.textArr[2].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[2]);
                if (this.textArr[7].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[7]);
                if (this.textArr[5].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[5]);
                if (this.textArr[10].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[10]);
            }
            if(i==7){
                if (this.textArr[3].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[3]);
                if (this.textArr[6].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[6]);
                if (this.textArr[8].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[8]);
                if (this.textArr[11].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[11]);
            }
            if(i==8){
                if (this.textArr[4].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[4]);
                if (this.textArr[7].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[7]);
                if (this.textArr[12].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[12]);

            }
            if(i==9){
                if (this.textArr[13].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[13]);
                if (this.textArr[5].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[5]);
                if (this.textArr[10].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[10]);
            }
            if(i==10){
                if (this.textArr[9].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[9]);
                if (this.textArr[6].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[6]);
                if (this.textArr[11].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[11]);
                if (this.textArr[14].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[14]);
            }
            if(i==11){
                if (this.textArr[12].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[12]);
                if (this.textArr[7].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[7]);
                if (this.textArr[15].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[15]);
                if (this.textArr[10].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[10]);
            }
            if(i==12){
                if (this.textArr[0].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[0]);
                if (this.textArr[8].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[8]);
                if (this.textArr[11].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[11]);
            }
            if(i==13){
                if (this.textArr[9].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[9]);
                if (this.textArr[14].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[14]);
            }
            if(i==14){
                if (this.textArr[13].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[13]);
                if (this.textArr[15].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[15]);
                if (this.textArr[10].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[10]);
            }
            if(i==15){
                if (this.textArr[14].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[14]);
                if (this.textArr[11].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[11]);
                if (this.textArr[0].getText().toString().equals("0"))
                    swap(this.textArr[i],this.textArr[0]);
            }
            if (this.textArr[0].getText().toString().equals("0")) {
                int count = 0;
                win = false;
                while ( count < 16&&count == Integer.parseInt(this.textArr[count].getText().toString())) {
                    count ++;
                  //  win=false;
                    if(count==15)
                        win=true;
                }
               // win=false;
//                Log.d(TAG, "clicked: you won")




//            Log.d(TAG, "clicked: you won");
                }


        }
        public void swap(TextView one,TextView two){
            String temp = one.getText().toString();
            Drawable d = one.getBackground();
            one.setText(two.getText().toString());
            one.setBackground(two.getBackground());
            two.setText(temp);
            two.setBackground(d);
            moves++;
        }


public boolean isSolvable()
{
    int parity = 0;
    int gridWidth = (int) Math.sqrt(16);
    int row = 0; // the current row we are on
    int blankRow = 0; // the row with the blank tile

    for (int i = 0; i < 16; i++)
    {
        if (i % gridWidth == 0) { // advance to next row
            row++;
        }
        if (Integer.parseInt(textArr[i].getText().toString()) == 0) { // the blank tile
            blankRow = row; // save the row on which encountered
            continue;
        }
        for (int j = i + 1; j < 16; j++)
        {
            if (Integer.parseInt(textArr[i].getText().toString()) > Integer.parseInt(textArr[j].getText().toString()) && Integer.parseInt(textArr[j].getText().toString())!= 0)
            {
                parity++;
            }
        }
    }

    if (gridWidth % 2 == 0) { // even grid
        if (blankRow % 2 == 0) { // blank on odd row; counting from bottom
            return parity % 2 == 0;
        } else { // blank on even row; counting from bottom
            return parity % 2 != 0;
        }
    } else { // odd grid
        return parity % 2 == 0;
    }
}
        public void newGame(){
            for (int i = 0; i < 16; i++)
                textArr[i].setClickable(true);
            do{
                RandomizeArray();
            }while (!isSolvable());
            gameOver = false;
        }

    }


