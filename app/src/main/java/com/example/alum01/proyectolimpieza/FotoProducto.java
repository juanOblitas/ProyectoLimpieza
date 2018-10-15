package com.example.alum01.proyectolimpieza;

import android.content.Context;
import android.content.Intent;
import android.graphics.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class FotoProducto extends AppCompatActivity {
    private static Context context = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_producto);
        context = getApplicationContext();
    }
    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
    //startActivityForResult(intent, CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);

    public static Camera getCameraInstance(){
        Camera c = null;
        try {
            int id = 2;
            //c = Camera.open(id);
        }
        catch (Exception e){
            Toast.makeText(context,R.string.errorcam,Toast.LENGTH_SHORT);
            // Camera is not available (in use or does not exist)
        }
        return c; // returns null if camera is unavailable
    }
}
