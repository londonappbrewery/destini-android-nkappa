package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {




    private TextView mStoryTextView;
    private Button mButtonTop;
    private Button mButtonBottom;
    private int mIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mIndex=1;


        mStoryTextView=(TextView)findViewById(R.id.storyTextView);
        mButtonTop=(Button)findViewById(R.id.buttonTop);
        mButtonBottom=(Button)findViewById(R.id.buttonBottom);



        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(mIndex){
                    case 1:
                        mStoryTextView.setText(R.string.T3_Story);
                        mButtonTop.setText(R.string.T3_Ans1);
                        mButtonBottom.setText(R.string.T3_Ans2);
                        mIndex=3;
                        break;
                    case 2:
                        mStoryTextView.setText(R.string.T3_Story);
                        mButtonTop.setText(R.string.T3_Ans1);
                        mButtonBottom.setText(R.string.T3_Ans2);
                        mIndex=3;
                        break;
                    case 3:
                        mStoryTextView.setText(R.string.T6_End);
                        break;

                }
            }
        });



        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(mIndex){
                    case 1:
                        mStoryTextView.setText(R.string.T2_Story);
                        mButtonTop.setText(R.string.T2_Ans1);
                        mButtonBottom.setText(R.string.T2_Ans2);
                        mIndex=2;
                        break;
                    case 2:
                        mStoryTextView.setText(R.string.T4_End);
                        break;
                    case 3:
                        mStoryTextView.setText(R.string.T5_End);
                        break;

                }

            }
        });

    }




}
