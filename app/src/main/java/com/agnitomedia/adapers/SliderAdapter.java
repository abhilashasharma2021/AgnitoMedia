package com.agnitomedia.adapers;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.agnitomedia.R;
import com.agnitomedia.data.SliderItemData;
import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.SliderAdapterVH> {

    private Context context;
    List<SliderItemData> dataAdapters;

    public SliderAdapter(List<SliderItemData> getDataAdapter, Context context) {
        this.context = context;
        this.dataAdapters = getDataAdapter;
    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_slider_layout_item, null);
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, final int position) {
//        final SliderItemData dataAdapterOBJ = dataAdapters.get(position);
        if (position == 0) {
            Glide.with(context).load(context.getResources().getDrawable(R.drawable.bgnew)).into(viewHolder.imageViewBackground);
        } else if (position==1){
            Glide.with(context).load(context.getResources().getDrawable(R.drawable.bgg)).into(viewHolder.imageViewBackground);
        }
        else if (position==2){
            Glide.with(context).load(context.getResources().getDrawable(R.drawable.bgg)).into(viewHolder.imageViewBackground);
        }
      /*  if (dataAdapterOBJ != null) {





        }*/
    }


    @Override
    public int getCount() {
        //slider view count could be dynamic size
       // return dataAdapters.size();
        return 2;
    }

    class SliderAdapterVH extends ViewHolder {

        View itemView;
        ImageView imageViewBackground;

        public SliderAdapterVH(View itemView) {
            super(itemView);
              imageViewBackground = itemView.findViewById(R.id.ivSlide);

        }
    }
}

