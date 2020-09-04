package com.example.budgetcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText mIncome_1;
    private EditText mIncome_2;
    private EditText mExpense_1;
    private EditText mExpense_2;
    private EditText mExpense_3;
    private EditText mExpense_4;
    private TextView mIncome_Total;
    private TextView mExpense_Total;
    private TextView mFinal_Total;
    Button mCalculate_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mIncome_1 = findViewById(R.id.Income_1);
        mIncome_2 = findViewById(R.id.Income_2);
        mExpense_1 = findViewById(R.id.Expense_1);
        mExpense_2 = findViewById(R.id.Expense_2);
        mExpense_3 = findViewById(R.id.Expense_3);
        mExpense_4 = findViewById(R.id.Expense_4);
        mIncome_Total = findViewById(R.id.Income_Total);
        mExpense_Total = findViewById(R.id.Expense_Total);
        mFinal_Total = findViewById(R.id.Final_Total);
        mCalculate_Button = (Button) findViewById(R.id.Calculate_Button);

        mCalculate_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mIncome_1.getText().toString().length() == 0) {
                    mIncome_1.setText("0");
                }
                if (mIncome_2.getText().toString().length() == 0) {
                    mIncome_2.setText("0");
                }
                int Inc1 = Integer.parseInt(mIncome_1.getText().toString());
                int Inc2 = Integer.parseInt(mIncome_2.getText().toString());
                int Exp1 = Integer.parseInt(mExpense_1.getText().toString());
                int Exp2 = Integer.parseInt(mExpense_2.getText().toString());
                int Exp3 = Integer.parseInt(mExpense_3.getText().toString());
                int Exp4 = Integer.parseInt(mExpense_4.getText().toString());
                int incsum = Inc1 + Inc2;
                int expsum = Exp1 + Exp2 + Exp3 + Exp4;
                int finalsum = incsum - expsum;
                mIncome_Total.setText(String.valueOf(incsum));
                mExpense_Total.setText(String.valueOf(expsum));
                mFinal_Total.setText(String.valueOf(finalsum));
            }
        });
    }
}