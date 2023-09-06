package Tab_Layout__Using__Viewpager2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.smart_programming_lecture_34tablayout.R;

import Tab_Layout_practice.Tab_Layout_1;

public class List_Adapter_Fragment_Call extends BaseAdapter {

    //Constructor:-
    Context context;
    int []no_arr;
    String []name_arr;
    int []img_arr;
    LayoutInflater inflater;
    public List_Adapter_Fragment_Call(Context context,int no_arr[], String name_arr[],int img_arr[]){
this.context=context;
this.img_arr=img_arr;
this.name_arr=name_arr;
this.no_arr=no_arr;
inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return img_arr.length;
    }

    @Override
    public Object getItem(int position) {
        Toast.makeText(context, "YYYYYYYYYYYYYYYY", Toast.LENGTH_SHORT).show();




        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {



        View view=inflater.inflate(R.layout.custon_list_view_frag_call,null);
        //Image View:-
        ImageView custom_img=view.findViewById(R.id.custom_img);
        custom_img.setImageResource(img_arr[position]);
//TextView:-
        TextView custom_tv_name=view.findViewById(R.id.custom_tv_name);
        custom_tv_name.setText(String.valueOf(name_arr[position]));

        TextView custom_tv_no=view.findViewById(R.id.custom_tv_no);
        custom_tv_no.setText(String.valueOf(no_arr[position]));

        return view;
    }
}
