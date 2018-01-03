package com.akashdubey.gridviewdemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 int [] image={R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.ice_cream_sandwitch,R.drawable.jellybean,R.drawable.kitkat,R.drawable.lollipop,};
 String [] title={"Gingerbread","Honeycomb","Icecream Sandwich","Jellybean","Kitkat","Lollipop"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gv=(GridView)findViewById(R.id.gridview1);

        CustomAdapter adapter = new CustomAdapter();
        gv.setAdapter(adapter);

    }

    public class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return image.length;
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
            view=getLayoutInflater().inflate(R.layout.custom_layout,null);
            ImageView imageView=(ImageView)view.findViewById(R.id.imageview1);
            TextView textView=(TextView)view.findViewById(R.id.titleTV);


            imageView.setImageResource(image[i]);
            textView.setText(title[i]);
            return view;
        }
    }
}
