package android.netclub.listexample.activity;

import android.content.Intent;
import android.netclub.listexample.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvSimpleListview, tvCustomListview, tvRecyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("HOME");

        tvSimpleListview = (TextView) findViewById(R.id.btn_simple_listview);
        tvCustomListview = (TextView) findViewById(R.id.btn_custom_listview);
        tvRecyclerview = (TextView) findViewById(R.id.btn_recyclerview);

        tvSimpleListview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SimpleListViewActivity.class);
                startActivity(intent);
            }
        });

        tvCustomListview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CustomListViewActivity.class);
                startActivity(intent);
            }
        });

        tvRecyclerview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
