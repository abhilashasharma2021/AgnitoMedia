package com.agnitomedia.adapers;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.agnitomedia.R;
import com.agnitomedia.activity.NftItemActivity;
import com.agnitomedia.data.AllNftData;
import com.agnitomedia.data.VideoData;
import com.agnitomedia.databinding.RowallnftlayoutBinding;
import com.agnitomedia.databinding.RowvideolayoutBinding;
import com.example.readmoretextview.ReadMoreTextView;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.MyViewHolder> {


    List<VideoData> videoDataList;
    Context context;

    public VideoAdapter(List<VideoData> videoDataList, Context context) {
        this.videoDataList = videoDataList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(RowvideolayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        VideoData nftobj = videoDataList.get(position);
        Log.e("yukmk", "check: " + nftobj);
        ReadMoreTextView readMoreTextView = new ReadMoreTextView();
        holder.rowvideolayoutBinding.textView.setText(context.getResources().getString(R.string.dummy_text));
        readMoreTextView.setTextView(holder.rowvideolayoutBinding.textView);
         readMoreTextView.setMaximumLine(3);
        readMoreTextView.setCollapseText("See Less");
        readMoreTextView.setExpandText("... See More");
        readMoreTextView.setColorCode("#FFFFFF");
        readMoreTextView.setReadMore();

   /*     if (nftobj != null) {


        }*/
    }


    @Override
    public int getItemCount() {
        return videoDataList == null ? 0 : videoDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private RowvideolayoutBinding rowvideolayoutBinding;

        public MyViewHolder(RowvideolayoutBinding rowvideolayoutBinding) {
            super(rowvideolayoutBinding.getRoot());
            this.rowvideolayoutBinding = rowvideolayoutBinding;
        }
    }

}

