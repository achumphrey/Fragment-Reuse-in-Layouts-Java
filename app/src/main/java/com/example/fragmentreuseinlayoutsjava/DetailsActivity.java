package com.example.fragmentreuseinlayoutsjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class DetailsActivity extends AppCompatActivity {

    static final String DESCID = "detailDescID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // The fragment instance is created by retrieving the reference from
        // the layout's Fragment tag using the FragmentManager. Same can be
        // achieved by calling the constructor of the fragment if this option
        // was not available.
        FragmentManager fragmentManager = getSupportFragmentManager();
        DescriptionDetailsFragment newDescDetailFrag =
                (DescriptionDetailsFragment) fragmentManager
                .findFragmentById(R.id.fragmentDescDetail);

        int detaildescID = getIntent().getIntExtra(DESCID, 0);
        newDescDetailFrag.setDetailDescId(detaildescID);
    }
}
