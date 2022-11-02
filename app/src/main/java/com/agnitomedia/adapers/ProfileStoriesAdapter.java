package com.agnitomedia.adapers;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.agnitomedia.data.ProfileStoriesData;
import com.agnitomedia.databinding.RowProfileStoryLayoutBinding;
import java.util.ArrayList;

public class ProfileStoriesAdapter extends RecyclerView.Adapter<ProfileStoriesAdapter.MyViewHolder> {


    ArrayList<ProfileStoriesData> storiesDataList;
    Context context;

    public ProfileStoriesAdapter(ArrayList<ProfileStoriesData> storiesDataList, Context context) {
        this.storiesDataList = storiesDataList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(RowProfileStoryLayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ProfileStoriesData storyobj = storiesDataList.get(position);
        Log.e("yukmk", "check: " + storyobj);



      /*  holder.rowallnftlayoutBinding.llNft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, NftItemActivity.class));
            }
        });*/
        if (storyobj != null) {


        }
    }


    @Override
    public int getItemCount() {
        return storiesDataList == null ? 0 : storiesDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private RowProfileStoryLayoutBinding rowProfileStoryLayoutBinding;

        public MyViewHolder(RowProfileStoryLayoutBinding rowProfileStoryLayoutBinding) {
            super(rowProfileStoryLayoutBinding.getRoot());
            this.rowProfileStoryLayoutBinding = rowProfileStoryLayoutBinding;
        }
    }

}

