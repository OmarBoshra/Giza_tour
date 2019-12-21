package com.example.acer.myguide;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.TextView;

public class viewinfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        ImageView image = findViewById(R.id.mainimg);
        TextView name = findViewById(R.id.name);
        TextView place = findViewById(R.id.place);

        int dpsize = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 55, this.getResources().getDisplayMetrics());
        int spsize = (int) (dpsize / this.getResources().getDisplayMetrics().scaledDensity);

        image.setImageResource(getIntent().getExtras().getInt("imag"));
        name.setText(getIntent().getExtras().getString("name"));
        SpannableString add = new SpannableString(getResources().getString(R.string.Address));
        add.setSpan(new android.text.style.StyleSpan(Typeface.BOLD_ITALIC), 0, add.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        add.setSpan(new AbsoluteSizeSpan(spsize), 0, add.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);


        place.setText(TextUtils.concat(add, "\n\n", getIntent().getExtras().getString("address")));
    }
}
