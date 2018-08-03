package pyarishayyari.sunda.com.swipeimageinandroid;

import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    SwipAdapter swipAdapter;
    ImageView left_arrow, right_arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        left_arrow = findViewById(R.id.left_arrow);
        right_arrow = findViewById(R.id.right_arrow);
        viewPager = findViewById(R.id.view_pager);
        swipAdapter = new SwipAdapter(this);
        viewPager.setAdapter(swipAdapter);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                left_arrow.setVisibility(View.GONE);
                right_arrow.setVisibility(View.GONE);
            }
        }, 2000);
    }
}
