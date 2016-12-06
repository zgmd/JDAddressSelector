package com.jack.jdaddressselector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements OnAddressSelectedListener {

    private EditText et_address;
    BottomDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_address = (EditText) findViewById(R.id.et_address);
    }

    public void openSelectorAddressWindow(View v) {
        if(dialog == null){
            dialog = new BottomDialog(MainActivity.this);
            dialog.setOnAddressSelectedListener(this);
        }
        dialog.show();
    }

    @Override
    public void onAddressSelected(Area province, Area city, Area county) {
        if(dialog != null){
            dialog.dismiss();
        }
        et_address.setText(province.getName() + city.getName() + county.getName());
    }
}
