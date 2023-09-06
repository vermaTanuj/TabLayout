package Tab_Layout__Using__Viewpager2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.smart_programming_lecture_34tablayout.R;


public class Frag_call extends Fragment {
    int img_arr[]={R.drawable.google,R.drawable.google,R.drawable.google,R.drawable.google,R.drawable.google,
                  R.drawable.google,R.drawable.google,R.drawable.google};
   String name_arr[]={"AAAA","BBBB","CCCCC","DDDD",
                     "EEEE","FFFF","GGGGG","HHHH"  };
   int no_arr[]={1111111111,1111111111,1111111111,1111111111,
           1111111111,1111111111,1111111111,1111111111,};

ListView list_1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_frag_call, container, false);


        list_1=view.findViewById(R.id.list_1);

        //Adapters:-
        List_Adapter_Fragment_Call ada=new List_Adapter_Fragment_Call(getContext(),no_arr,name_arr,img_arr);
        list_1.setAdapter(ada);



        list_1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Handle the item click here
                String selectedItem = (String) parent.getItemAtPosition(position);
                Toast.makeText(getContext(), "Clicked: " + selectedItem, Toast.LENGTH_SHORT).show();
            }
        });



        return view;
    }
}