package com.agnitomedia.adapers;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.agnitomedia.data.ProfileNftData;
import com.agnitomedia.databinding.RowProfileNftLayoutBinding;
import java.util.ArrayList;

public class ProfileNftFAdapter extends RecyclerView.Adapter<ProfileNftFAdapter.MyViewHolder> {


    ArrayList<ProfileNftData> profileNftDataList;
    Context context;

    public ProfileNftFAdapter(ArrayList<ProfileNftData> profileNftDataList, Context context) {
        this.profileNftDataList = profileNftDataList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(RowProfileNftLayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ProfileNftData nftobj = profileNftDataList.get(position);
        Log.e("yukmk", "check: " + nftobj);

        if (nftobj != null) {


        }
    }


    @Override
    public int getItemCount() {
        return profileNftDataList == null ? 0 : profileNftDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private RowProfileNftLayoutBinding rowProfileNftLayoutBinding;

        public MyViewHolder(RowProfileNftLayoutBinding rowProfileNftLayoutBinding) {
            super(rowProfileNftLayoutBinding.getRoot());
            this.rowProfileNftLayoutBinding = rowProfileNftLayoutBinding;
        }
    }

}

