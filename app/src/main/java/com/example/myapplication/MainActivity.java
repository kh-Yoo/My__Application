package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    TextView present_address_text;
    ImageButton present_address_button;
    ImageButton korean_food_button;
    ImageButton snack_food_button;
    ImageButton cafe_button;
    ImageButton chicken_button;
    ImageButton pizza_button;
    ImageButton fast_food_button;
    ImageButton chinese_food_button;
    ImageButton late_night_meal_button;
    ImageButton lunchbox_button;
    EditText search_text;
    ImageButton search_button;

    private FragmentManager fragmentManager = getSupportFragmentManager();
    private Fragment_Home fragment_home = new Fragment_Home();
    private Fragment_Wish fragment_wish = new Fragment_Wish();
    private Fragment_Mine fragment_mine = new Fragment_Mine();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();

        ImageButton korean_food = (ImageButton) findViewById(R.id.korean_food_button);
        ImageButton snack_food = (ImageButton) findViewById(R.id.snack_food_button);
        ImageButton cafe = (ImageButton) findViewById(R.id.cafe_button);
        ImageButton chicken = (ImageButton) findViewById(R.id.chicken_button);
        ImageButton pizza = (ImageButton) findViewById(R.id.pizza_button);
        ImageButton fast_food = (ImageButton) findViewById(R.id.fast_food_button);
        ImageButton chinese_food = (ImageButton) findViewById(R.id.chinese_food_button);
        ImageButton late_night_food = (ImageButton) findViewById(R.id.late_night_meal_button);
        ImageButton lunchbox = (ImageButton) findViewById(R.id.lunchbox_button);

        korean_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Korean_food.class);
                startActivity(intent);
            }
        });

        snack_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Snack_food.class);
                startActivity(intent);
            }
        });

        cafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Cafe.class);
                startActivity(intent);
            }
        });
        chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Chicken.class);
                startActivity(intent);
            }
        });
        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Pizza.class);
                startActivity(intent);
            }
        });
        fast_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Fast_food.class);
                startActivity(intent);
            }
        });
        chinese_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Chinese_food.class);
                startActivity(intent);
            }
        });
        late_night_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Late_night_food.class);
                startActivity(intent);
            }
        });
        lunchbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Lunchbox.class);
                startActivity(intent);
            }
        });

    }
    class ItemSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener{
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch(menuItem.getItemId())
            {
                case R.id.home_item:
                    transaction.replace(R.id.frameLayout, fragment_home).commitAllowingStateLoss();

                    break;
                case R.id.heart_item:
                    transaction.replace(R.id.frameLayout, fragment_wish).commitAllowingStateLoss();
                    break;
                case R.id.myuser_item:
                    transaction.replace(R.id.frameLayout, fragment_mine).commitAllowingStateLoss();
                    break;
            }
            return true;
        };
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item){
        return super.onContextItemSelected(item);
    }


    public void InitializeView()
    {
        present_address_text = (TextView) findViewById(R.id.present_address_text);
        present_address_button = (ImageButton)findViewById(R.id.present_address_button);
        korean_food_button = (ImageButton)findViewById(R.id.korean_food_button);
        snack_food_button = (ImageButton)findViewById(R.id.snack_food_button);
        cafe_button = (ImageButton)findViewById(R.id.cafe_button);
        chicken_button = (ImageButton)findViewById(R.id.chicken_button);
        pizza_button = (ImageButton)findViewById(R.id.pizza_button);
        fast_food_button = (ImageButton)findViewById(R.id.fast_food_button);
        chinese_food_button = (ImageButton)findViewById(R.id.chinese_food_button);
        late_night_meal_button = (ImageButton)findViewById(R.id.late_night_meal_button);
        lunchbox_button = (ImageButton)findViewById(R.id.lunchbox_button);
        search_text = (EditText) findViewById(R.id.search_text);
        search_button = (ImageButton)findViewById(R.id.search_button);
    }
    public void SetListener() {
        
        present_address_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {

            }
        });

        korean_food_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {

            }
        });

        snack_food_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {

            }
        });

        cafe_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {

            }
        });

        chicken_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {

            }
        });

        pizza_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {

            }
        });

        fast_food_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {

            }
        });

        chinese_food_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {

            }
        });

        late_night_meal_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {

            }
        });

        lunchbox_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {

            }
        });

        search_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {

            }
        });
    }
}