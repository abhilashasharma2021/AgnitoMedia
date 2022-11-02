package com.agnitomedia.adapers;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.agnitomedia.data.ProfileVideoData;
import com.agnitomedia.databinding.RowProfileVideoLayoutBinding;
import java.util.ArrayList;

public class ProfileVideoAdapter extends RecyclerView.Adapter<ProfileVideoAdapter.MyViewHolder> {


    ArrayList<ProfileVideoData> profileVideoDataList;
    Context context;

    public ProfileVideoAdapter(ArrayList<ProfileVideoData> profileVideoDataList, Context context) {
        this.profileVideoDataList = profileVideoDataList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(RowProfileVideoLayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ProfileVideoData nftobj = profileVideoDataList.get(position);
        Log.e("yukmk", "check: " + nftobj);

        if (nftobj != null) {


        }
    }


    @Override
    public int getItemCount() {
        return profileVideoDataList == null ? 0 : profileVideoDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private RowProfileVideoLayoutBinding rowProfileVideoLayoutBinding;

        public MyViewHolder(RowProfileVideoLayoutBinding rowProfileVideoLayoutBinding) {
            super(rowProfileVideoLayoutBinding.getRoot());
            this.rowProfileVideoLayoutBinding = rowProfileVideoLayoutBinding;
        }
    }

}

