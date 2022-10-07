package uz.ithelp.idrokfenomenlari.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

import uz.ithelp.idrokfenomenlari.ModelViewPager;
import uz.ithelp.idrokfenomenlari.ModelViewPagerAdapter;
import uz.ithelp.idrokfenomenlari.R;
import uz.ithelp.idrokfenomenlari.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    ViewPager viewPager;
    ModelViewPagerAdapter modelViewPagerAdapter;

    List<ModelViewPager> modelViewPagerList;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        modelViewPagerList = new ArrayList<>();
        initiali();

        modelViewPagerAdapter = new ModelViewPagerAdapter(modelViewPagerList,getContext());

        viewPager = binding.viewPager1;
        viewPager.setAdapter(modelViewPagerAdapter);
        viewPager.setPadding(130,0,130,0);


        return root;
    }

    private void initiali() {

        modelViewPagerList.add(new ModelViewPager(R.drawable.a1,"Қизиқарли психология ҳақида бир сўз..........","Тўлин ой уфқнинг энг баланд  ...","https://github.com/shoxumarzoda/Idrok-fenomenlari/raw/master/1.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a6,"Идрок ҳақида тушунча","Идрок сезгиларга нисбатан ","https://github.com/shoxumarzoda/Idrok-fenomenlari/raw/master/2.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a12,"Идрок турлари ва унинг индивидуал хусусиятлари","Идрокнинг вақтни, ҳаракатни, фазони ","https://github.com/shoxumarzoda/Idrok-fenomenlari/raw/master/3.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a2,"Идрокнинг асосий хусусиятлари.","Идрок хусусиятлари турли жабҳалар","https://github.com/shoxumarzoda/Idrok-fenomenlari/raw/master/4.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a11,"Изоҳли луғат","Изоҳли луғат","https://github.com/shoxumarzoda/Idrok-fenomenlari/raw/master/5.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a7,"Адабиётлар","Адабиётлар","https://github.com/shoxumarzoda/Idrok-fenomenlari/raw/master/adab.pdf"));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}