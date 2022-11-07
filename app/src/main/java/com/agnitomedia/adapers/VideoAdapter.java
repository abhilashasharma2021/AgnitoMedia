package com.agnitomedia.adapers;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.agnitomedia.R;
import com.agnitomedia.data.VideoData;
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
        VideoData videoobj = videoDataList.get(position);
        Log.e("yukmk", "check: " + videoobj);
        ReadMoreTextView readMoreTextView = new ReadMoreTextView();
        holder.rowvideolayoutBinding.textView.setText(context.getResources().getString(R.string.dummy_text));
        readMoreTextView.setTextView(holder.rowvideolayoutBinding.textView);
         readMoreTextView.setMaximumLine(3);
        readMoreTextView.setCollapseText("See Less");
        readMoreTextView.setExpandText("... See More");
        readMoreTextView.setColorCode("#FFFFFF");
        readMoreTextView.setReadMore();

    if (videoobj != null) {
        holder.rowvideolayoutBinding.ivLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.rowvideolayoutBinding.ivLike.setVisibility(View.GONE);
                holder.rowvideolayoutBinding.ivLikeFill.setVisibility(View.VISIBLE);
            }
        });

        holder.rowvideolayoutBinding.ivLikeFill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.rowvideolayoutBinding.ivLikeFill.setVisibility(View.GONE);
                holder.rowvideolayoutBinding.ivLike.setVisibility(View.VISIBLE);
            }
        });


        holder.rowvideolayoutBinding.ivComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.rowvideolayoutBinding.ivComment.setVisibility(View.GONE);
                holder.rowvideolayoutBinding.ivCommentFill.setVisibility(View.VISIBLE);
            }
        });

        holder.rowvideolayoutBinding.ivCommentFill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.rowvideolayoutBinding.ivCommentFill.setVisibility(View.GONE);
                holder.rowvideolayoutBinding.ivComment.setVisibility(View.VISIBLE);
            }
        });
        holder.rowvideolayoutBinding.ivShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.rowvideolayoutBinding.ivShare.setVisibility(View.GONE);
                holder.rowvideolayoutBinding.ivShareFill.setVisibility(View.VISIBLE);
            }
        });

        holder.rowvideolayoutBinding.ivShareFill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.rowvideolayoutBinding.ivShareFill.setVisibility(View.GONE);
                holder.rowvideolayoutBinding.ivShare.setVisibility(View.VISIBLE);
            }
        });


    }
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

