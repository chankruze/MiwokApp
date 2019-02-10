package in.geekofia.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import in.geekofia.miwokapp.fragments.ColorsFragment;


public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new ColorsFragment()).commit();
    }
}
