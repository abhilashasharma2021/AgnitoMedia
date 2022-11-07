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
import com.agnitomedia.activity.StoryDetailsActivity;
import com.agnitomedia.data.HomeStoryData;
import com.agnitomedia.databinding.RowhomestorytlayoutBinding;
import com.example.readmoretextview.ReadMoreTextView;
import java.util.List;

public class HomeStoryFAdapter extends RecyclerView.Adapter<HomeStoryFAdapter.MyViewHolder> {


   List<HomeStoryData> homeStoryDataList;
    Context context;

    public HomeStoryFAdapter(List<HomeStoryData> homeStoryDataList, Context context) {
        this.homeStoryDataList = homeStoryDataList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(RowhomestorytlayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        HomeStoryData nftobj = homeStoryDataList.get(position);
        Log.e("yukmk", "check: " + nftobj);
        ReadMoreTextView readMoreTextView = new ReadMoreTextView();
        holder.rowhomestorytlayoutBinding.textView.setText(context.getResources().getString(R.string.dummy_text));
        readMoreTextView.setTextView( holder.rowhomestorytlayoutBinding.textView);
        readMoreTextView.setMaximumLine(2);
        readMoreTextView.setCollapseText("...See Less");
        readMoreTextView.setExpandText("...See More");
        readMoreTextView.setColorCode("#2CA6E9");
        readMoreTextView.setReadMore();

        holder.rowhomestorytlayoutBinding.rlClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, StoryDetailsActivity.class));
            }
        });
        if (nftobj != null) {

            holder.rowhomestorytlayoutBinding.ivLike.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    holder.rowhomestorytlayoutBinding.ivLike.setVisibility(View.GONE);
                    holder.rowhomestorytlayoutBinding.ivLikeFill.setVisibility(View.VISIBLE);
                }
            });

            holder.rowhomestorytlayoutBinding.ivLikeFill.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    holder.rowhomestorytlayoutBinding.ivLikeFill.setVisibility(View.GONE);
                    holder.rowhomestorytlayoutBinding.ivLike.setVisibility(View.VISIBLE);
                }
            });


            holder.rowhomestorytlayoutBinding.ivComment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    holder.rowhomestorytlayoutBinding.ivComment.setVisibility(View.GONE);
                    holder.rowhomestorytlayoutBinding.ivCommentFill.setVisibility(View.VISIBLE);
                }
            });

            holder.rowhomestorytlayoutBinding.ivCommentFill.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    holder.rowhomestorytlayoutBinding.ivCommentFill.setVisibility(View.GONE);
                    holder.rowhomestorytlayoutBinding.ivComment.setVisibility(View.VISIBLE);
                }
            });
            holder.rowhomestorytlayoutBinding.ivShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    holder.rowhomestorytlayoutBinding.ivShare.setVisibility(View.GONE);
                    holder.rowhomestorytlayoutBinding.ivShareFill.setVisibility(View.VISIBLE);
                }
            });

            holder.rowhomestorytlayoutBinding.ivShareFill.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    holder.rowhomestorytlayoutBinding.ivShareFill.setVisibility(View.GONE);
                    holder.rowhomestorytlayoutBinding.ivShare.setVisibility(View.VISIBLE);
                }
            });


        }
    }


    @Override
    public int getItemCount() {
        return homeStoryDataList == null ? 0 : homeStoryDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private RowhomestorytlayoutBinding rowhomestorytlayoutBinding;

        public MyViewHolder(RowhomestorytlayoutBinding rowhomestorytlayoutBinding) {
            super(rowhomestorytlayoutBinding.getRoot());
            this.rowhomestorytlayoutBinding = rowhomestorytlayoutBinding;
        }
    }

}

