package com.agnitomedia.adapers;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.agnitomedia.data.ViewAllProfileData;
import com.agnitomedia.databinding.RowViewallProfileLayoutBinding;

import java.util.ArrayList;


public class ViewAllProfileAdapter extends RecyclerView.Adapter<ViewAllProfileAdapter.MyViewHolder> {


    ArrayList<ViewAllProfileData> viewallProfileDataList;
    Context context;

    public ViewAllProfileAdapter(ArrayList<ViewAllProfileData> viewallProfileDataList, Context context) {
        this.viewallProfileDataList = viewallProfileDataList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(RowViewallProfileLayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ViewAllProfileData profileobj = viewallProfileDataList.get(position);
        Log.e("yukmk", "check: " + profileobj);


        holder.rowViewallProfileLayoutBinding.btSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.rowViewallProfileLayoutBinding.btSend.setVisibility(View.GONE);
                holder.rowViewallProfileLayoutBinding.btSendBlue.setVisibility(View.VISIBLE);
            }
        });
        if (profileobj != null) {


        }
    }


    @Override
    public int getItemCount() {
        return viewallProfileDataList == null ? 0 : viewallProfileDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private RowViewallProfileLayoutBinding rowViewallProfileLayoutBinding;

        public MyViewHolder(RowViewallProfileLayoutBinding rowViewallProfileLayoutBinding) {
            super(rowViewallProfileLayoutBinding.getRoot());
            this.rowViewallProfileLayoutBinding = rowViewallProfileLayoutBinding;
        }
    }

}

