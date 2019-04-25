package sg.edu.rp.c346.p02_ps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lvholiday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvholiday = findViewById(R.id.lv1);

        String[] values = new String[]{"Secular", "Ethnic & Religion"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);

        lvholiday.setAdapter(adapter);

        lvholiday.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(getBaseContext(), secularlv.class);
                    lvholiday.getContext().startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(getBaseContext(), ethnic.class);
                    lvholiday.getContext().startActivity(intent);
                }

            }
        });
    }
}

