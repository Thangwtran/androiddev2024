package vn.edu.usth.usthweather;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ForcastFragment extends Fragment {

    public ForcastFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       // View view = inflater.inflate(R.layout.fragment_forcast, container, false);

        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setBackgroundColor(Color.parseColor("#32a852"));
        linearLayout.setOrientation(LinearLayout.VERTICAL);


        TextView day = new TextView(getContext());
        day.setText(R.string.thursday);
        day.setTextSize(50);
        day.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
        day.setTextColor(Color.parseColor("#000000"));

        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.ic_weather);
        imageView.setPadding(16,16,16,16);

        linearLayout.addView(day);
        linearLayout.addView(imageView);
        return linearLayout;
    }
}