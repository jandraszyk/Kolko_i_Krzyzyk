package com.example.janek.kolkoikrzyzyk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity{

    private Random randTile;
    private int results[]= { 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static final int userOne = 1;
    private static final int userTwo = 2;
    private int currentPlayer = userOne;
    Integer scoreOne = 0;
    Integer scoreTwo = 0;
    TextView score_player_one, score_player_two;
    Button[] bArray;
    private boolean pcMove = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randTile = new Random();
        final Button bt_1 = (Button) findViewById(R.id.bt_one);
        final Button bt_2 = (Button) findViewById(R.id.button2);
        final Button bt_3 = (Button) findViewById(R.id.button3);
        final Button bt_4 = (Button) findViewById(R.id.button4);
        final Button bt_5 = (Button) findViewById(R.id.button5);
        final Button bt_6 = (Button) findViewById(R.id.button6);
        final Button bt_7 = (Button) findViewById(R.id.button7);
        final Button bt_8 = (Button) findViewById(R.id.button8);
        final Button bt_9 = (Button) findViewById(R.id.button9);
        final Button bt_continue = (Button) findViewById(R.id.bt_continue);
        score_player_one = (TextView) findViewById(R.id.txt_score1);
        score_player_two = (TextView) findViewById(R.id.txt_score2);
        bArray = new Button[] { bt_1, bt_2, bt_3, bt_4, bt_5, bt_6, bt_7, bt_8, bt_9};

        bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer == userOne && results[0] == 0) {
                    bt_1.setText(R.string.kolko);
                    results[0] = 1;
                    checkWin();
                    currentPlayer = userTwo;
                    chooseTile();
                }
                else if(currentPlayer == userTwo && results[0] == 0) {
                    bt_1.setText(R.string.krzyzyk);
                    results[0] = 2;
                    checkWin();
                    currentPlayer = userOne;
                    chooseTile();
                }
                else {
                    Toast.makeText(getApplicationContext(),"You can't put that in here",Toast.LENGTH_SHORT).show();
                }
            }
        });

        bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer == userOne && results[1] == 0) {
                    bt_2.setText(R.string.kolko);
                    results[1] = 1; // Zamienic na jakas funkcje update'ujaca
                    checkWin();
                    currentPlayer = userTwo;
                    chooseTile();

                }
                else if (currentPlayer == userTwo && results[1] == 0) {
                    bt_2.setText(R.string.krzyzyk);
                    results[1] = 2;
                    checkWin();
                    currentPlayer = userOne;
                    chooseTile();
                }
                else {
                    Toast.makeText(getApplicationContext(),"You can't put that in here",Toast.LENGTH_SHORT).show();
                }
            }
        });


        bt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer == userOne && results[2] == 0) {
                    bt_3.setText(R.string.kolko);
                    results[2] = 1;
                    checkWin();
                    currentPlayer = userTwo;
                    chooseTile();
                }
                else if (currentPlayer == userTwo   && results[2] == 0) {
                    bt_3.setText(R.string.krzyzyk);
                    results[2] = 2;
                    checkWin();
                    currentPlayer = userOne;
                    chooseTile();
                }
                else {
                    Toast.makeText(getApplicationContext(),"You can't put that in here",Toast.LENGTH_SHORT).show();
                }
            }
        });

        bt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer == userOne && results[3] == 0) {
                    bt_4.setText(R.string.kolko);
                    results[3] = 1;
                    checkWin();
                    currentPlayer = userTwo;
                    chooseTile();
                }
                else if (currentPlayer == userTwo && results[3] == 0){
                    bt_4.setText(R.string.krzyzyk);
                    results[3] = 2;
                    checkWin();
                    currentPlayer = userOne;
                    chooseTile();
                }
                else {
                    Toast.makeText(getApplicationContext(),"You can't put that in here",Toast.LENGTH_SHORT).show();
                }
            }
        });

        bt_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer == userOne && results[4] == 0) {
                    bt_5.setText(R.string.kolko);
                    results[4] = 1;
                    checkWin();
                    currentPlayer = userTwo;
                    chooseTile();
                }
                else if(currentPlayer == userTwo && results[4] == 0) {
                    bt_5.setText(R.string.krzyzyk);
                    results[4] = 2;
                    checkWin();
                    currentPlayer = userOne;
                    chooseTile();
                }
                else {
                    Toast.makeText(getApplicationContext(),"You can't put that in here",Toast.LENGTH_SHORT).show();
                }

            }
        });

        bt_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer == userOne && results[5] == 0) {
                    bt_6.setText(R.string.kolko);
                    results[5] = 1;
                    checkWin();
                    currentPlayer = userTwo;
                    chooseTile();
                }
                else if(currentPlayer == userTwo && results[5] == 0) {
                    bt_6.setText(R.string.krzyzyk);
                    results[5] = 2;
                    checkWin();
                    currentPlayer = userOne;
                    chooseTile();
                }
                else {
                    Toast.makeText(getApplicationContext(),"You can't put that in here",Toast.LENGTH_SHORT).show();
                }
            }
        });

        bt_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer == userOne && results[6] == 0) {
                    bt_7.setText(R.string.kolko);
                    results[6] = 1;
                    checkWin();
                    currentPlayer = userTwo;
                    chooseTile();
                }
                else if(currentPlayer ==userTwo && results[6] == 0){
                    bt_7.setText(R.string.krzyzyk);
                    results[6] = 2;
                    checkWin();
                    currentPlayer = userOne;
                    chooseTile();
                }
                else {
                    Toast.makeText(getApplicationContext(),"You can't put that in here",Toast.LENGTH_SHORT).show();
                }
            }
        });

        bt_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer == userOne && results[7] == 0) {
                    bt_8.setText(R.string.kolko);
                    results[7] = 1;
                    checkWin();
                    currentPlayer = userTwo;
                    chooseTile();
                }
                else if(currentPlayer == userTwo && results[7] == 0){
                    bt_8.setText(R.string.krzyzyk);
                    results[7] = 2;
                    checkWin();
                    currentPlayer = userOne;
                    chooseTile();
                }
                else {
                    Toast.makeText(getApplicationContext(),"You can't put that in here",Toast.LENGTH_SHORT).show();
                }
            }
        });

        bt_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer == userOne && results[8] == 0) {
                    bt_9.setText(R.string.kolko);
                    results[8] = 1;
                    checkWin();
                    currentPlayer = userTwo;
                    chooseTile();
                }
                else if(currentPlayer == userTwo && results[8] == 0){
                    bt_9.setText(R.string.krzyzyk);
                    results[8] = 2;
                    checkWin();
                    currentPlayer = userOne;
                    chooseTile();
                }
                else {
                    Toast.makeText(getApplicationContext(),"You can't put that in here",Toast.LENGTH_SHORT).show();
                }
            }
        });

        bt_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetBoard();
            }
        });

    }

    private void checkWin() {
        int firstRow = 0;
        int secondColumn = 1;
        int firstDiag = 2;
        int secondRow = 3;
        int thirdRow = 6;
        if(results[firstRow] == results[firstRow + 1] && results[firstRow + 1] == results[firstRow + 2]  && results[firstRow] != 0)
        {
            for(int i = 0; i < 3; i++)
                bArray[i].setBackgroundTintList(getResources().getColorStateList(R.color.colorWin));
            Toast.makeText(getApplicationContext(),"Player " + currentPlayer + " won!!",Toast.LENGTH_SHORT).show();
            updateScore(currentPlayer);
        }
        else if(results[secondRow] == results[secondRow + 1] && results[secondRow + 1] == results[secondRow + 2] && results[secondRow] != 0)
        {
            for(int i = 3; i < 6; i++)
                bArray[i].setBackgroundTintList(getResources().getColorStateList(R.color.colorWin));
            Toast.makeText(getApplicationContext(),"Player " + currentPlayer + " won!!",Toast.LENGTH_SHORT).show();
            updateScore(currentPlayer);
        }
        else if(results[thirdRow] == results[thirdRow + 1] && results[thirdRow + 1] == results[thirdRow + 2] && results[thirdRow] != 0)
        {
            for(int i = 6; i < 9; i++)
                bArray[i].setBackgroundTintList(getResources().getColorStateList(R.color.colorWin));
            Toast.makeText(getApplicationContext(),"Player " + currentPlayer + " won!!",Toast.LENGTH_SHORT).show();
            updateScore(currentPlayer);
        }
        else if(results[firstRow] == results[firstRow + 4] && results[firstRow + 4] == results[firstRow + 8] && results[firstRow] != 0)
        {
            for(int i = 0; i < 9; i = i + 4)
                bArray[i].setBackgroundTintList(getResources().getColorStateList(R.color.colorWin));
            Toast.makeText(getApplicationContext(),"Player " + currentPlayer + " won!!",Toast.LENGTH_SHORT).show();
            updateScore(currentPlayer);
        }
        else if(results[firstDiag] == results[firstDiag + 2] && results[firstDiag + 2] == results[firstDiag + 4] && results[firstDiag] != 0)
        {
            for(int i = 2; i < 7; i = i + 2)
                bArray[i].setBackgroundTintList(getResources().getColorStateList(R.color.colorWin));
            Toast.makeText(getApplicationContext(),"Player " + currentPlayer + " won!!",Toast.LENGTH_SHORT).show();
            updateScore(currentPlayer);
        }
        else if(results[firstRow] == results[firstRow + 3] && results[firstRow + 3] == results[firstRow + 6] && results[firstRow] != 0)
        {
            for(int i = 0; i < 7; i = i + 3)
                bArray[i].setBackgroundTintList(getResources().getColorStateList(R.color.colorWin));
            Toast.makeText(getApplicationContext(),"Player " + currentPlayer + " won!!",Toast.LENGTH_SHORT).show();
            updateScore(currentPlayer);
        }
        else if(results[secondColumn] == results[secondColumn + 3] && results[secondColumn + 3] == results[secondColumn + 6] && results[secondColumn] != 0)
        {
            for(int i = 1; i < 9; i = i + 3)
                bArray[i].setBackgroundTintList(getResources().getColorStateList(R.color.colorWin));
            Toast.makeText(getApplicationContext(),"Player " + currentPlayer + " won!!",Toast.LENGTH_SHORT).show();
            updateScore(currentPlayer);
        }
        else if(results[firstDiag] == results[firstDiag + 3] && results[firstDiag + 3] == results[firstDiag + 6] && results[firstDiag] != 0)
        {
            for(int i = 2; i < 9; i = i + 3)
                bArray[i].setBackgroundTintList(getResources().getColorStateList(R.color.colorWin));
            Toast.makeText(getApplicationContext(),"Player " + currentPlayer + " won!!",Toast.LENGTH_SHORT).show();
            updateScore(currentPlayer);
        }

    }

    private void updateScore(int player) {
        for(Button b : bArray) {
            b.setClickable(false);
        }
        if(player == userOne) {
            scoreOne++;
            score_player_one.setText(scoreOne.toString());
        }
        else {
            scoreTwo++;
            score_player_two.setText(scoreTwo.toString());
        }
        if(scoreOne == 5 || scoreTwo == 5)
        {
            Toast.makeText(getApplicationContext(),"GAME OVER",Toast.LENGTH_SHORT).show();
        }
    }
    private void resetBoard() {
        for(Button b : bArray) {
            b.setBackgroundTintList(getResources().getColorStateList(R.color.colorDef));
            b.setText(null);
            b.setClickable(true);
        }
        for(int i = 0; i < results.length; i++) {
            results[i] = 0;
        }
        if(scoreOne == 5 || scoreTwo == 5)
        {
            scoreOne = 0;
            scoreTwo = 0;
            score_player_two.setText(scoreTwo.toString());
            score_player_one.setText(scoreOne.toString());

        }
    }

    private void chooseTile() {
        int chosenTile = randTile.nextInt(9);
        bArray[chosenTile].callOnClick();
    }
}
