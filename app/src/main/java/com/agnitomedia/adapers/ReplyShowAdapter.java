package com.agnitomedia.adapers;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.agnitomedia.R;
import com.agnitomedia.activity.CommentActivity;
import com.agnitomedia.data.ReplyShowData;
import com.agnitomedia.databinding.RowShowReplyBinding;
import java.util.ArrayList;


public class ReplyShowAdapter extends RecyclerView.Adapter<ReplyShowAdapter.MyViewHolder> {


    ArrayList<ReplyShowData> replyShowDataList;
    ArrayList<ReplyShowData>sendReplyDataList=new ArrayList<>();
    SendReplyAdapter sendReplyAdapter;
    RecyclerView.LayoutManager layoutManagerImage;
    Context context;

    public ReplyShowAdapter(ArrayList<ReplyShowData> replyShowDataList, Context context) {
        this.replyShowDataList = replyShowDataList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(RowShowReplyBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ReplyShowData replyShowData = replyShowDataList.get(position);
        Log.e("yukmk", "check: " + replyShowData);
/*    /* if (context instanceof ShowAllGymActivity) {
            ((ShowAllGymActivity) context).show_gymMultipleimages(dataAdapterOBJ.getGymId());
        }*/

     /*   layoutManagerImage = new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false);
        holder.rec_gymImage.setLayoutManager(layoutManagerImage);
        holder.rec_gymImage.setHasFixedSize(true);
        showAllGymImageAdapter = new ShowAllGymImageAdapter(context,dataAdapterImage);
        holder.rec_gymImage.setAdapter(showAllGymImageAdapter);
*/

        holder.rowShowReplyBinding.rlTotalRplyVisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.rowShowReplyBinding.rvReply.setVisibility(View.VISIBLE);
                holder.rowShowReplyBinding.rlTotalRplyVisible.setVisibility(View.GONE);
                holder.rowShowReplyBinding.rlTotalRplyGone.setVisibility(View.VISIBLE);
                layoutManagerImage = new LinearLayoutManager(context, RecyclerView.VERTICAL, false);
                holder.rowShowReplyBinding.rvReply.setLayoutManager(layoutManagerImage);
                holder.rowShowReplyBinding.rvReply.setHasFixedSize(true);
                sendReplyAdapter = new SendReplyAdapter(sendReplyDataList,context);
                holder.rowShowReplyBinding.rvReply.setAdapter(sendReplyAdapter);
                all_SendReply();
            }
        });

        holder.rowShowReplyBinding.rlTotalRplyGone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.rowShowReplyBinding.rlTotalRplyVisible.setVisibility(View.VISIBLE);
                holder.rowShowReplyBinding.rlTotalRplyGone.setVisibility(View.GONE);
                holder.rowShowReplyBinding.rvReply.setVisibility(View.GONE);

            }
        });

        holder.rowShowReplyBinding.txReplyVisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               holder.rowShowReplyBinding. rlMainReply.setVisibility(View.VISIBLE);
               holder.rowShowReplyBinding. txReplyGone.setVisibility(View.VISIBLE);
                holder.rowShowReplyBinding.txReplyVisible.setVisibility(View.GONE);

            }
        });

        holder.rowShowReplyBinding.txReplyGone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                holder.rowShowReplyBinding. rlMainReply.setVisibility(View.GONE);
                holder.rowShowReplyBinding.txReplyGone.setVisibility(View.GONE);
                holder.rowShowReplyBinding.txReplyVisible.setVisibility(View.VISIBLE);
            }
        });
        if (replyShowData != null) {


        }
    }


    @Override
    public int getItemCount() {
        return replyShowDataList == null ? 0 : replyShowDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private RowShowReplyBinding rowShowReplyBinding;

        public MyViewHolder(RowShowReplyBinding rowShowReplyBinding) {
            super(rowShowReplyBinding.getRoot());
            this.rowShowReplyBinding = rowShowReplyBinding;
        }
    }
    private void all_SendReply() {
        ReplyShowData data=new ReplyShowData("Aditya Vaishnav","You’re Stunning!\\nHow are you always so perfect?","21","50","Today", R.drawable.profi);
        for (int i = 0; i < 1; i++) {
            sendReplyDataList.add(data);
        }


    }
}

