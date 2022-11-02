package com.agnitomedia;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.agnitomedia.adapers.ProfileNftFAdapter;
import com.agnitomedia.data.ProfileNftData;
import com.agnitomedia.databinding.FragmentNftsTablayoutBinding;
import java.util.ArrayList;


public class NftsTablayoutFragment extends Fragment {

    FragmentNftsTablayoutBinding binding;
    View view;
    Context context;
    ArrayList<ProfileNftData> nftDataList=new ArrayList<>() ;
    ProfileNftFAdapter nftAdapter;
    RecyclerView.LayoutManager layoutManagerNft;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentNftsTablayoutBinding.inflate(getLayoutInflater(), container, false);
        view = binding.getRoot();
        context = getActivity();

        layoutManagerNft = new GridLayoutManager(getActivity(),2, LinearLayoutManager.VERTICAL, false);
        binding.rvNft.setLayoutManager(layoutManagerNft);
        showNft();
        return view;
    }

    private void showNft(){
        ProfileNftData data=new ProfileNftData("700","800",R.drawable.dy2);
        for (int i = 0; i < 12; i++) {
            nftDataList.add(data);
        }
        nftAdapter = new ProfileNftFAdapter(nftDataList, getActivity());
        binding.rvNft.setAdapter(nftAdapter);

    }
}