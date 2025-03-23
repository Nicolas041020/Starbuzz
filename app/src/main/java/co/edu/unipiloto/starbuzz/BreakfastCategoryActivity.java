package co.edu.unipiloto.starbuzz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BreakfastCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_breakfast_category);

        ArrayAdapter<Breakfast> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Breakfast.breakfasts);

        ListView listDrinks = (ListView) findViewById(R.id.list_breakfast);
        listDrinks.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> listDrinks,
                                    View itemView,
                                    int position,
                                    long id){
                Intent intent = new Intent(BreakfastCategoryActivity.this,BreakfastActivity.class);
                intent.putExtra(BreakfastActivity.EXTRA_BREAKFASTID, (int) id);
                startActivity(intent);

            }
        };
        listDrinks.setOnItemClickListener(itemClickListener);
    }

}