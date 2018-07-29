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

public class ResturantSide extends AppCompatActivity {
    ExpandableListView listView;
    ExpandableListAdapter listAdapter;
    List<String> listHeader;
    HashMap<String,List<String>> listHashMap;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturant_side);
        listView=(ExpandableListView)findViewById(R.id.expList);
        fillInData();
        listAdapter=new ExpandableListAdapter(ResturantSide.this,listHeader,listHashMap);
        listView.setAdapter(listAdapter);






    }

    private void fillInData() {
        listHeader=new ArrayList<>();
        listHashMap= new HashMap<>();

        listHeader.add("Meat Sandwich");
        listHeader.add("Chicken Sandwich");
        listHeader.add("Grills");
        listHeader.add("Pizza");
        listHeader.add("Pasta");
        listHeader.add("Crepe");
        listHeader.add("Salad");
        listHeader.add("Side Dishes");
        listHeader.add("Sweet Crepe");
        listHeader.add("Dessert");









        List<String> MEATSANDWICH=new ArrayList<>();
        MEATSANDWICH.add("Meat Fajita  M:31.99 EGP    L:41.99 EGP");
        MEATSANDWICH.add("Meat Shawarma  M:31.99 EGP    L:38.99 EGP");
        MEATSANDWICH.add("Mexicano  M:31.99 EGP    L:35.99 EGP");
        MEATSANDWICH.add("Hot Dog  M:31.99 EGP    L:36.99 EGP");
        MEATSANDWICH.add("Grilled Kofta  M:29.99 EGP    L:35.99 EGP");
        MEATSANDWICH.add("Kebda Iskandrani  M:24.99 EGP  L:29.99 EGP");
        MEATSANDWICH.add("Hawawshi      L:35.99 EGP");
        MEATSANDWICH.add("Burger  M:24.99 EGP    L:29.99 EGP");
        MEATSANDWICH.add("Chesse Burger  M:26.99 EGP    L:31.99 EGP");
        MEATSANDWICH.add("Egg Burger  M:27.99 EGP    L:32.99 EGP");
        MEATSANDWICH.add("Burger Mix  M:31.99 EGP    L:36.99 EGP");



        List<String> CHICKEN=new ArrayList<>();
        CHICKEN.add("Chicken Pane  M:29.99EGP  L:34.99EGP");
        CHICKEN.add("Chicken Crispy  M:28.99EGP  L:35.99EGP");
        CHICKEN.add("Chicken Fajita  M:30.99 EGP L:37.99EGP");
        CHICKEN.add("Chicken Zinger  M:29.99 EGP L:34.99EGP");
        CHICKEN.add("Chicken Roll  M:31.99 EGP L:45.99EGP");
        CHICKEN.add("Shish Tawouk  M:31.99 EGP L:39.99EGP");
        CHICKEN.add("Chicken Shawrma  M:28.99 EGP L:37.99EGP");
        CHICKEN.add("Chicken Burger  M:22.99 EGP L:27.99EGP");
        CHICKEN.add("Chicken EggBurger  M:25.99 EGP L:30.99EGP");
        CHICKEN.add("Chicken CheeseBurger  M:24.99 EGP L:31.99EGP");
        CHICKEN.add("Chicken BurgerMix  M:29.99 EGP L:34.99EGP");




        List<String> PIZZA=new ArrayList<>();
        PIZZA.add("Margarita Pizza   34.99EGP");
        PIZZA.add("Vegetables Pizza  37.99 EGP");
        PIZZA.add("BBQ  Pizza  47.99 EGP");
        PIZZA.add("Tuna Pizza 47.99EGP EGP");
        PIZZA.add("Pizza Unique    64.99 EGP");
        PIZZA.add("Chicken Pizza  47.99 EGP");
        PIZZA.add("Super Supreme Pizza  52.99 EGP");
        PIZZA.add("Peperoni Pizza  49.99 EGP");

        List<String>PASTA=new ArrayList<>();
        PASTA.add("Negresco   41.99 EGP");
        PASTA.add("Negresco With Bastrma  47.99 EGP");
        PASTA.add("Fettuccine  41.99 EGP");
        PASTA.add("Bologness  39.99 EGP");
        PASTA.add("Alfredo   41.99 EGP");
        PASTA.add("Bena rapita   41.99 EGP");
        PASTA.add("Bechamel   37.99 EGP");


        List<String>GRILLS=new ArrayList<>();
        GRILLS.add("Boneless Chicken(1/2 chicken)  64.99 EGP");
        GRILLS.add("Chicken Pane   48.99 EGP");
        GRILLS.add("Shish Tawouk  34.99 EGP");
        GRILLS.add("Mix Grill    74.99 EGP");
        GRILLS.add("Kofta    49.99 EGP");
        GRILLS.add("Chicken Celery   54.99 EGP");
        GRILLS.add("Chicken Lemon  56.99 EGP");
        GRILLS.add("Beef Fillet   89.99 EGP ");
        GRILLS.add("Picata Mushroom  79.99 EGP ");
        GRILLS.add("Lebanese Feta    34.99 EGP");
        GRILLS.add("With Every 2 Dishes you get (Rise,Fries,Sauteed vegetables )");


        List<String> CREPE=new ArrayList<>();
        CREPE.add("Chicken Pane   31.99 EGP");
        CREPE.add("Chicken Fajita  34.99 EGP");
        CREPE.add("Chicken Shawrma  31.99 EGP");
        CREPE.add("Chicken Burger   30.99 EGP");
        CREPE.add("Shish Tawouk  36.99 EGP ");
        CREPE.add("Meat Fajita  37.99 EGP");
        CREPE.add("Hot Dog  29.99 EGP");
        CREPE.add("Mexicano 37.99 EGP");
        CREPE.add("Roomi Cheese   26.99 EGP ");
        CREPE.add("Mozzarella Cheese  22.99 EGP");
        CREPE.add("Mix Cheese  31.99 EGP");
        CREPE.add("Potato   24.99 EGP");



        List<String> SALAD=new ArrayList<>();
        SALAD.add("Green Salad   14.99 EGP");
        SALAD.add("Greek Salad   21.99 EGP");
        SALAD.add("Caesar Salad  29.99 EGP ");
        SALAD.add("Tuna Salad   29.99 EGP");
        SALAD.add("Colslaw  15.99 EGP");


        List<String> SIDEDISH=new ArrayList<>();
        SIDEDISH.add("Fries  11.99 EGP");
        SIDEDISH.add("Cheese Fires  14.99 EGP");
        SIDEDISH.add("Pickles   11.99 EGP");



        List<String>SWEETCREPE=new ArrayList<>();
        SWEETCREPE.add("Nutella   31.99 EGP");
        SWEETCREPE.add("Banana Nutella  35.99 EGP ");
        SWEETCREPE.add("Jam and Cream    29.99 EGP");

        List<String> DESSERT=new ArrayList<>();
        DESSERT.add("Cheese Cake  39.99 EGP");
        DESSERT.add("Chocolate Cake  27.99 EGP");
        DESSERT.add("Carisma  34.99 EGP");
        DESSERT.add("Molten Cake  34.99 EGP");
        DESSERT.add("Brownies   24.99 EGP");
        DESSERT.add("Tiramisu    34.99 EGP");
        DESSERT.add("Ice Cream 3 Bola   27.99 EGP");
        DESSERT.add("Waffles  24.99  EGP");
        DESSERT.add("Nutella Waffles  34.99 EGP");
        DESSERT.add("Nutella and Banana Waffles   37.99  EGP");





        listHashMap.put(listHeader.get(0),MEATSANDWICH);
        listHashMap.put(listHeader.get(1),CHICKEN);
        listHashMap.put(listHeader.get(2),PIZZA);
        listHashMap.put(listHeader.get(3),PASTA);
        listHashMap.put(listHeader.get(4),GRILLS);
        listHashMap.put(listHeader.get(5),CREPE);
        listHashMap.put(listHeader.get(6),SALAD);
        listHashMap.put(listHeader.get(7),SIDEDISH);
        listHashMap.put(listHeader.get(8),SWEETCREPE);
        listHashMap.put(listHeader.get(9),DESSERT);








    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent home=new Intent(ResturantSide.this,MainActivity.class);
        startActivity(home);
        finish();
    }
}