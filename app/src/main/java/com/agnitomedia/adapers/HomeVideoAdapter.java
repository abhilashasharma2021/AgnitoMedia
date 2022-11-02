package com.agnitomedia.adapers;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.agnitomedia.R;
import com.agnitomedia.data.HomeVideoData;
import com.agnitomedia.databinding.RowhomevideolayoutBinding;
import com.example.readmoretextview.ReadMoreTextView;
import java.util.List;

public class HomeVideoAdapter extends RecyclerView.Adapter<HomeVideoAdapter.MyViewHolder> {


   List<HomeVideoData> homeVideoDataList;
    Context context;

    public HomeVideoAdapter(List<HomeVideoData> homeVideoDataList, Context context) {
        this.homeVideoDataList = homeVideoDataList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(RowhomevideolayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        HomeVideoData videoObj = homeVideoDataList.get(position);
        Log.e("yukmk", "check: " + videoObj);
        ReadMoreTextView readMoreTextView = new ReadMoreTextView();
        holder.rowhomevideolayoutBinding.textView.setText(context.getResources().getString(R.string.dummy_text));
        readMoreTextView.setTextView( holder.rowhomevideolayoutBinding.textView);
        readMoreTextView.setMaximumLine(2);
        readMoreTextView.setCollapseText("...See Less");
        readMoreTextView.setExpandText("...See More");
        readMoreTextView.setColorCode("#2CA6E9");
        readMoreTextView.setReadMore();
        if (videoObj != null) {


        }
    }


    @Override
    public int getItemCount() {
        return homeVideoDataList == null ? 0 : homeVideoDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private RowhomevideolayoutBinding rowhomevideolayoutBinding;

        public MyViewHolder(RowhomevideolayoutBinding rowhomevideolayoutBinding) {
            super(rowhomevideolayoutBinding.getRoot());
            this.rowhomevideolayoutBinding = rowhomevideolayoutBinding;
        }
    }

}

