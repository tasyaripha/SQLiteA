package com.example.sqlitea;

import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class TambahTeman extends AppCompatActivity {
    private EditText editNama, editTelon;
    private Button simpanBtn;
    String nm,tlp;
    int success;

    private static String url_insert = "http://10.0.2.2/umyTI/tambahtm.php";
    private static final String TAG = TambahTeman.class.getSimpleName();
    private static final String TAG_SUCCES = "success";
}
