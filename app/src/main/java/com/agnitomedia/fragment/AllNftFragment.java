package com.agnitomedia.fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.agnitomedia.R;
import com.agnitomedia.activity.NotificationActivity;
import com.agnitomedia.activity.SearchActivity;
import com.agnitomedia.adapers.AllNftAdapter;
import com.agnitomedia.data.AllNftData;
import com.agnitomedia.databinding.FragmentAllNftBinding;
import java.util.ArrayList;



public class AllNftFragment extends Fragment {
    FragmentAllNftBinding binding;
    View view;
    Context context;
    ArrayList<AllNftData> allnftDataList =new ArrayList<>();
    AllNftAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAllNftBinding.inflate(getLayoutInflater(), container, false);
        view = binding.getRoot();
        context = getActivity();

        binding.rvAllNft.setLayoutManager(new LinearLayoutManager(getActivity()));
        layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);

        binding.ivNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(getActivity(), NotificationActivity.class));
            }
        });

        binding.ivSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(getActivity(), SearchActivity.class));
            }
        });


       /* ReadMoreTextView readMoreTextView = new ReadMoreTextView();
        binding.textView.setText(getResources().getString(R.string.dummy_text));
        readMoreTextView.setTextView(textView);
        readMoreTextView.setMaximumLine(2);
        readMoreTextView.setCollapseText("See Less");
        readMoreTextView.setExpandText("See More");
        readMoreTextView.setColorCode("#2CA6E9");
        readMoreTextView.setReadMore();
*/
        show_ALlNft();

    return  view;

    }
    private  void show_ALlNft(){
        AllNftData data=new AllNftData("Globe Hassan","₹ 0.375L","#KH0121", R.drawable.test);
        for (int i = 0; i <4 ; i++) {
            allnftDataList.add(data);
        }
        adapter = new AllNftAdapter(allnftDataList,getActivity());
        binding.rvAllNft.setAdapter(adapter);
    }
}