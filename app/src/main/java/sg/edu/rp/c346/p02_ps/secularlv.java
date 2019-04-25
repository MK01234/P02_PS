package sg.edu.rp.c346.p02_ps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class secularlv extends AppCompatActivity {
    ListView lvsecular;
    ArrayAdapter aa;
    ArrayList<holidays> holidays;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secular);
        lvsecular = this.findViewById(R.id.lv3);
        holidays = new ArrayList<>();
        holidays.add(new holidays("New Year", true, "01/01/2017"));
        holidays.add(new holidays("Labour day", true, "01/05/2017"));
        aa = new MyListAdapter(this, R.layout.secularlv, holidays);
        lvsecular.setAdapter(aa);



        lvsecular.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {

                    Toast.makeText(getApplicationContext(), "Place Your First Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 1) {

                    Toast.makeText(getApplicationContext(), "Place Your Second Option Code", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}











