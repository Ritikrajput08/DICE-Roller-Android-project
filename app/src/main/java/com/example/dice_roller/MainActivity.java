package com.example.dice_roller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView diceImageView;
    private Button rollButton;
    private Random random;

    // Array of dice faces
    private int[] diceFaces = {
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_4,
            R.drawable.img_5,
            R.drawable.img_6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceImageView = findViewById(R.id.diceImageView);
        rollButton = findViewById(R.id.rollButton);
        random = new Random();

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int randomDiceFace = random.nextInt(6);
                diceImageView.setImageResource(diceFaces[randomDiceFace]);
            }
        });
    }
}