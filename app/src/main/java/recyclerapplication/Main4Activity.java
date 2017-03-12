package recyclerapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.recyclerapplication.R;

import java.util.ArrayList;
import java.util.List;

public class Main4Activity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<ModelClass> cards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        makecards();

    }



    private void makecards() {
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);


        cards = new ArrayList<>();
        ModelClass obj = new ModelClass("Rs.900", R.drawable.trouser1
        );
        cards.add(obj);
        obj = new ModelClass("Rs.800", R.drawable.shirt1);
        cards.add(obj);
        obj = new ModelClass("Rs.550", R.drawable.shoe1);
        cards.add(obj);

        obj = new ModelClass("Rs.1500", R.drawable.fridge1);
        cards.add(obj);

        obj = new ModelClass("Rs.900", R.drawable.trouser1);
        cards.add(obj);

        obj = new ModelClass("Rs.800", R.drawable.shirt1);
        cards.add(obj);

        obj = new ModelClass("Rs.550", R.drawable.shoe1);
        cards.add(obj);

        RecyclerView.Adapter adapter1 = new MyAdapter1(this, cards);
        recyclerView.setAdapter(adapter1);

    }
}


