package com.droidmarvin.materialdesignbottomsheet;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout bottomsheetlayout;
    private BottomSheetBehavior bottomSheetBehavior;
    private ImageView imgshare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomsheetlayout = (LinearLayout) findViewById(R.id.bottomsheet);
        imgshare = (ImageView) findViewById(R.id.shareimg);
        bottomSheetBehavior = BottomSheetBehavior.from(bottomsheetlayout);
        //State hidden
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);

        //State Collapsed
       // bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        //State expanded
       // bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
        imgshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Show BottomSheet
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });

    }
}
