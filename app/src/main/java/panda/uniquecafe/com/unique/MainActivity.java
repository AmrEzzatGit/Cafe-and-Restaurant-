package panda.uniquecafe.com.unique;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button Cafe,Rest,Loc;
        TextView Callus;
        ImageView Callicon;

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Cafe=(Button)findViewById(R.id.CafeSide);
            Rest=(Button)findViewById(R.id.Resturant);
            Callus=(TextView)findViewById(R.id.CallUS);
            Callicon=(ImageView)findViewById(R.id.CallIcon);
            Loc=(Button)findViewById(R.id.FindUs);
            final String number="01030061800";
            Loc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent map=new Intent(MainActivity.this,MapsActivity.class);
                    startActivity(map);
                    finish();
                }
            });
            Rest.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent Go=new Intent(MainActivity.this,ResturantSide.class);
                    startActivity(Go);
                    finish();
                }
            });

            Cafe.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent move=new Intent(MainActivity.this,CoffeSide.class);
                    startActivity(move);
                    finish();
                }
            });

            Callus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent Call=new Intent(Intent.ACTION_DIAL);
                    Call.setData(Uri.parse("tel:"+number));
                    startActivity(Call);
                }
            });
            Callicon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent CALL=new Intent(Intent.ACTION_DIAL);
                    CALL.setData(Uri.parse("tel:"+number));
                    startActivity(CALL);
                }
            });


        }
    }
