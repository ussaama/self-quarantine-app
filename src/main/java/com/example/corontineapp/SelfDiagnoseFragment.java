package com.example.corontineapp;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import com.example.corontineapp.databinding.FragmentSelfDiagnoseBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SelfDiagnoseFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SelfDiagnoseFragment extends Fragment {
    private FragmentSelfDiagnoseBinding binding;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SelfDiagnoseFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SelfDiagnoseFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SelfDiagnoseFragment newInstance(String param1, String param2) {
        SelfDiagnoseFragment fragment = new SelfDiagnoseFragment();
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
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSelfDiagnoseBinding.inflate(inflater, container, false);
        View view = binding.getRoot();



        return view;

        //return inflater.inflate(R.layout.fragment_self_diagnose, container, false);
    }
    //------------Fever Radio Button --------//

    //------------Fever Radio Button --------//
//    //------------Cough Radio Button --------//
//    public void onRadioButtonClicked(View view) {
//        // Is the button now checked?
//        boolean checked = ((RadioButton) view).isChecked();
//
//        // Check which radio button was clicked
//        switch(view.getId()) {
//            case R.id.male:
//                if (checked)
//                    gender="Male";
//                break;
//            case R.id.female:
//                if (checked)
//                    gender="Female";
//                break;
//
//        }
//    }
//    //------------Cough Radio Button --------//
//    //------------sore Throat Radio Button --------//
//    public void onRadioButtonClicked(View view) {
//        // Is the button now checked?
//        boolean checked = ((RadioButton) view).isChecked();
//
//        // Check which radio button was clicked
//        switch(view.getId()) {
//            case R.id.male:
//                if (checked)
//                    gender="Male";
//                break;
//            case R.id.female:
//                if (checked)
//                    gender="Female";
//                break;
//
//        }
//    }
//    //------------sore Throat Radio Button --------//
//    //------------short breath Radio Button --------//
//    public void onRadioButtonClicked(View view) {
//        // Is the button now checked?
//        boolean checked = ((RadioButton) view).isChecked();
//
//        // Check which radio button was clicked
//        switch(view.getId()) {
//            case R.id.male:
//                if (checked)
//                    gender="Male";
//                break;
//            case R.id.female:
//                if (checked)
//                    gender="Female";
//                break;
//
//        }
//    }
//    //------------short breath Radio Button --------//
}