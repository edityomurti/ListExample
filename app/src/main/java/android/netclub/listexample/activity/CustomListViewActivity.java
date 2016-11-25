package android.netclub.listexample.activity;

import android.netclub.listexample.R;
import android.netclub.listexample.adapter.CustomListViewAdapter;
import android.netclub.listexample.model.User;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CustomListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        setTitle("Custom ListView");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // inisialisasi list User
        List<User> users = new ArrayList<>();

        //menambahkan user
        User user1 = new User();
        user1.setName("Alan Turing");
        user1.setAvatar(R.drawable.img_alan_turing);
        users.add(user1);

        User user2 = new User();
        user2.setName("Bob Dylan");
        user2.setAvatar(R.drawable.img_bob_dylan);
        users.add(user2);

        User user3 = new User();
        user3.setName("Chriss Pratt");
        user3.setAvatar(R.drawable.img_chriss_pratt);
        users.add(user3);

        User user4 = new User();
        user4.setName("Donald Trump");
        user4.setAvatar(R.drawable.img_donald_trump);
        users.add(user4);

        User user5 = new User();
        user5.setName("Elliot Anderson");
        user5.setAvatar(R.drawable.img_elliot_andersson);
        users.add(user5);

        User user6 = new User();
        user6.setName("Frank Zappa");
        user6.setAvatar(R.drawable.img_frank_zappa);
        users.add(user6);

        User user7 = new User();
        user7.setName("Goerge Clooney");
        user7.setAvatar(R.drawable.img_george_clooney);
        users.add(user7);

        User user8 = new User();
        user8.setName("Hillary Clinton");
        user8.setAvatar(R.drawable.img_hillary_clinton);
        users.add(user8);

        User user9 = new User();
        user9.setName("Isaac Newton");
        user9.setAvatar(R.drawable.img_isaac_newton);
        users.add(user9);

        //inisialisasi custom adapter
        ListAdapter userAdapter = new CustomListViewAdapter(this, users);
        ListView lvUser = (ListView) findViewById(R.id.listview_custom);
        lvUser.setAdapter(userAdapter);

        //action ketika card di klik
        lvUser.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                User user = (User) adapterView.getItemAtPosition(i);
                Toast.makeText(CustomListViewActivity.this, "User : " + user.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //untuk button back pada actionbar
        if(id == android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
