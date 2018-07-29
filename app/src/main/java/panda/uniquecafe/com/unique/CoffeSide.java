package panda.uniquecafe.com.unique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CoffeSide extends AppCompatActivity {
    ExpandableListView listView;
    ExpandableListAdapter listAdapter;
    List<String> listHeader;
    HashMap<String,List<String>> listHashMap;
    Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffe_side);
        setContentView(R.layout.activity_coffe_side);
        listView=(ExpandableListView)findViewById(R.id.ExpList);
        fillData();
        listAdapter=new ExpandableListAdapter(CoffeSide.this,listHeader,listHashMap);
        listView.setAdapter(listAdapter);







    }

    private void fillData() {
        listHeader=new ArrayList<>();
        listHashMap=new HashMap<>();


        listHeader.add("Hot Drinks");
        listHeader.add("Cold Drinks");
        listHeader.add("Cocktails");
        listHeader.add("Smoothies");
        listHeader.add("Smoking Side");

        List<String> HOTDRINKS=new ArrayList<>();
        HOTDRINKS.add("Espresso  15.99 EGP");
        HOTDRINKS.add("Espresso Double  19.99 EGP");
        HOTDRINKS.add("Espresso Macchiato 18.99 EGP ");
        HOTDRINKS.add("Espresso Macchiato Double  22.99 EGP");
        HOTDRINKS.add("Turkish Coffee (Plain or Velled) 11.99 EGP ");
        HOTDRINKS.add("Turkish Coffee Double (Plain or Velled) 14.99 EGP");
        HOTDRINKS.add("Hazelnut Coffee 17.99 EGP");
        HOTDRINKS.add("French Coffee  17.99 EGP");
        HOTDRINKS.add("Cappuccino 21.99 EGP");
        HOTDRINKS.add("Hot Chocolate 21.99 EGP ");
        HOTDRINKS.add("American Coffee 21.99 EGP");
        HOTDRINKS.add("Nescafe  21.99 EGP");
        HOTDRINKS.add("Hot Seder  19.99 EGP");
        HOTDRINKS.add("Classic Tea  9.99 EGP");
        HOTDRINKS.add("Tea with Milk  11.99 EGP");
        HOTDRINKS.add("Green Tea 11.99 EGP");
        HOTDRINKS.add("Caramel Tea  11.99 EGP");
        HOTDRINKS.add("Caramel Latte 24.99 EGP");
        HOTDRINKS.add("Coffee Latte 24.99 EGP ");
        HOTDRINKS.add("Mocha latte 24.99 EGP");
        HOTDRINKS.add("Orchid with Nuts 27.99 EGP");
        HOTDRINKS.add("Orchid with Fruit  31.99.99 EGP");
        HOTDRINKS.add("White Chocolate Latte  31.99 EGP");




        List<String> COLDDRINKS=new ArrayList<>();
        COLDDRINKS.add("Mango  24.99 EGP");
        COLDDRINKS.add("Strawberries  24.99 EGP");
        COLDDRINKS.add("Guava   21.99 EGP");
        COLDDRINKS.add("Orange   19.99 EGP");
        COLDDRINKS.add("Lemon  17.99");
        COLDDRINKS.add("Lemon With Mint   19.99 EGP");
        COLDDRINKS.add("Banana  21.99 EGP ");
        COLDDRINKS.add("Watermelon  24.99 EGP");
        COLDDRINKS.add("Pomegranate   24.99 EGP");
        COLDDRINKS.add("Kiwi    24.99 EGP");
        COLDDRINKS.add("Pepsi,7Up , Miranda  11.99 EGP");
        COLDDRINKS.add("Schweppes Gold   14.99 EGP");
        COLDDRINKS.add("Birell  14.99 EGP ");
        COLDDRINKS.add("Red Bull   29.99 EGP");
        COLDDRINKS.add("Small Mineral Water  5.99 EGP");
        COLDDRINKS.add("Large Mineral Water  9.99 EGP");


        List<String> COKTAILS=new ArrayList<>();
        COKTAILS.add("Florida  27.99 EGP");
        COKTAILS.add("Hawai  27.99 EGP ");
        COKTAILS.add("Four Seasons Fruit  31.99 EGP");
        COKTAILS.add("Classic Yogurt  21.99 EGP ");
        COKTAILS.add("Honey Yogurt  24.99 EGP");
        COKTAILS.add("Fruit Yogurt  29.99 EGP");
        COKTAILS.add("Fruit Cocktail 34.99 EGP ");
        COKTAILS.add("Fruit MilkShake  34.99 EGP");
        COKTAILS.add("Chocolate MilkShake 37.99 EGP");
        COKTAILS.add("Oreo Shake 37.99 EGP");







        List<String> SMOOTHIES=new ArrayList<>();
        SMOOTHIES.add("Strawberries  28.99 EGP");
        SMOOTHIES.add("Mango  28.99 EGP");
        SMOOTHIES.add("Peach  28.99 EGP");
        SMOOTHIES.add("Watermelon  28.99 EGP");
        SMOOTHIES.add("BlueBerry  31.99 EGP");
        SMOOTHIES.add("RedBerry 31.99 EGP");
        SMOOTHIES.add("Mixed Berries  31.99 EGP");
        SMOOTHIES.add("Lemon 28.99 EGP");
        SMOOTHIES.add("Leon With Mint 28.99 EGP");
        SMOOTHIES.add("Kiwi  31.99 EGP");
        SMOOTHIES.add("Coconut  28.9 EGP");
        SMOOTHIES.add("Strobe Pina Colada  34.99 EGP");
        SMOOTHIES.add("Caribbean Smoothie   34.99 EGP");
        SMOOTHIES.add("Salino  Smoothie  34.99 EGP");
        SMOOTHIES.add("Coda  Smoothie  34.99 EGP");
        SMOOTHIES.add("Santro  Smoothie  34.99 EGP");
        SMOOTHIES.add("Yamaha  Smoothie  34.99 EGP");













        List<String> SMOKINGSIDE=new ArrayList<>();
        SMOKINGSIDE.add("Shisha Massel   7.99 EGP");
        SMOKINGSIDE.add("Fruit Fakher   39.99 EGP");
        SMOKINGSIDE.add("Special Mixes   44.99 EGP");
        SMOKINGSIDE.add("Lai   5.99 EGP");
        SMOKINGSIDE.add("Lai With Ice  11.99 EGP");

        listHashMap.put(listHeader.get(0),HOTDRINKS);
        listHashMap.put(listHeader.get(1),COLDDRINKS);
        listHashMap.put(listHeader.get(2),COKTAILS);
        listHashMap.put(listHeader.get(3),SMOOTHIES);
        listHashMap.put(listHeader.get(4),SMOKINGSIDE);




    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent home=new Intent(CoffeSide.this,MainActivity.class);
        startActivity(home);
        finish();
    }
}
