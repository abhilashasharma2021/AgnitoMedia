package com.agnitomedia.adapers;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.agnitomedia.data.SavedNftsData;
import com.agnitomedia.data.SavedVideoData;
import com.agnitomedia.databinding.RowsavednftslayoutBinding;
import com.agnitomedia.databinding.RowsavedvideoslayoutBinding;

import java.util.List;

public class SavedNftsAdapter extends RecyclerView.Adapter<SavedNftsAdapter.MyViewHolder> {


    List<SavedNftsData> nftsDataList;
    Context context;

    public SavedNftsAdapter(List<SavedNftsData> nftsDataList, Context context) {
        this.nftsDataList = nftsDataList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(RowsavednftslayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        SavedNftsData nftsobj = nftsDataList.get(position);
        Log.e("yukmk", "check: " + nftsobj);



      /*  holder.rowallnftlayoutBinding.llNft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, NftItemActivity.class));
            }
        });*/
        if (nftsobj != null) {


        }
    }


    @Override
    public int getItemCount() {
        return nftsDataList == null ? 0 : nftsDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private RowsavednftslayoutBinding rowsavednftslayoutBinding;

        public MyViewHolder(RowsavednftslayoutBinding rowsavednftslayoutBinding) {
            super(rowsavednftslayoutBinding.getRoot());
            this.rowsavednftslayoutBinding = rowsavednftslayoutBinding;
        }
    }

}

