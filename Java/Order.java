package com.androidexample.friends;

/**
 * Created by shivu on 22-03-2018.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;


public class Order extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.active);
        initSwipePager();

    }

    private void initSwipePager(){
        VerticalViewPager verticalViewPager =  findViewById(R.id.vPager);
        verticalViewPager.setAdapter(new VerticlePagerAdapter(this));
    }

    public void buy(View view)
    {

        Intent intent = new Intent(this,topping.class);
          startActivity(intent);

    }


}