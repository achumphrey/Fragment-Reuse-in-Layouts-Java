package com.example.fragmentreuseinlayoutsjava;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DescriptionListFragment extends ListFragment {

    private DescriptionListener listener;

    public DescriptionListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_description_list, container, false);

         String[] titlesList = new String[Descriptions.DESCRIPTIONS_ARRAY.length];

         for (int i = 0; i < titlesList.length; i++){
             titlesList[i] = Descriptions.DESCRIPTIONS_ARRAY[i].getName();
         }

        @SuppressWarnings("unchecked")
        ArrayAdapter adapter = new ArrayAdapter(inflater.getContext(),
                android.R.layout.simple_list_item_1,
                titlesList);

         setListAdapter(adapter);

        // Inflate the layout for this fragment

      //  return super.onCreateView(inflater, container, savedInstanceState);
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        // The Activity that will attach this fragment must
        // implement this interface.
        if (context instanceof DescriptionListener) {
            listener = (DescriptionListener) context;
        } else {
            throw new RuntimeException(context.toString() +
                    "must implement MainActivity.DescriptionListener");
        }
    }

    // The itemClickListener method for each row on the list.
    @Override
    public void onListItemClick(@NonNull ListView l,
                                @NonNull View v,
                                int position,
                                long id) {
        super.onListItemClick(l, v, position, id);

        if (listener != null)
            listener.onItemClicked((int)id);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        listener = null;
    }

    // The interface that any Activity must implement
    // in order to interact with this fragment.
    interface DescriptionListener {
        void onItemClicked(int id);
    }

}
