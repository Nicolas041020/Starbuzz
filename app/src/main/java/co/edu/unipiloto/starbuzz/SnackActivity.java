package co.edu.unipiloto.starbuzz;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SnackActivity extends AppCompatActivity {

    public static final String EXTRA_SNACKID = "snackId";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_snack);

        int snackId =(Integer)getIntent().getExtras().get(EXTRA_SNACKID);
        Snack snack = Snack.snacks[snackId];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(snack.getName());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(snack.getDescription());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(snack.getImageResourceId());
        photo.setContentDescription(snack.getName());
    }
}