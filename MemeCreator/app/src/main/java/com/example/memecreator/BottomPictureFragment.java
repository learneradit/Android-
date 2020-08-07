package com.example.memecreator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.widget.TextView;

import org.w3c.dom.Text;

public class BottomPictureFragment extends Fragment {

    private static TextView topMemeText;
    private static TextView bottomMemeText;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_resource_fragment, container, false);
        topMemeText=(TextView) view.findViewById(R.id.topMemeText);
        bottomMemeText=(TextView) view.findViewById(R.id.bottomMemeText);
        return view;
    }

    public void setMemeText(String top,String bottom)
    {
        topMemeText.setText(top);
        bottomMemeText.setText(bottom);
    }
}



