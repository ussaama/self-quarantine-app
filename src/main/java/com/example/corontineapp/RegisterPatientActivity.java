package com.example.corontineapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import com.example.corontineapp.databinding.ActivityRegisterPatientBinding;

import java.util.Calendar;

public class RegisterPatientActivity extends AppCompatActivity {
    ActivityRegisterPatientBinding binding;
    String gender,dateOfBirth;
    DatePickerDialog datePickerDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityRegisterPatientBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String nationality = binding.spinnerNationality.getSelectedItem().toString();
        String province = binding.spinnerState.getSelectedItem().toString();
        String city = binding.spinnerCity.getSelectedItem().toString();
        String name = binding.nameEtxt.getText().toString();
        //Integer phone = Integer.parseInt(binding.phoneEtxt.getText().toString());
        //Integer guardianPhone = Integer.parseInt(binding.guardianphoneEtxt.getText().toString());



        binding.regSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterPatientActivity.this, MainMenuActivity.class);


                startActivity(intent);            }
        });

        //------------DOB Dialogue Code Lambda----------------//
        binding.dob.setOnClickListener(v -> {
            final Calendar c = Calendar.getInstance();
            int mYear = c.get(Calendar.YEAR); // current year
            int mMonth = c.get(Calendar.MONTH); // current month
            int mDay = c.get(Calendar.DAY_OF_MONTH); // current day
            // date picker dialog
            datePickerDialog = new DatePickerDialog(RegisterPatientActivity.this,
                    (view, year, monthOfYear, dayOfMonth) -> {
                        // set year, month and day values in Edit text box
                        dateOfBirth=dayOfMonth + "/" + (monthOfYear + 1) + "/" +
                                year;
                        binding.dob.setText(dateOfBirth);
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        });
        //------------DOB Dialogue Code----------------//


    }


    //------------Gender Radio Button --------//
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.male:
                if (checked)
                    gender="Male";
                break;
            case R.id.female:
                if (checked)
                    gender="Female";
                break;

        }
    }
    //------------Gender Radio Button --------//
}