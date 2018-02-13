package tw.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Utilisateur on 06/02/2018.
 */

public class McDonald extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mcdopage);
    }

    public void page1(View v){
        startActivity(new Intent(this, McDonald.class));
    }
}
