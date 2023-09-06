package Tab_Layout__Using__Viewpager2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.smart_programming_lecture_34tablayout.R;

import Tab_Layout_practice.Frag_1;
import Tab_Layout_practice.Frag_2;
import Tab_Layout_practice.Frag_3;

public class VPAdapter extends FragmentStateAdapter {


    public VPAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        if (position == 0) {
            return new Frag_call();
        } else if (position == 1) {
            return new Frag_chat();
        } else if (position == 2) {
            return new Frag_status();
        }
        return null;




    }

    @Override
    public int getItemCount() {
        return 3;
    }



}
