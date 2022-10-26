package com.agnitomedia.adapers;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.agnitomedia.R;
import com.agnitomedia.data.AllStoryData;
import com.agnitomedia.data.HomeStoryData;
import com.agnitomedia.databinding.RowallstorylayoutBinding;
import com.example.readmoretextview.ReadMoreTextView;

import java.util.List;

public class AllStoryAdapter extends RecyclerView.Adapter<AllStoryAdapter.MyViewHolder> {


   List<AllStoryData> allStoryDataList;
    Context context;

    public AllStoryAdapter(List<AllStoryData> allStoryDataList, Context context) {
        this.allStoryDataList = allStoryDataList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(RowallstorylayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        AllStoryData allStoryData = allStoryDataList.get(position);
        Log.e("yukmk", "check: " + allStoryData);
        if (allStoryData != null) {


        }
    }


    @Override
    public int getItemCount() {
        return allStoryDataList == null ? 0 : allStoryDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private RowallstorylayoutBinding rowallstorylayoutBinding;

        public MyViewHolder(RowallstorylayoutBinding rowallstorylayoutBinding) {
            super(rowallstorylayoutBinding.getRoot());
            this.rowallstorylayoutBinding = rowallstorylayoutBinding;
        }
    }

}

