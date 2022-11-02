package com.agnitomedia.adapers;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.agnitomedia.activity.CompleteCheckOutActivity;
import com.agnitomedia.activity.NFTDetailsActivity;
import com.agnitomedia.data.NftItemData;
import com.agnitomedia.databinding.RownftitemlayoutBinding;
import java.util.List;

public class NftItemAdapter extends RecyclerView.Adapter<NftItemAdapter.MyViewHolder> {


    List<NftItemData> nftItemDataList;
    Context context;

    public NftItemAdapter(List<NftItemData> nftItemDataList, Context context) {
        this.nftItemDataList = nftItemDataList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(RownftitemlayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        NftItemData nftobj = nftItemDataList.get(position);
        Log.e("yukmk", "check: " + nftobj);

        holder.rownftitemlayoutBinding.rlBuyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, CompleteCheckOutActivity.class));
            }
        });

        holder.rownftitemlayoutBinding.llNft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, NFTDetailsActivity.class));
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
        private RownftitemlayoutBinding rownftitemlayoutBinding;

        public MyViewHolder(RownftitemlayoutBinding rownftitemlayoutBinding) {
            super(rownftitemlayoutBinding.getRoot());
            this.rownftitemlayoutBinding = rownftitemlayoutBinding;
        }
    }

}

