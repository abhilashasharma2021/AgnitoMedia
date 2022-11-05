package com.agnitomedia.activity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.agnitomedia.MainActivity;
import com.agnitomedia.databinding.ActivitySignUpBinding;
import com.agnitomedia.utils.InternetConnection.InternetConnectionInterface;
import com.agnitomedia.utils.InternetConnection.InternetConnectivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUpActivity extends AppCompatActivity {
    ActivitySignUpBinding binding;
    String stMobile="",stEmail="",stPassword="",stName="",stConPass="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String text = "Already have an account?<font color=#2CA6E9> Log In</font>";
        binding.txLogin.setText(Html.fromHtml(text), TextView.BufferType.SPANNABLE);
        binding.txLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUpActivity.this, WelcomeActivity.class));
            }
        });
        binding.btSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUpActivity.this, MainActivity.class));
            }
        });

       /* binding.btSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stMobile = binding.etMobile.getText().toString();
                stEmail = binding.etEmail.getText().toString();
                stPassword = binding.etPass.getText().toString();
                stName = binding.etName.getText().toString();
                stConPass = binding.etConfrmPass.getText().toString();



                if (validation()) {

                    if (!validateEmailAddress(stEmail)) {
                        Toast.makeText(SignUpActivity.this, "Invalid Email", Toast.LENGTH_SHORT).show();
                    }

                    else {
                        InternetConnectionInterface connectivity = new InternetConnectivity();
                        if (connectivity.isConnected(getApplicationContext())) {

                            sendData(stEmail, stName, stMobile, stPassword, stConPass);
                        } else {
                            Toast.makeText(SignUpActivity.this, "Please check internet connection", Toast.LENGTH_SHORT).show();
                        }
                    }

                }

                else {
                    validation();
                }

            }

        });*/

    }
    private Boolean validation() {

        Boolean boolen = false;
        if (binding.etEmail.getText().toString().isEmpty()) {
            binding.etEmail.setError("Valid Email Address Must Required");

        } else if (binding.etName.getText().toString().isEmpty()) {
            binding.etName.setError("Name Must Required");

        } else if (binding.etPass.getText().toString().isEmpty()) {
            binding.etPass.setError("Password Must Required");

        }
        else if (binding.etMobile.getText().toString().isEmpty()) {
            binding.etMobile.setError("Valid Mobile Number Must Required");

        }

        else if (stMobile.length()<10) {
            binding.etMobile.setError("Mobile Number length must be 10 is required ");

        }


        else if (stPassword.length()<4) {
            binding.etPass.setError("The Password must be at least 4 characters in length");

        }
        else if (!stConPass.equals(stPassword)){
            binding.etConfrmPass.setError("Password And Confirm Password Must Same");
        }
        else if (stConPass.length()<4) {
            binding.etConfrmPass.setError("The Confirm Password must be at least 4 characters in length");

        }
        else {
            boolen = true;

        }
        return boolen;
    }
    public static boolean validateEmailAddress(String stEmail) {
        Pattern pattern;
        Matcher matcher;
        final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(stEmail);
        return matcher.matches();
    }




    private void sendData(String stEmail, String stName, String stMobile, String stPassword, String stConPass){

    }
}