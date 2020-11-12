package wen.chuan.activity54;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import wen.chuan.activity54.Main2Activity;
import wen.chuan.activity54.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void GOTOA(View view) {

        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

}

