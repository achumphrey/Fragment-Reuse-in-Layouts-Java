package com.example.fragmentreuseinlayoutsjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements
        DescriptionListFragment.DescriptionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onItemClicked(int id) {

        // The fragmentContainer represents the FrameLayout tag in the Layout.
        // It is only available in the layouts used by larger screen sizes. We
        // need to check if it is not null then decide to replace the container
        // or start another activity to display the detail information.
        View fragmentContainer = findViewById(R.id.fragmentContainer);

        if (fragmentContainer != null){

            // Create an instance of the fragment via the constructor. Another way to
            // get the instance is from the Fragment tag in the layout which has the class
            // statically attached through the name attribute of the Fragment tag.
            DescriptionDetailsFragment newDetailFragment = new DescriptionDetailsFragment();

            newDetailFragment.setDetailDescId(id);

            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.fragmentContainer, newDetailFragment);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }else {

            Intent intent = new Intent(this, DetailsActivity.class);
            intent.putExtra(DetailsActivity.DESCID, id);
            startActivity(intent);
        }

    }
}
