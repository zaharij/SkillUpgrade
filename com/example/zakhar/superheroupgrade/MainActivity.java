package com.example.zakhar.superheroupgrade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import static com.example.zakhar.superheroupgrade.Constants.*;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private CheckBox checkBox;
    private Button replenishButton;
    private Button upgradeButton;
    private EditText editTextNumber;
    private Spinner spinner;
    private SuperHero superHero = new SuperHero();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        textView = (TextView) findViewById(R.id.textView);
        replenishButton = (Button) findViewById(R.id.replenishButton);
        upgradeButton = (Button) findViewById(R.id.upgradeButton);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        spinner = (Spinner) findViewById(R.id.spinner);
    }

    /**
     * on click updates hero's skill level
     * @param view
     */
    public void clickUpgradeButton(View view){
        if (checkBox.isChecked()){
            textView.setText(AUTOUPGR_WORN);
        }else {
            textView.setText(superHero.upgradeLevel());
        }
    }

    /**
     * on click replenishes hero's account
     * @param view
     */
    public void clickReplenishButton(View view){
        if (TextUtils.isEmpty(editTextNumber.getText())){
            textView.setText(PUT_MONEY);
        }else {
            superHero.setAccount(Double.parseDouble(editTextNumber.getText().toString()));
            editTextNumber.setText(null);
            if (checkBox.isChecked()){
                clickUpgradeButton(view);
            }
            textView.setText(REPLENISH_SUCC + superHero.getAccount());
        }
    }

    public void clickDamageButton(View view){
        textView.setText("" + superHero.getDamage(spinner.getSelectedItem().toString()));
    }
}
