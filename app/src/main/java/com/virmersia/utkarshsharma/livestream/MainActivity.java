package com.virmersia.utkarshsharma.livestream;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    Button   mButton;
    EditText mEdit;
    String Urlpath;
    private SphericalVideoPlayer vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button)findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

                // vp = (SphericalVideoPlayer) findViewById(R.id.spherical_video_player);

                //  vp.setVideoURIPath(Urlpath);

                startit();


            }
        });
    }

    public String Urlparse() {

        return Urlpath;
    }
    public void  startit()
    {
        mEdit   = (EditText)findViewById(R.id.editText);
        Urlpath=mEdit.getText().toString();
        System.out.print(Urlpath);
        Intent hello = new Intent(this,SphericalPlayerActivity.class);
        startActivity(hello);
    }
}
