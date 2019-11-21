package com.example.thirdassignment.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.thirdassignment.R;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    EditText etName, etAge, etAddress;
    RadioGroup rgGender;
    RadioButton rMale, rFemale, rOther;
    String name, age, address;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        etName = root.findViewById(R.id.eName);
        etAge = root.findViewById(R.id.eAge);
        etAddress = root.findViewById(R.id.eAddress);
        rgGender = root.findViewById(R.id.radioGroup);
        rMale = root.findViewById(R.id.rbMale);
        rFemale = root.findViewById(R.id.rbFemale);
        rOther = root.findViewById(R.id.rbOther);



        dashboardViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}