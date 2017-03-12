package recyclerapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.recyclerapplication.R;

import java.util.ArrayList;
import java.util.List;


public class Main2Activity extends AppCompatActivity {


    private List<ModelClass> cards;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        makecards();


    }


    private void makecards() {
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);


        cards = new ArrayList<>();
        ModelClass obj = new ModelClass("This is WASIDEA.coming soon..", R.drawable.a);
        cards.add(obj);
        obj = new ModelClass("SHOPPING...very easy ", R.drawable.shop);
        cards.add(obj);
        obj = new ModelClass("EARN like never before", R.drawable.money);
        cards.add(obj);

        obj = new ModelClass("ADVERTISEMENT in a new way", R.drawable.advertise);
        cards.add(obj);

        obj = new ModelClass("JOBS...no tension", R.drawable.jobs);
        cards.add(obj);

        obj = new ModelClass("This is WASIDEA.coming soon..", R.drawable.a);
        cards.add(obj);

        RecyclerView.Adapter adapter = new MyAdapter(this, cards);
        recyclerView.setAdapter(adapter);

    }
}
