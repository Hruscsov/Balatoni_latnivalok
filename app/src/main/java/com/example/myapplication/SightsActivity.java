/*package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SightsActivity extends AppCompatActivity {

    private static final String LOG_TAG = SightsActivity.class.getName();
    private FirebaseUser user;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sights);
        mAuth = FirebaseAuth.getInstance();

        user = FirebaseAuth.getInstance().getCurrentUser();

        if(user != null) {
            Log.d(LOG_TAG, "Authenticated user!");
        } else {
            Log.d(LOG_TAG, "Unauthenticated user!");
            finish();
        }
    }
}*/


package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;



public class SightsActivity extends AppCompatActivity {
    private static final String LOG_TAG = SightsActivity.class.getName();
    private FirebaseUser user;
    private FirebaseAuth mAuth;


    ImageView kep;
    ImageView kep2;
    ImageView kep3;
    TextView cim;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sights);
        kep = findViewById(R.id.festetics);
        kep2 = findViewById(R.id.szigliget);
        kep3 = findViewById(R.id.badacsony);
        cim = findViewById(R.id.balaton);
        mAuth = FirebaseAuth.getInstance();
        // mAuth.signOut();
        user = FirebaseAuth.getInstance().getCurrentUser();

        if(user != null) {
            Log.d(LOG_TAG, "Authenticated user!");
        } else {
            Log.d(LOG_TAG, "Unauthenticated user!");
            finish();
        }

        Animation animation = AnimationUtils.loadAnimation(SightsActivity.this, R.anim.zoomin);
        Animation animation2 = AnimationUtils.loadAnimation(SightsActivity.this, R.anim.righttoleft);
        Animation animation3 = AnimationUtils.loadAnimation(SightsActivity.this, R.anim.fadein);
        cim.startAnimation(animation3);
        kep.startAnimation(animation);
        kep2.startAnimation(animation);
        kep3.startAnimation(animation);
    }
}
