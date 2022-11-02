package com.agnitomedia.adapers;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.agnitomedia.activity.AllStoryActivity;
import com.agnitomedia.data.AllStoryCategoryData;
import com.agnitomedia.databinding.RowstorycategorylayoutBinding;
import java.util.List;

public class AllStoryListCategoryAdapter extends RecyclerView.Adapter<AllStoryListCategoryAdapter.MyViewHolder> {


   List<AllStoryCategoryData> allStoryCategoryDataList;
    Context context;

    public AllStoryListCategoryAdapter(List<AllStoryCategoryData> allStoryCategoryDataList, Context context) {
        this.allStoryCategoryDataList = allStoryCategoryDataList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(RowstorycategorylayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        AllStoryCategoryData allStoryCategoryData = allStoryCategoryDataList.get(position);
        Log.e("yukmk", "check: " + allStoryCategoryData);
        if (allStoryCategoryData != null) {

            holder.rowstorycategorylayoutBinding.rlCategory.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    context.startActivity(new Intent(context, AllStoryActivity.class));
                 /*  SharedPreferences.Editor editor = AppsContants.sharedpreferences.edit();
                editor.putString(AppsContants.CatId, dataAdapterOBJ.getCat_id());
                        editor.putString(AppsContants.Product_id, productsPogos.get(position).getProduct_id());
                editor.commit();
                context.startActivity(new Intent(context, ShowProductsActivity.class));*/

                    /* if (context instanceof ShowProductsActivity) {
                    ShowProductsActivity.recycler_all_products.setVisibility(View.GONE);
                    //Viewholder.txt_sub_cat_name.setBackground(context.getResources().getDrawable(R.drawable.black_grey_bordershape));
                   // Viewholder.txt_sub_cat_name.setTextColor(context.getResources().getColor(R.color.white));

                    selectedPosition = position;
                    notifyDataSetChanged();
                   // ((ShowProductsActivity)context).ShowProduct(dataAdapterOBJ.getCat_id(),dataAdapterOBJ.getSub_cat_id());

                    ((ShowProductsActivity)context).ShowProduct(dataAdapterOBJ.getChild_cat_id());
                }

            }
        });
*/
                }
            });

        }
    }


    @Override
    public int getItemCount() {
        return allStoryCategoryDataList == null ? 0 : allStoryCategoryDataList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        private RowstorycategorylayoutBinding rowstorycategorylayoutBinding;

        public MyViewHolder(RowstorycategorylayoutBinding rowstorycategorylayoutBinding) {
            super(rowstorycategorylayoutBinding.getRoot());
            this.rowstorycategorylayoutBinding = rowstorycategorylayoutBinding;
        }
    }

}

