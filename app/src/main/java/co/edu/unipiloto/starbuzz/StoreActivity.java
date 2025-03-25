package co.edu.unipiloto.starbuzz;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StoreActivity extends AppCompatActivity {

    public static final String EXTRA_STOREID = "storeId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_store);

        int breakfastId = (Integer)getIntent().getExtras().get(EXTRA_STOREID);
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