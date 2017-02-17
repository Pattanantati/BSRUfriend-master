package appewtc.masterung.bsrufriend;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by Dell on 17/02/2017.
 */

public class FriendAdapter extends BaseAdapter {
    private Context context;
    private String[] iconStrings, nameStrings;
    private TextView textView;
    private ImageView imageView;

    public FriendAdapter(Context context,
                         String[] iconStrings,
                         String[] nameStrings) {
        this.context = context;
        this.iconStrings = iconStrings;
        this.nameStrings = nameStrings;
    }

    @Override
    public int getCount() {
        return iconStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //bind widget
        textView = (TextView) view1.findViewById(R.id.textView3);
        imageView = (ImageView) view1.findViewById(R.id.imageView10);

        //show view
        textView.setText(nameStrings[i]);
        Picasso.with(context).load(iconStrings[i]).into(imageView);


        return view1;
    }
}//main class
