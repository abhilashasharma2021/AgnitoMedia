package com.agnitomedia.adapers;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.agnitomedia.data.ReplyShowData;
import com.agnitomedia.databinding.RowReplyMoreBinding;
import java.util.ArrayList;


public class SendReplyAdapter extends RecyclerView.Adapter<SendReplyAdapter.MyViewHolder> {


    ArrayList<ReplyShowData>sendReplyDataList;
    Context context;

    public SendReplyAdapter(ArrayList<ReplyShowData> sendReplyDataList, Context context) {
        this.sendReplyDataList = sendReplyDataList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(RowReplyMoreBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ReplyShowData sendRplyData = sendReplyDataList.get(position);
        Log.e("yukmk", "check: " + sendRplyData);
/*    /* if (context instanceof ShowAllGymActivity) {
            ((ShowAllGymActivity) context).show_gymMultipleimages(dataAdapterOBJ.getGymId());
        }*/

     /*   layoutManagerImage = new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false);
        holder.rec_gymImage.setLayoutManager(layoutManagerImage);
        holder.rec_gymImage.setHasFixedSize(true);
        showAllGymImageAdapter = new ShowAllGymImageAdapter(context,dataAdapterImage);
        holder.rec_gymImage.setAdapter(showAllGymImageAdapter);
*/
        if (sendRplyData != null) {


        }
    }


    @Override
    public int getItemCount() {
        return sendReplyDataList == null ? 0 : sendReplyDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private RowReplyMoreBinding rowReplyMoreBinding;

        public MyViewHolder(RowReplyMoreBinding rowReplyMoreBinding) {
            super(rowReplyMoreBinding.getRoot());
            this.rowReplyMoreBinding = rowReplyMoreBinding;
        }
    }

}

