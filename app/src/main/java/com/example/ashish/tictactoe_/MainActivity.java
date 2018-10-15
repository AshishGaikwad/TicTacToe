package com.example.ashish.tictactoe_;

import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btOne,btTwo,btThree,btFour,btFive,btSix,btSeven,btEight,btNine;
    private int check = 0 ;

    private TextView twPlayer1, twPlayer2, twRound;
    private Button btClear;

    private int p1 = 0 , p2 = 0, r = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btOne =(Button)findViewById(R.id.btOne);
        btTwo =(Button)findViewById(R.id.btTwo);
        btThree =(Button)findViewById(R.id.btThree);
        btFour =(Button)findViewById(R.id.btFour);
        btFive =(Button)findViewById(R.id.btFive);
        btSix =(Button)findViewById(R.id.btSix);
        btSeven =(Button)findViewById(R.id.btSeven);
        btEight =(Button)findViewById(R.id.btEight);
        btNine =(Button)findViewById(R.id.btNine);


        twPlayer1 = (TextView) findViewById(R.id.twPlayer1);
        twPlayer2 = (TextView) findViewById(R.id.twPlayer2);
        twRound = (TextView) findViewById(R.id.twRound);

        btClear = (Button) findViewById(R.id.btClear);



        btOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btOne.getText().toString().equals(""))
                {
                    if(check == 0)
                    {
                        btOne.setText("X");
                        check = 1;
                        checkX();
                    }
                    else
                    {
                        btOne.setText("O");
                        check = 0;
                        checkY();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();

                }
            }
        });

        btTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btTwo.getText().toString().equals(""))
                {
                    if(check == 0)
                    {
                        btTwo.setText("X");
                        check = 1;
                        checkX();
                    }
                    else
                    {
                        btTwo.setText("O");
                        check = 0;
                        checkY();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();

                }
            }
        });

        btThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btThree.getText().toString().equals(""))
                {
                    if(check == 0)
                    {
                        btThree.setText("X");
                        check = 1;
                        checkX();
                    }
                    else
                    {
                        btThree.setText("O");
                        check = 0;
                        checkY();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();

                }
            }
        });

        btFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btFour.getText().toString().equals(""))
                {
                    if(check == 0)
                    {
                        btFour.setText("X");
                        check = 1;
                        checkX();
                    }
                    else
                    {
                        btFour.setText("O");
                        check = 0;
                        checkY();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();

                }
            }
        });

        btFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btFive.getText().toString().equals(""))
                {
                    if(check == 0)
                    {
                        btFive.setText("X");
                        check = 1;
                        checkX();
                    }
                    else
                    {
                        btFive.setText("O");
                        check = 0;
                        checkY();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();

                }
            }
        });

        btSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btSix.getText().toString().equals(""))
                {
                    if(check == 0)
                    {
                        btSix.setText("X");
                        check = 1;
                        checkX();
                    }
                    else
                    {
                        btSix.setText("O");
                        check = 0;
                        checkY();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();

                }
            }
        });

        btSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btSeven.getText().toString().equals(""))
                {
                    if(check == 0)
                    {
                        btSeven.setText("X");
                        check = 1;
                        checkX();
                    }
                    else
                    {
                        btSeven.setText("O");
                        check = 0;
                        checkY();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();

                }
            }
        });

        btEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btEight.getText().toString().equals(""))
                {
                    if(check == 0)
                    {
                        btEight.setText("X");
                        check = 1;
                        checkX();
                    }
                    else
                    {
                        btEight.setText("O");
                        check = 0;
                        checkY();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();

                }
            }
        });

        btNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btNine.getText().toString().equals(""))
                {
                    if(check == 0)
                    {
                        btNine.setText("X");
                        check = 1;
                        checkX();
                    }
                    else
                    {
                        btNine.setText("O");
                        check = 0;
                        checkY();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();

                }
            }
        });

        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btOne.setText("");
                btTwo.setText("");
                btThree.setText("");
                btFour.setText("");
                btFive.setText("");
                btSix.setText("");
                btSeven.setText("");
                btEight.setText("");
                btNine.setText("");


                btOne.setEnabled(true);
                btTwo.setEnabled(true);
                btThree.setEnabled(true);
                btFour.setEnabled(true);
                btFive.setEnabled(true);
                btSix.setEnabled(true);
                btSeven.setEnabled(true);
                btEight.setEnabled(true);
                btNine.setEnabled(true);


                btOne.setTextColor(Color.BLACK);
                btTwo.setTextColor(Color.BLACK);
                btThree.setTextColor(Color.BLACK);
                btFour.setTextColor(Color.BLACK);
                btFive.setTextColor(Color.BLACK);
                btSix.setTextColor(Color.BLACK);
                btSeven.setTextColor(Color.BLACK);
                btEight.setTextColor(Color.BLACK);
                btNine.setTextColor(Color.BLACK);


                btOne.setPaintFlags(btOne.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                btTwo.setPaintFlags(btOne.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                btThree.setPaintFlags(btOne.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                btFour.setPaintFlags(btOne.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                btFive.setPaintFlags(btOne.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                btSix.setPaintFlags(btOne.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                btSeven.setPaintFlags(btOne.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                btEight.setPaintFlags(btOne.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                btNine.setPaintFlags(btOne.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));

            }
        });
    }




    public void checkX()
    {
        if(btOne.getText().toString() == "X"  && btTwo.getText().toString() =="X" && btThree.getText().toString() =="X")
        {
            btOne.setPaintFlags(btOne.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btOne.setTextColor(Color.RED);

            btTwo.setPaintFlags(btTwo.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btTwo.setTextColor(Color.RED);

            btThree.setPaintFlags(btThree.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btThree.setTextColor(Color.RED);


            btFour.setEnabled(false);
            btFive.setEnabled(false);
            btSix.setEnabled(false);


            btSeven.setEnabled(false);
            btEight.setEnabled(false);
            btNine.setEnabled(false);
            check = 0;

            p1++;
            r++;

            twPlayer1.setText("Player One : " + String.valueOf(p1));
            twRound.setText(String.valueOf(r));

        }

        else if (btFour.getText().toString() == "X"  && btFive.getText().toString() =="X" && btSix.getText().toString() =="X")
        {
            btFour.setPaintFlags(btFour.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btFour.setTextColor(Color.RED);

            btFive.setPaintFlags(btFive.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btFive.setTextColor(Color.RED);

            btSix.setPaintFlags(btSix.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btSix.setTextColor(Color.RED);

            btOne.setEnabled(false);
            btTwo.setEnabled(false);
            btThree.setEnabled(false);


            btSeven.setEnabled(false);
            btEight.setEnabled(false);
            btNine.setEnabled(false);
            check = 0;
            p1++;
            r++;

            twPlayer1.setText("Player One : " + String.valueOf(p1));
            twRound.setText(String.valueOf(r));


        }

        else if (btSeven.getText().toString() == "X"  && btEight.getText().toString() =="X" && btNine.getText().toString() =="X")
        {
            btSeven.setPaintFlags(btSeven.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btSeven.setTextColor(Color.RED);

            btEight.setPaintFlags(btEight.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btEight.setTextColor(Color.RED);

            btNine.setPaintFlags(btNine.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btNine.setTextColor(Color.RED);

            btOne.setEnabled(false);
            btTwo.setEnabled(false);
            btThree.setEnabled(false);


            btFour.setEnabled(false);
            btFive.setEnabled(false);
            btSix.setEnabled(false);
            check = 0;
            p1++;
            r++;

            twPlayer1.setText("Player One : " + String.valueOf(p1));
            twRound.setText(String.valueOf(r));

        }

        else if (btOne.getText().toString() == "X"  && btFive.getText().toString() =="X" && btNine.getText().toString() =="X")
        {
            btOne.setPaintFlags(btOne.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btOne.setTextColor(Color.RED);

            btFive.setPaintFlags(btFive.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btFive.setTextColor(Color.RED);

            btNine.setPaintFlags(btNine.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btNine.setTextColor(Color.RED);


            btTwo.setEnabled(false);
            btThree.setEnabled(false);


            btFour.setEnabled(false);
            btEight.setEnabled(false);
            btSix.setEnabled(false);

            btSeven.setEnabled(false);
            check = 0;
            p1++;
            r++;

            twPlayer1.setText("Player One : " + String.valueOf(p1));
            twRound.setText(String.valueOf(r));


        }

        else if (btThree.getText().toString() == "X"  && btFive.getText().toString() =="X" && btSeven.getText().toString() =="X")
        {
            btThree.setPaintFlags(btThree.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btThree.setTextColor(Color.RED);

            btFive.setPaintFlags(btFive.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btFive.setTextColor(Color.RED);

            btSeven.setPaintFlags(btSeven.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btSeven.setTextColor(Color.RED);

            btOne.setEnabled(false);
            btTwo.setEnabled(false);
            btNine.setEnabled(false);


            btFour.setEnabled(false);
            btEight.setEnabled(false);
            btSix.setEnabled(false);

            btSeven.setEnabled(false);
            check = 0;
            p1++;
            r++;

            twPlayer1.setText("Player One : " + String.valueOf(p1));
            twRound.setText(String.valueOf(r));


        }

        else if (btOne.getText().toString() == "X"  && btFour.getText().toString() =="X" && btSeven.getText().toString() =="X")
        {
            btOne.setPaintFlags(btOne.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btOne.setTextColor(Color.RED);

            btFour.setPaintFlags(btFour.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btFour.setTextColor(Color.RED);

            btSeven.setPaintFlags(btSeven.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btSeven.setTextColor(Color.RED);


            btTwo.setEnabled(false);
            btThree.setEnabled(false);
            btFive.setEnabled(false);
            btSix.setEnabled(false);
            btEight.setEnabled(false);
            btNine.setEnabled(false);
            check = 0;
            p1++;
            r++;

            twPlayer1.setText("Player One : " + String.valueOf(p1));
            twRound.setText(String.valueOf(r));


        }

        else if (btTwo.getText().toString() == "X"  && btFive.getText().toString() =="X" && btEight.getText().toString() =="X")
        {
            btTwo.setPaintFlags(btTwo.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btTwo.setTextColor(Color.RED);

            btFive.setPaintFlags(btFive.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btFive.setTextColor(Color.RED);

            btEight.setPaintFlags(btEight.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btEight.setTextColor(Color.RED);


           btOne.setEnabled(false);
           btFour.setEnabled(false);
           btSeven.setEnabled(false);
            btThree.setEnabled(false);

            btSix.setEnabled(false);

            btNine.setEnabled(false);
            check = 0;
            p1++;
            r++;

            twPlayer1.setText("Player One : " + String.valueOf(p1));
            twRound.setText(String.valueOf(r));


        }


        else if (btThree.getText().toString() == "X"  && btSix.getText().toString() =="X" && btNine.getText().toString() =="X")
        {
            btThree.setPaintFlags(btThree.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btThree.setTextColor(Color.RED);

            btSix.setPaintFlags(btSix.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btSix.setTextColor(Color.RED);

            btNine.setPaintFlags(btNine.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btNine.setTextColor(Color.RED);


            btOne.setEnabled(false);
            btFour.setEnabled(false);
            btSeven.setEnabled(false);
           btTwo.setEnabled(false);
           btFive.setEnabled(false);
           btEight.setEnabled(false);
            check = 0;
            p1++;
            r++;

            twPlayer1.setText("Player One : " + String.valueOf(p1));
            twRound.setText(String.valueOf(r));


        }

    }

    public void checkY()
    {
        if(btOne.getText().toString() == "O"  && btTwo.getText().toString() =="O" && btThree.getText().toString() =="O")
        {
            btOne.setPaintFlags(btOne.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btOne.setTextColor(Color.RED);

            btTwo.setPaintFlags(btTwo.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btTwo.setTextColor(Color.RED);

            btThree.setPaintFlags(btThree.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btThree.setTextColor(Color.RED);


            btFour.setEnabled(false);
            btFive.setEnabled(false);
            btSix.setEnabled(false);


            btSeven.setEnabled(false);
            btEight.setEnabled(false);
            btNine.setEnabled(false);
            check = 1;
            p2++;
            r++;

            twPlayer2.setText( String.valueOf(p2)+" : Player Two ");
            twRound.setText(String.valueOf(r));


        }

        else if (btFour.getText().toString() == "O"  && btFive.getText().toString() =="O" && btSix.getText().toString() =="O")
        {
            btFour.setPaintFlags(btFour.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btFour.setTextColor(Color.RED);

            btFive.setPaintFlags(btFive.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btFive.setTextColor(Color.RED);

            btSix.setPaintFlags(btSix.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btSix.setTextColor(Color.RED);

            btOne.setEnabled(false);
            btTwo.setEnabled(false);
            btThree.setEnabled(false);


            btSeven.setEnabled(false);
            btEight.setEnabled(false);
            btNine.setEnabled(false);
            check = 1;
            p2++;
            r++;

            twPlayer2.setText( String.valueOf(p2)+" : Player Two ");
            twRound.setText(String.valueOf(r));
        }

        else if (btSeven.getText().toString() == "O"  && btEight.getText().toString() =="O" && btNine.getText().toString() =="O")
        {
            btSeven.setPaintFlags(btSeven.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btSeven.setTextColor(Color.RED);

            btEight.setPaintFlags(btEight.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btEight.setTextColor(Color.RED);

            btNine.setPaintFlags(btNine.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btNine.setTextColor(Color.RED);

            btOne.setEnabled(false);
            btTwo.setEnabled(false);
            btThree.setEnabled(false);


            btFour.setEnabled(false);
            btFive.setEnabled(false);
            btSix.setEnabled(false);
            check = 1;
            p2++;
            r++;

            twPlayer2.setText( String.valueOf(p2)+" : Player Two ");
            twRound.setText(String.valueOf(r));

        }

        else if (btOne.getText().toString() == "O"  && btFive.getText().toString() =="O" && btNine.getText().toString() =="O")
        {
            btOne.setPaintFlags(btOne.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btOne.setTextColor(Color.RED);

            btFive.setPaintFlags(btFive.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btFive.setTextColor(Color.RED);

            btNine.setPaintFlags(btNine.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btNine.setTextColor(Color.RED);


            btTwo.setEnabled(false);
            btThree.setEnabled(false);


            btFour.setEnabled(false);
            btEight.setEnabled(false);
            btSix.setEnabled(false);

            btSeven.setEnabled(false);
            check = 1;
            p2++;
            r++;
            twPlayer2.setText( String.valueOf(p2)+" : Player Two ");
            twRound.setText(String.valueOf(r));


        }

        else if (btThree.getText().toString() == "O"  && btFive.getText().toString() =="O" && btSeven.getText().toString() =="O")
        {
            btThree.setPaintFlags(btThree.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btThree.setTextColor(Color.RED);

            btFive.setPaintFlags(btFive.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btFive.setTextColor(Color.RED);

            btSeven.setPaintFlags(btSeven.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btSeven.setTextColor(Color.RED);

            btOne.setEnabled(false);
            btTwo.setEnabled(false);
            btNine.setEnabled(false);


            btFour.setEnabled(false);
            btEight.setEnabled(false);
            btSix.setEnabled(false);

            btSeven.setEnabled(false);
            check = 1;
            p2++;
            r++;

            twPlayer2.setText( String.valueOf(p2)+" : Player Two ");
            twRound.setText(String.valueOf(r));

        }

        else if (btOne.getText().toString() == "O"  && btFour.getText().toString() =="O" && btSeven.getText().toString() =="O")
        {
            btOne.setPaintFlags(btOne.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btOne.setTextColor(Color.RED);

            btFour.setPaintFlags(btFour.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btFour.setTextColor(Color.RED);

            btSeven.setPaintFlags(btSeven.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btSeven.setTextColor(Color.RED);


            btTwo.setEnabled(false);
            btThree.setEnabled(false);
            btFive.setEnabled(false);
            btSix.setEnabled(false);
            btEight.setEnabled(false);
            btNine.setEnabled(false);
            check = 1;
            p2++;
            r++;

            twPlayer2.setText( String.valueOf(p2)+" : Player Two ");
            twRound.setText(String.valueOf(r));

        }

        else if (btTwo.getText().toString() == "O"  && btFive.getText().toString() =="O" && btEight.getText().toString() =="O")
        {
            btTwo.setPaintFlags(btTwo.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btTwo.setTextColor(Color.RED);

            btFive.setPaintFlags(btFive.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btFive.setTextColor(Color.RED);

            btEight.setPaintFlags(btEight.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btEight.setTextColor(Color.RED);


            btOne.setEnabled(false);
            btFour.setEnabled(false);
            btSeven.setEnabled(false);
            btThree.setEnabled(false);

            btSix.setEnabled(false);

            btNine.setEnabled(false);
            check = 1;
            p2++;
            r++;

            twPlayer2.setText( String.valueOf(p2)+" : Player Two ");
            twRound.setText(String.valueOf(r));

        }


        else if (btThree.getText().toString() == "O"  && btSix.getText().toString() =="O" && btNine.getText().toString() =="O")
        {
            btThree.setPaintFlags(btThree.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btThree.setTextColor(Color.RED);

            btSix.setPaintFlags(btSix.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btSix.setTextColor(Color.RED);

            btNine.setPaintFlags(btNine.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            btNine.setTextColor(Color.RED);


            btOne.setEnabled(false);
            btFour.setEnabled(false);
            btSeven.setEnabled(false);
            btTwo.setEnabled(false);
            btFive.setEnabled(false);
            btEight.setEnabled(false);
            check = 1;

            p2++;
            r++;

            twPlayer2.setText( String.valueOf(p2)+" : Player Two ");
            twRound.setText(String.valueOf(r));
        }
    }
}
