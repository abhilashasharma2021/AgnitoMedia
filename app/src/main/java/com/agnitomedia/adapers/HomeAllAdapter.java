package com.agnitomedia.adapers;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.agnitomedia.activity.NftItemActivity;
import com.agnitomedia.data.AllNftData;
import com.agnitomedia.data.HomeAlltData;
import com.agnitomedia.databinding.RowallnftlayoutBinding;
import com.agnitomedia.databinding.RowhomealllayoutBinding;

import java.util.List;

public class HomeAllAdapter extends RecyclerView.Adapter<HomeAllAdapter.MyViewHolder> {


    List<HomeAlltData> homeAlltDataList;
    Context context;

    public HomeAllAdapter(List<HomeAlltData> homeAlltDataList, Context context) {
        this.homeAlltDataList = homeAlltDataList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(RowhomealllayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        HomeAlltData homeAllObj = homeAlltDataList.get(position);
        Log.e("yukmk", "check: " + homeAllObj);

        if (homeAllObj != null) {


        }
    }


    @Override
    public int getItemCount() {
        return homeAlltDataList == null ? 0 : homeAlltDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private RowhomealllayoutBinding rowhomealllayoutBinding;

        public MyViewHolder(RowhomealllayoutBinding rowhomealllayoutBinding) {
            super(rowhomealllayoutBinding.getRoot());
            this.rowhomealllayoutBinding = rowhomealllayoutBinding;
        }
    }

}

