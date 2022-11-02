package com.agnitomedia.adapers;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.agnitomedia.R;
import com.agnitomedia.data.HomeNftData;
import com.agnitomedia.databinding.RowhomenftlayoutBinding;
import com.example.readmoretextview.ReadMoreTextView;
import java.util.ArrayList;

public class HomeNftFAdapter extends RecyclerView.Adapter<HomeNftFAdapter.MyViewHolder> {


    ArrayList<HomeNftData> homeNftDataList;
    Context context;

    public HomeNftFAdapter(ArrayList<HomeNftData> homeNftDataList, Context context) {
        this.homeNftDataList = homeNftDataList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(RowhomenftlayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        HomeNftData nftobj = homeNftDataList.get(position);
        Log.e("yukmk", "check: " + nftobj);
        ReadMoreTextView readMoreTextView = new ReadMoreTextView();
        holder.rowhomenftlayoutBinding.textView.setText(context.getResources().getString(R.string.dummy_text));
        readMoreTextView.setTextView( holder.rowhomenftlayoutBinding.textView);
        readMoreTextView.setMaximumLine(2);
        readMoreTextView.setCollapseText("...See Less");
        readMoreTextView.setExpandText("...See More");
        readMoreTextView.setColorCode("#2CA6E9");
        readMoreTextView.setReadMore();
        if (nftobj != null) {


        }
    }


    @Override
    public int getItemCount() {
        return homeNftDataList == null ? 0 : homeNftDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private RowhomenftlayoutBinding rowhomenftlayoutBinding;

        public MyViewHolder(RowhomenftlayoutBinding rowhomenftlayoutBinding) {
            super(rowhomenftlayoutBinding.getRoot());
            this.rowhomenftlayoutBinding = rowhomenftlayoutBinding;
        }
    }

}

