package recyclerapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.recyclerapplication.R;

import java.util.List;

public class MyAdapter1 extends RecyclerView.Adapter<MyAdapter1.MyViewHolder> {




    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView text;
        public ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);
            text = (TextView) view.findViewById(R.id.textid);
            thumbnail = (ImageView) view.findViewById(R.id.image);

        }
    }


    private List<ModelClass> mContacts;
    // Store the context for easy access
    private Context mContext;

    // Pass in the contact array into the constructor
    public MyAdapter1(Context context, List<ModelClass> contacts) {
        mContacts = contacts;
        mContext = context;
    }


    // Easy access to the context object in the recyclerview
    private Context getContext() {
        return mContext;
    }





    public MyAdapter1.MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view1, viewGroup, false);
        return new MyViewHolder(view);
    }

    public void onBindViewHolder(MyAdapter1.MyViewHolder viewHolder, int i) {

        ModelClass obj=mContacts.get(i);
        viewHolder.text.setText(obj.getName());

       // viewHolder.thumbnail.setImageResource(obj.getPic_id());
        Glide.with(mContext).load(obj.getPic_id()).into(viewHolder.thumbnail);
    }
    public int getItemCount() {
        return mContacts.size();
    }


}
