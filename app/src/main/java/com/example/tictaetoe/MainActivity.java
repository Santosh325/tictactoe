package com.example.tictaetoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    boolean player1 = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findidofbutton();
        buttonlistener();
    }
    private void findidofbutton() {
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
    }
    void buttonclick(Button btext) {
        if(btext.getText().toString().equals("")) {
            if(player1) {
                player1 = false;
                btext.setText("X");
                endGame("X");
            } else {
                player1 = true;
                btext.setText("0");
                endGame("0");
            }
        }
    }

    private void buttonlistener() {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonclick(b1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonclick(b2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonclick(b3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonclick(b4);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonclick(b5);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonclick(b6);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonclick(b7);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonclick(b8);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonclick(b9);
            }
        });
    }
    public void endGame(String text) {
        String a,b,c,d,e,f,g,h,i;
        boolean end = false;
        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();

        if(a==text && b==text && c==text) {
            winx(text);
            end = true;
        }
        if(a==text && e==text && i==text) {
            winx(text);
            end = true;
        }
        if(a==text && d==text && g==text) {
            winx(text);
            end = true;

        }
        if(b==text&&e==text&&h==text) {
            winx(text);
            end = true;
        }
        if(c==text && f==text &&i==text) {
            winx(text);
            end = true;
        }
        if(c == text && e == text && g==text) {
            winx(text);
            end = true;

        }
        if(d == text && e == text && f==text) {
            winx(text);
            end = true;
        }

        if(g== text && h == text && i == text) {
            winx(text);
            end = true;
        }
        if(end) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);


        }
    }
    public void winx(String text) {
        Toast.makeText(this,"Winnter Player is" + text, Toast.LENGTH_SHORT).show();
    }


}
