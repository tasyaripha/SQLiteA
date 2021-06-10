package com.example.sqlitea;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EditTeman extends AppCompatActivity {
    TextView idText;
    EditText edNama, edTelpon;
    Button editBtn;
    String id, nm, tlp, namaEd, telponEd;
    int sukses;

    private static String url_update = "http://10.0.2.2/umyTI/updatetm.php";
    private static final String TAG = EditTeman.class.getSimpleName();
    private static final String TAG_SUCCES = "success";

}
