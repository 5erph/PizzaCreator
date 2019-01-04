//CASEY LORIA
package com.dkg.casey.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBar;
    public TextView pizzaSize;
    public TextView cost;
    public double totalCost, deliveryCost, toppingCost, sizeCost;
    public RadioGroup rg;
    public CheckBox top1,top2,top3,top4;
    public double pTop1, pTop2, pTop3,pTop4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar)findViewById(R.id.seekBar);
        pizzaSize = (TextView)findViewById(R.id.textView5);
        cost = (TextView)findViewById(R.id.textView4);
        rg = (RadioGroup) findViewById(R.id.radioGroup2);
        top1 = (CheckBox) findViewById(R.id.checkBox);
        top2 = (CheckBox) findViewById(R.id.checkBox2);
        top3 = (CheckBox) findViewById(R.id.checkBox3);
        top4 = (CheckBox) findViewById(R.id.checkBox4);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean user)
            {


                pizzaSize.setText(String.valueOf(progress) + " in.");
                sizeCost = progress;
                toppingCost = pTop1 +pTop2 +pTop3 + pTop4;

                totalCost = (sizeCost * 0.05) + deliveryCost + toppingCost;

                cost.setText("Cost: " + String.valueOf(totalCost));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


           rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
               @Override
               public void onCheckedChanged(RadioGroup radioGroup, int i) {
                   RadioButton rb = (RadioButton)findViewById(R.id.radioButton9);
                   if(rb.isChecked())
                   {
                       deliveryCost = 3.0;
                       toppingCost = pTop1 +pTop2 +pTop3 + pTop4;
                       totalCost = (sizeCost * 0.05) + deliveryCost + toppingCost;

                       cost.setText("Cost: " + String.valueOf(totalCost));
                   }
                   else {
                       deliveryCost = 0;
                       toppingCost = pTop1 +pTop2 +pTop3 + pTop4;
                       totalCost = (sizeCost * 0.05) + deliveryCost + toppingCost;

                       cost.setText("Cost: " + String.valueOf(totalCost));
                   }
               }
           });

            top1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if(top1.isChecked())
                    {
                        pTop1 = 0.05 * sizeCost;
                        toppingCost = pTop1 +pTop2 +pTop3 + pTop4;
                        totalCost = (sizeCost * 0.05) + deliveryCost + toppingCost;

                        cost.setText("Cost: " + String.valueOf(totalCost));
                    }
                    else {
                        pTop1 = 0;
                        toppingCost = pTop1 +pTop2 +pTop3 + pTop4;
                        totalCost = (sizeCost * 0.05) + deliveryCost + toppingCost;

                        cost.setText("Cost: " + String.valueOf(totalCost));
                    }
                }
            });
        top2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(top2.isChecked())
                {
                    pTop2 = 0.05 * sizeCost;
                    toppingCost = pTop1 +pTop2 +pTop3 + pTop4;
                    totalCost = (sizeCost * 0.05) + deliveryCost + toppingCost;

                    cost.setText("Cost: " + String.valueOf(totalCost));
                }
                else {
                    pTop2 = 0;
                    toppingCost = pTop1 +pTop2 +pTop3 + pTop4;
                    totalCost = (sizeCost * 0.05) + deliveryCost + toppingCost;

                    cost.setText("Cost: " + String.valueOf(totalCost));
                }
            }
        });

        top3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(top3.isChecked())
                {
                    pTop3 = 0.05 * sizeCost;
                    toppingCost = pTop1 +pTop2 +pTop3 + pTop4;
                    totalCost = (sizeCost * 0.05) + deliveryCost + toppingCost;

                    cost.setText("Cost: " + String.valueOf(totalCost));
                }
                else {
                    pTop3 = 0;
                    toppingCost = pTop1 +pTop2 +pTop3 + pTop4;
                    totalCost = (sizeCost * 0.05) + deliveryCost + toppingCost;

                    cost.setText("Cost: " + String.valueOf(totalCost));
                }
            }
        });

        top4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(top4.isChecked())
                {
                    pTop4 = 0.05 * sizeCost;
                    toppingCost = pTop4 +pTop2 +pTop3 + pTop4;
                    totalCost = (sizeCost * 0.05) + deliveryCost + toppingCost;

                    cost.setText("Cost: " + String.valueOf(totalCost));
                }
                else {
                    pTop4 = 0;
                    toppingCost = pTop4 +pTop2 +pTop3 + pTop4;
                    totalCost = (sizeCost * 0.05) + deliveryCost + toppingCost;

                    cost.setText("Cost: " + String.valueOf(totalCost));
                }
            }
        });
    }

}
