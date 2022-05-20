package com.example.testpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText etFirstNumber,etSecondNumber;
    TextView Answer;
    Button plus,minus,multiply,divide;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etFirstNumber=findViewById(R.id.etFirstNumber);
        etSecondNumber=findViewById(R.id.etSecondNumber);
        Answer=findViewById(R.id.Answer);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        multiply=findViewById(R.id.multiply);
        divide=findViewById(R.id.divide);

        plus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int firstvalue, secondvalue, answer;
                firstvalue=Integer.parseInt( etFirstNumber.getText().toString());
                secondvalue=Integer.parseInt( etSecondNumber.getText().toString());


                answer=firstvalue+secondvalue;

                Answer.setText("answer is"+answer);
            }
        });


        minus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                int firstvalue, secondvalue, answer;
                firstvalue=Integer.parseInt( etFirstNumber.getText().toString());
                secondvalue=Integer.parseInt( etSecondNumber.getText().toString());


                answer=firstvalue-secondvalue;

                Answer.setText("answer is"+answer);
            }
        });


        multiply.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                int firstvalue, secondvalue, answer;
                firstvalue=Integer.parseInt( etFirstNumber.getText().toString());
                secondvalue=Integer.parseInt( etSecondNumber.getText().toString());


                answer=firstvalue*secondvalue;

                Answer.setText("answer is"+answer);
            }
        });


        divide.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                int firstvalue, secondvalue, answer;
                firstvalue=Integer.parseInt( etFirstNumber.getText().toString());
                secondvalue=Integer.parseInt( etSecondNumber.getText().toString());


                answer=firstvalue/secondvalue;

                Answer.setText("answer is"+answer);
            }
        });

    }
}