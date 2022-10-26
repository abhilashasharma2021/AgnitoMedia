package com.agnitomedia.adapers;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.agnitomedia.data.AllStoryCategoryData;
import com.agnitomedia.data.AllStoryData;
import com.agnitomedia.databinding.RowallstorylayoutBinding;
import com.agnitomedia.databinding.RowstorycategorylayoutBinding;

import java.util.List;

public class AllStoryCategoryAdapter extends RecyclerView.Adapter<AllStoryCategoryAdapter.MyViewHolder> {


   List<AllStoryCategoryData> allStoryCategoryDataList;
    Context context;

    public AllStoryCategoryAdapter(List<AllStoryCategoryData> allStoryCategoryDataList, Context context) {
        this.allStoryCategoryDataList = allStoryCategoryDataList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(RowstorycategorylayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        AllStoryCategoryData allStoryCategoryData = allStoryCategoryDataList.get(position);
        Log.e("yukmk", "check: " + allStoryCategoryData);
        if (allStoryCategoryData != null) {


        }
    }


    @Override
    public int getItemCount() {
        return allStoryCategoryDataList == null ? 0 : allStoryCategoryDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private RowstorycategorylayoutBinding rowstorycategorylayoutBinding;

        public MyViewHolder(RowstorycategorylayoutBinding rowstorycategorylayoutBinding) {
            super(rowstorycategorylayoutBinding.getRoot());
            this.rowstorycategorylayoutBinding = rowstorycategorylayoutBinding;
        }
    }

}

