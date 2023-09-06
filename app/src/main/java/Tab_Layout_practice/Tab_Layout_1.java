package Tab_Layout_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;


import com.example.smart_programming_lecture_34tablayout.R;
import com.google.android.material.tabs.TabLayout;

public class Tab_Layout_1 extends AppCompatActivity {
    TabLayout tab_1;
        FrameLayout frame_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout1);

        tab_1=findViewById(R.id.tab_1);
         frame_1=findViewById(R.id.frame_1);

         /*
         Puttting the tablayout tabs through java:-


         TabLayout.Tab tab1=tab_1.newTab();
         tab1.setText("Chat");
         tab1.setIcon(R.drawable.chat);
         tab_1.addTab(tab1);

        TabLayout.Tab tab2=tab_1.newTab();
        tab2.setText("Call");
        tab2.setIcon(R.drawable.call);
        tab_1.addTab(tab2);

        TabLayout.Tab tab3=tab_1.newTab();
        tab3.setText("Status");
        tab3.setIcon(R.drawable.status);
        tab_1.addTab(tab3);

          */

        //--------  On click listner on tab layout ---------------------//
        openFrag(new Frag_1());

        tab_1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int p=tab.getPosition();
                if(p==0){
                   openFrag( new Frag_1());

                }
                else if (p==1) {

                    openFrag( new Frag_2());

                }
                else if (p==2) {

                    openFrag( new Frag_3());

                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {


            }
        });


    }

    //to open fragment:-
    public void openFrag(Fragment f){
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame_1,f);
        ft.commit();
    }
}