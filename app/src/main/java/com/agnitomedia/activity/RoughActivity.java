package com.agnitomedia.activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.agnitomedia.R;
import com.agnitomedia.adapers.VideoAdapter;
import com.agnitomedia.data.VideoData;
import java.util.ArrayList;
import java.util.List;

public class RoughActivity extends AppCompatActivity {
ImageView ivSetting,ivCancel;
RelativeLayout rlVisibleSetting;
TextView textView;
ImageView ivBack;

    List<VideoData> videoDataList =new ArrayList<>();
    VideoAdapter adapter;
    RecyclerView rvVideo;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rough);
    /*    rvVideo=findViewById(R.id.rvVideo);
        rvVideo.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);

*/
        /*textView=findViewById(R.id.textView);
        ivBack=findViewById(R.id.ivBack);
        ReadMoreTextView readMoreTextView = new ReadMoreTextView();
        textView.setText(getResources().getString(R.string.dummy_text));
        readMoreTextView.setTextView(textView);
        readMoreTextView.setMaximumLine(2);
        readMoreTextView.setCollapseText("See Less");
        readMoreTextView.setExpandText("... See More");
        readMoreTextView.setColorCode("#FFFFFF");
        readMoreTextView.setReadMore();

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });*/
       /* ivSetting=findViewById(R.id.ivSetting);
        ivCancel=findViewById(R.id.ivCancel);
        rlVisibleSetting=findViewById(R.id.rlVisibleSetting);
        ivCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                rlVisibleSetting.setVisibility(View.GONE);
            }
        });

        ivSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rlVisibleSetting.setVisibility(View.VISIBLE);
            }
        });*/

      //  show_Video();
    }

    private  void show_Video(){
        VideoData data=new VideoData("Satyam Mishra","100K","10.5K", "400","120","","Tanishq Singh aka Paradox | Hustle 2.0",R.drawable.real,R.drawable.dummy);
        for (int i = 0; i <4 ; i++) {
            videoDataList.add(data);
        }
        adapter = new VideoAdapter(videoDataList,getApplicationContext());
        rvVideo.setAdapter(adapter);
    }
}