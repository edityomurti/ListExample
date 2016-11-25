package android.netclub.listexample.activity;

import android.netclub.listexample.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SimpleListViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list_view);
        setTitle("Simple ListView");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String[] days = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        ListAdapter daysAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, days);
        ListView lvDays = (ListView) findViewById(R.id.listview_simple);
        lvDays.setAdapter(daysAdapter);

        lvDays.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String day = String.valueOf(adapterView.getItemAtPosition(i));
                Toast.makeText(SimpleListViewActivity.this, "Hari " + day, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
