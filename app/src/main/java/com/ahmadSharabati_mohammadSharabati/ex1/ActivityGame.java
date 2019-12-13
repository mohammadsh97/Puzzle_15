package com.ahmadSharabati_mohammadSharabati.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.SharedPreferences;

import java.io.IOException;

public class ActivityGame extends AppCompatActivity {
    private Button newG;
    GameBoard gameBoard;
    MediaPlayer mediaPlayer;
    private boolean gameOver = true;
    public TextView mov;
    public TextView textView4;
    public int min,sec,i;
    public Thread t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        TextView arr [] ={(findViewById(R.id.n0)),(findViewById(R.id.n1)),(findViewById(R.id.n2)),(findViewById(R.id.n3)),(findViewById(R.id.n4)),(findViewById(R.id.n5)),(findViewById(R.id.n6)),(findViewById(R.id.n7)),(findViewById(R.id.n8)),(findViewById(R.id.n9)),(findViewById(R.id.n10)),(findViewById(R.id.n11)),(findViewById(R.id.n12)),(findViewById(R.id.n13)),(findViewById(R.id.n14)),(findViewById(R.id.n15))};
        gameBoard =new GameBoard(arr);
        SharedPreferences sp = getSharedPreferences("MyPref", Context.MODE_PRIVATE);
         boolean mu=sp.getBoolean("user",false);
        mediaPlayer=MediaPlayer.create(ActivityGame.this,R.raw.music);

        if (mu==true) {
            playM();
            mediaPlayer.setLooping(true);
        }
        else {
            stop();
        }
        textView4=(TextView)findViewById(R.id.textView4);
        if(gameOver) {
            gameBoard.newGame();
            countDown();
        }
        mov=(TextView)findViewById(R.id.movCount);
        mov.setText(Integer.toString(gameBoard.moves));
        newG = (Button) findViewById(R.id.newG);
        newG.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                i=-1;
                gameBoard.newGame();
                mov.setText(Integer.toString(gameBoard.moves));

            }
        });
        gameBoard.textArr[0] =  findViewById(R.id.n0);
        gameBoard.textArr[0].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gameBoard.clicked(0,gameBoard.textArr[0]);
                mov.setText(Integer.toString(gameBoard.moves));
                gameWon();
            }
        });


        gameBoard.textArr[1] =  findViewById(R.id.n1);
        gameBoard.textArr[1].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gameBoard.clicked(1,gameBoard.textArr[1]);
                mov.setText(Integer.toString(gameBoard.moves));
                gameWon();
            }
        });


        gameBoard.textArr[2] =  findViewById(R.id.n2);
        gameBoard.textArr[2].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gameBoard.clicked(2,gameBoard.textArr[2]);
                mov.setText(Integer.toString(gameBoard.moves));
                gameWon();
            }
        });

        gameBoard.textArr[3] =  findViewById(R.id.n3);
        gameBoard.textArr[3].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gameBoard.clicked(3,gameBoard.textArr[3]);
                mov.setText(Integer.toString(gameBoard.moves));
                gameWon();
            }
        });




        gameBoard.textArr[4] =  findViewById(R.id.n4);
        gameBoard.textArr[4].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gameBoard.clicked(4,gameBoard.textArr[4]);
                mov.setText(Integer.toString(gameBoard.moves));
                gameWon();
            }
        });



        gameBoard.textArr[5] =  findViewById(R.id.n5);
        gameBoard.textArr[5].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gameBoard.clicked(5,gameBoard.textArr[5]);
                mov.setText(Integer.toString(gameBoard.moves));
                gameWon();
            }
        });


        gameBoard.textArr[6] =  findViewById(R.id.n6);
        gameBoard.textArr[6].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gameBoard.clicked(6,gameBoard.textArr[6]);
                mov.setText(Integer.toString(gameBoard.moves));
                gameWon();
            }
        });


        gameBoard.textArr[7] =  findViewById(R.id.n7);
        gameBoard.textArr[7].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gameBoard.clicked(7,gameBoard.textArr[7]);
                mov.setText(Integer.toString(gameBoard.moves));
                gameWon();
            }
        });



        gameBoard.textArr[8] =  findViewById(R.id.n8);
        gameBoard.textArr[8].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gameBoard.clicked(8,gameBoard.textArr[8]);
                mov.setText(Integer.toString(gameBoard.moves));
                gameWon();
            }
        });
        gameBoard.textArr[9] =  findViewById(R.id.n9);
        gameBoard.textArr[9].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gameBoard.clicked(9,gameBoard.textArr[9]);
                mov.setText(Integer.toString(gameBoard.moves));
                gameWon();
            }
        });


        gameBoard.textArr[10] =  findViewById(R.id.n10);
        gameBoard.textArr[10].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gameBoard.clicked(10,gameBoard.textArr[10]);
                mov.setText(Integer.toString(gameBoard.moves));
                gameWon();
            }
        });


        gameBoard.textArr[11] =  findViewById(R.id.n11);
        gameBoard.textArr[11].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gameBoard.clicked(11,gameBoard.textArr[11]);
                mov.setText(Integer.toString(gameBoard.moves));
                gameWon();
            }
        });



        gameBoard.textArr[12] =  findViewById(R.id.n12);
        gameBoard.textArr[12].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gameBoard.clicked(12,gameBoard.textArr[12]);
                mov.setText(Integer.toString(gameBoard.moves));
                gameWon();
            }
        });
        gameBoard.textArr[13] =  findViewById(R.id.n13);
        gameBoard.textArr[13].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gameBoard.clicked(13,gameBoard.textArr[13]);
                mov.setText(Integer.toString(gameBoard.moves));
                gameWon();
            }
        });


        gameBoard.textArr[14] =  findViewById(R.id.n14);
        gameBoard.textArr[14].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gameBoard.clicked(14,gameBoard.textArr[14]);
                mov.setText(Integer.toString(gameBoard.moves));
                gameWon();
            }
        });


        gameBoard.textArr[15] =  findViewById(R.id.n15);
        gameBoard.textArr[15].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gameBoard.clicked(15,gameBoard.textArr[15]);
                mov.setText(Integer.toString(gameBoard.moves));
                gameWon();
            }
        });

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        mediaPlayer.reset();

    }
    public void playM() {

        mediaPlayer.start();

    }

    public void stop() {
        mediaPlayer.pause();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.reset();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mediaPlayer.reset();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.reset();

    }

    @Override
    protected void onResume() {
        super.onResume();
if(mediaPlayer==null)
    mediaPlayer=  mediaPlayer=MediaPlayer.create(ActivityGame.this,R.raw.music);
        mediaPlayer.start();

   }
   public void gameWon(){
        if(gameBoard.win) {
            Toast.makeText(getApplicationContext(), "!Solved Puzzle - Over Game", Toast.LENGTH_LONG).show();
            for (int i = 0; i < 16; i++)
                gameBoard.textArr[i].setClickable(false);
        }
        gameBoard.win=false;

    }

    private void countDown(){
        min=0;
        sec=0;
        t = new Thread(){
            @Override
            public void run() {
                while (!gameBoard.gameOver){
                    i++;
                    min = i / 60;
                    sec=i%60;
                    runOnUiThread(new Runnable()
                    {
                        @Override
                        public void run(){
                            String asText =  String.format("%02d", min) + ":" +  String.format("%02d", sec);
                            textView4.setText(asText);
                        }
                    });
                    SystemClock.sleep(1000);
                    // sleep for 1000ms = 1sec
                }
            }
        };
        t.start();
    }
}
