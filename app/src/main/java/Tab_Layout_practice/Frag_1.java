package Tab_Layout_practice;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.smart_programming_lecture_34tablayout.R;

import Tab_Layout__Using__Viewpager2.Activity_2;


public class Frag_1 extends Fragment {

TextView uu;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view=inflater.inflate(R.layout.fragment_frag_1, container, false);

       uu=view.findViewById(R.id.uu);
       uu.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(getContext(), Activity_2.class);
               startActivity(i);
           }
       });





       return view;
    }
}