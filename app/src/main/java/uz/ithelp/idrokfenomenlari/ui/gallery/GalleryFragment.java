package uz.ithelp.idrokfenomenlari.ui.gallery;

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
import uz.ithelp.idrokfenomenlari.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    ViewPager viewPager2;
    ModelViewPagerAdapter modelViewPagerAdapter;

    List<ModelViewPager> modelViewPagerList;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        modelViewPagerList = new ArrayList<>();
        initiali();

        modelViewPagerAdapter = new ModelViewPagerAdapter(modelViewPagerList,getContext());

        viewPager2 = binding.viewPager2;
        viewPager2.setAdapter(modelViewPagerAdapter);
        viewPager2.setPadding(130,0,130,0);


        return root;
    }

    private void initiali() {
        modelViewPagerList.add(new ModelViewPager(R.drawable.b1,"Расмда нима акс этган? Яхшилаб кузатинг!","Расмда нима акс этган? Яхшилаб кузатинг","https://github.com/shoxumarzoda/Idrok-fenomenlari/raw/master/1r.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b2,"Расмда кимлар ифодаланган?","Расмда кимлар ифодаланган?","https://github.com/shoxumarzoda/Idrok-fenomenlari/raw/master/2r.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b3,"Ушбу расмда кимларни кўраяпсиз?","Ушбу расмда кимларни кўраяпсиз?","https://github.com/shoxumarzoda/Idrok-fenomenlari/raw/master/3r.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b4,"Суратларни шошилмасдан кузатинг қанча предметларни санай оларкансиз","Суратларни шошилмасдан кузатинг қанча предметларни санай оларкансиз","https://github.com/shoxumarzoda/Idrok-fenomenlari/raw/master/4r.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b5,"Суратда бир оила аъзолари ифодаланган топингчи","Суратда бир оила аъзолари ифодаланган топингчи","https://github.com/shoxumarzoda/Idrok-fenomenlari/raw/master/5r.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b6,"Ушбу суратда қанча инсон қиёфаси яширинган топингчи","Ушбу суратда қанча инсон қиёфаси яширинган топингчи","https://github.com/shoxumarzoda/Idrok-fenomenlari/raw/master/6r.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b7,"Бу ерда нечта куб кўрсатилган?","Бу ерда нечта куб кўрсатилган?","https://github.com/shoxumarzoda/Idrok-fenomenlari/raw/master/7r.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b6,"Зинапоя қандай жойлашган","Зинапоя қандай жойлашган","https://github.com/shoxumarzoda/Idrok-fenomenlari/raw/master/8r.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b9,"Халқанинг қайси қисми олдинда?","Халқанинг қайси қисми олдинда?","https://github.com/shoxumarzoda/Idrok-fenomenlari/raw/master/9r.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b3,"Ишчилар қаерда ишламоқда?","Ишчилар қаерда ишламоқда?","https://github.com/shoxumarzoda/Idrok-fenomenlari/raw/master/10r.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b5,"Тахталар сони нечта ?","Тахталар сони нечта ?","https://github.com/shoxumarzoda/Idrok-fenomenlari/raw/master/11r.pdf"));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}