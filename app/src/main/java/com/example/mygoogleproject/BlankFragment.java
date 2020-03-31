package com.example.mygoogleproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private TextView tv ;
    private int i;
    private String monTxt;

    public BlankFragment() {
        // Required empty public constructor
        i = 0;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragment newInstance(String param1, String param2) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            //mParam1 = getArguments().getString(ARG_PARAM1);
            //mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        i++;
        tv = view.findViewById(R.id.textView);
        // Pour analyser le cycle de vie du fragment, on rajoute des logs
        Log.w("TAG","BlankFragment.onCreateView() : " + i);
        return view;
    }

    public void onResume(){
        super.onResume();
        Log.v("TAG", "BlankFragment.onResume()");
    }

    public void onPause(){
        super.onPause();
        Log.v("TAG", "BlankFragment.onPause()");
    }

    public void onDestroyView() {
        super.onDestroyView();
        Log.v("TAG", "BlankFragment.onDestroyView()");
    }

    public void rafraichirEcran() {
        tv.setText(monTxt);
    }

    public void setMonText(String monText) {
        this.monTxt = monText;
    }
}
