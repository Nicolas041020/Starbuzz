package co.edu.unipiloto.starbuzz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MealsCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_meals_category);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> listView,
                                    View view,
                                    int position,
                                    long id){
                if (position==0){
                    Intent intent = new Intent(MealsCategoryActivity.this,BreakfastCategoryActivity.class);
                    startActivity(intent);
                }else if(position==1){
                    Intent intent = new Intent(MealsCategoryActivity.this,SnackCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };

        ListView listView = (ListView) findViewById(R.id.list_meals);
        listView.setOnItemClickListener(itemClickListener);
    }
}