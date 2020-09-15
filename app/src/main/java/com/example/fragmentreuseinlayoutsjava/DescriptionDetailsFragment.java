package com.example.fragmentreuseinlayoutsjava;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DescriptionDetailsFragment extends Fragment {

    // This fragment will display a different instance of the object
    // based on the row (id) on the list that is clicked. The object
    // is inside an Array which index corresponds to the row (id) on
    // the list.
    private int detailDescId;


    public DescriptionDetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // This will be null when the app is first lauched.
        if (savedInstanceState != null){
            detailDescId = savedInstanceState.getInt("detailDescId");
        }
    }

    // To preserve the id when orientation changes
    // usually called after onPause() and before onDestroy().
    @Override
    public void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putLong("detailDescID", detailDescId);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_description_details,
                container,
                false);
    }

    // The details will be populated in the view after the parent
    // view has been created in the onCreateView() method but before
    // onResume() is called for user visibility and interactions.
    @Override
    public void onStart() {
        super.onStart();

        View view = getView();

        if (view != null){
            Descriptions description = Descriptions.DESCRIPTIONS_ARRAY[detailDescId];

            TextView title = view.findViewById(R.id.txTitle);
            TextView desc = view.findViewById(R.id.txDesc);
            ImageView imgV = view.findViewById(R.id.imgCat);

            title.setText(description.getName());
            desc.setText(description.getDesc());
            imgV.setImageResource(description.getImage());
            imgV.setContentDescription(description.getName());
        }
    }

    // This will set the id on the list or index in the array
    // to retrieve the object instance from the array.
    public void setDetailDescId(int id){
        this.detailDescId = id;
    }

}
