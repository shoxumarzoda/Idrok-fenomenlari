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
        modelViewPagerList.add(new ModelViewPager(R.drawable.b1,"Расмда нима акс этган? Яхшилаб кузатинг!","Расмда нима акс этган? Яхшилаб кузатинг",""));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b2,"Расмда кимлар ифодаланган?","Расмда кимлар ифодаланган?",""));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b3,"Ушбу расмда кимларни кўраяпсиз?","Ушбу расмда кимларни кўраяпсиз?",""));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b4,"Суратларни шошилмасдан кузатинг қанча предметларни санай оларкансиз","Суратларни шошилмасдан кузатинг қанча предметларни санай оларкансиз",""));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b5,"Суратда бир оила аъзолари ифодаланган топингчи","Ушбу суратда қанча инсон қиёфаси яширинган топингчи",""));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b6,"Бу ерда нечта куб кўрсатилган?","Зинапоя қандай жойлашган",""));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b7,"Халқанинг қайси қисми олдинда?","Ишчилар қаерда ишламоқда?",""));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b8,"Тахталар сони нечта ?","Тахталар сони нечта ?",""));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}