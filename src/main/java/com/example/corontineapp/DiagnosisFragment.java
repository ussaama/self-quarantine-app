package com.example.corontineapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.corontineapp.databinding.FragmentDiagnosisBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DiagnosisFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DiagnosisFragment extends Fragment {
    private FragmentDiagnosisBinding binding;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DiagnosisFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DiagnosisFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DiagnosisFragment newInstance(String param1, String param2) {
        DiagnosisFragment fragment = new DiagnosisFragment();
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
        FragmentTransaction transaction = getParentFragmentManager().beginTransaction();

        // Inflate the layout for this fragment
        binding = FragmentDiagnosisBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        binding.diagnoseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction.replace(R.id.fragmentContainer, new SelfDiagnoseFragment());
                transaction.commit();
            }
        });

        binding.diaghistoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction.replace(R.id.fragmentContainer, new DiagnoseHistoryFragment());
                transaction.commit();
            }
        });

        return view;

        //return inflater.inflate(R.layout.fragment_diagnosis, container, false);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}