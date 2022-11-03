package com.agnitomedia.adapers;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.agnitomedia.data.SearchProfileData;
import com.agnitomedia.databinding.RowSearchProfileLayoutBinding;
import java.util.ArrayList;


public class SearchProfileAdapter extends RecyclerView.Adapter<SearchProfileAdapter.MyViewHolder> {


    ArrayList<SearchProfileData> searchProfileDataList;
    Context context;

    public SearchProfileAdapter(ArrayList<SearchProfileData> searchProfileDataList, Context context) {
        this.searchProfileDataList = searchProfileDataList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(RowSearchProfileLayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        SearchProfileData profileobj = searchProfileDataList.get(position);
        Log.e("yukmk", "check: " + profileobj);



      /*  holder.rowallnftlayoutBinding.llNft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, NftItemActivity.class));
            }
        });*/
        if (profileobj != null) {


        }
    }


    @Override
    public int getItemCount() {
        return searchProfileDataList == null ? 0 : searchProfileDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private RowSearchProfileLayoutBinding rowSearchProfileLayoutBinding;

        public MyViewHolder(RowSearchProfileLayoutBinding rowSearchProfileLayoutBinding) {
            super(rowSearchProfileLayoutBinding.getRoot());
            this.rowSearchProfileLayoutBinding = rowSearchProfileLayoutBinding;
        }
    }

}

