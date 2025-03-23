package co.edu.unipiloto.starbuzz;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BreakfastActivity extends AppCompatActivity {

    public static final String EXTRA_BREAKFASTID = "breakfastId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_breakfast);

        int breakfastId = (Integer)getIntent().getExtras().get(EXTRA_BREAKFASTID);
        Breakfast breakfast = Breakfast.breakfasts[breakfastId];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(breakfast.getName());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(breakfast.getDescription());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(breakfast.getImageResourceId());
        photo.setContentDescription(breakfast.getName());
    }
}