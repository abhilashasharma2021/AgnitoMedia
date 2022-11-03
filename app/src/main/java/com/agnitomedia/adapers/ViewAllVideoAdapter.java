package com.agnitomedia.adapers;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.agnitomedia.data.SavedVideoData;
import com.agnitomedia.databinding.RowsavedvideoslayoutBinding;
import com.agnitomedia.databinding.RowviewallvideoslayoutBinding;

import java.util.ArrayList;
import java.util.List;

public class ViewAllVideoAdapter extends RecyclerView.Adapter<ViewAllVideoAdapter.MyViewHolder> {


    ArrayList<SavedVideoData> videoDataList;
    Context context;

    public ViewAllVideoAdapter(ArrayList<SavedVideoData> videoDataList, Context context) {
        this.videoDataList = videoDataList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(RowviewallvideoslayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        SavedVideoData videoobj = videoDataList.get(position);
        Log.e("yukmk", "check: " + videoobj);



      /*  holder.rowallnftlayoutBinding.llNft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, NftItemActivity.class));
            }
        });*/
        if (videoobj != null) {


        }
    }


    @Override
    public int getItemCount() {
        return videoDataList == null ? 0 : videoDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private RowviewallvideoslayoutBinding rowviewallvideoslayoutBinding;

        public MyViewHolder(RowviewallvideoslayoutBinding rowviewallvideoslayoutBinding) {
            super(rowviewallvideoslayoutBinding.getRoot());
            this.rowviewallvideoslayoutBinding = rowviewallvideoslayoutBinding;
        }
    }

}

