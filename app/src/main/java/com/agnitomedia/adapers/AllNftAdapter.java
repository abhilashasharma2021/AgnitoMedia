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
import com.agnitomedia.databinding.RowallnftlayoutBinding;

import java.util.List;

public class AllNftAdapter extends RecyclerView.Adapter<AllNftAdapter.MyViewHolder> {


    List<AllNftData> nftItemDataList;
    Context context;

    public AllNftAdapter(List<AllNftData> nftItemDataList, Context context) {
        this.nftItemDataList = nftItemDataList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(RowallnftlayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        AllNftData nftobj = nftItemDataList.get(position);
        Log.e("yukmk", "check: " + nftobj);



        holder.rowallnftlayoutBinding.llNft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, NftItemActivity.class));
            }
        });
        if (nftobj != null) {


        }
    }


    @Override
    public int getItemCount() {
        return nftItemDataList == null ? 0 : nftItemDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private RowallnftlayoutBinding rowallnftlayoutBinding;

        public MyViewHolder(RowallnftlayoutBinding rowallnftlayoutBinding) {
            super(rowallnftlayoutBinding.getRoot());
            this.rowallnftlayoutBinding = rowallnftlayoutBinding;
        }
    }

}

