package br.com.tramalho.xmlfont;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewProgId;
    private TextView textViewProgIdStyles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewProgId = findViewById(R.id.text_view_prog_id);
        textViewProgIdStyles = findViewById(R.id.text_view_prog_id_styles);

        Typeface lobsterTwo = ResourcesCompat.getFont(this, R.font.lobster_two_font_family);

        textViewProgId.setTypeface(lobsterTwo, Typeface.NORMAL);
        textViewProgIdStyles.setTypeface(lobsterTwo, Typeface.BOLD_ITALIC);
    }

    public void showAnotherAct(View view) {
        startActivity(new Intent(this, AnotherActivity.class));
    }
}
