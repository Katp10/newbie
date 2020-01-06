package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;
    private TextView mTextView;
    private Button mButton;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView=(ImageView)findViewById(R.id.imageView);
        mTextView=(TextView)findViewById(R.id.fact);
        mButton=(Button)findViewById(R.id.factButton);

        showRandomFact();
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               showRandomFact();
            }
        });

        }
        public void showRandomFact(){
        shuffleFacts();
        mImageView.setImageResource(factArray[0].getmImage());
        mTextView.setText(factArray[0].getmFact());

        }

        facts f01=new facts(R.drawable.bird,"There are about 10000 species of birds worldwide");
        facts f02=new facts(R.drawable.deer, "Most deer are born with white spots but lose them within a year.");
        facts f03=new facts(R.drawable.ducks,"A male duck is called a drake, a female duck a hen, and a baby duck a duckling.");
        facts f04=new facts(R.drawable.lion,"Lions hunt primarily at night");
        facts f05=new facts(R.drawable.penguins,"Penguins can drink sea water");

        facts [] factArray=new facts[]{
                f01, f02, f03, f04, f05

        } ;

        public void shuffleFacts(){
            Collections.shuffle(Arrays.asList(factArray));
        }





    }


