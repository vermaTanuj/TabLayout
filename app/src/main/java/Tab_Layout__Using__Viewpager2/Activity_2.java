package Tab_Layout__Using__Viewpager2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.ListView;

import com.example.smart_programming_lecture_34tablayout.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import Tab_Layout_practice.Frag_1;
import Tab_Layout_practice.Frag_2;
import Tab_Layout_practice.Frag_3;

public class Activity_2 extends AppCompatActivity {

    TabLayout tab_2;

   ViewPager2 viewpager_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tab_2=findViewById(R.id.tab_2);

        viewpager_2=findViewById(R.id. viewpager_2);




//Adapter:-
        VPAdapter ad=new VPAdapter(getSupportFragmentManager(), getLifecycle());
         viewpager_2.setAdapter(ad);


//connection:-/

//This code overlaps the view pager2 and tablayout:-
/*
        new TabLayoutMediator(tab_2, viewpager_2,
                (tab, position) -> {
                    // Set tab titles here if needed
                }).attach();



 */



//connection:-
  viewpager_2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
      @Override
      public void onPageSelected(int position) {
          super.onPageSelected(position);

          tab_2.selectTab(tab_2.getTabAt(position));
      }
  });










    }

}