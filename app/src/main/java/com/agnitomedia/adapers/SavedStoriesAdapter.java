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
import com.agnitomedia.data.SavedStoriesData;
import com.agnitomedia.databinding.RowallnftlayoutBinding;
import com.agnitomedia.databinding.RowsavedstorieslayoutBinding;

import java.util.List;

public class SavedStoriesAdapter extends RecyclerView.Adapter<SavedStoriesAdapter.MyViewHolder> {


    List<SavedStoriesData> storiesDataList;
    Context context;

    public SavedStoriesAdapter(List<SavedStoriesData> storiesDataList, Context context) {
        this.storiesDataList = storiesDataList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(RowsavedstorieslayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        SavedStoriesData storyobj = storiesDataList.get(position);
        Log.e("yukmk", "check: " + storyobj);



      /*  holder.rowallnftlayoutBinding.llNft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, NftItemActivity.class));
            }
        });*/
        if (storyobj != null) {


        }
    }


    @Override
    public int getItemCount() {
        return storiesDataList == null ? 0 : storiesDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private RowsavedstorieslayoutBinding rowsavedstorieslayoutBinding;

        public MyViewHolder(RowsavedstorieslayoutBinding rowsavedstorieslayoutBinding) {
            super(rowsavedstorieslayoutBinding.getRoot());
            this.rowsavedstorieslayoutBinding = rowsavedstorieslayoutBinding;
        }
    }

}

