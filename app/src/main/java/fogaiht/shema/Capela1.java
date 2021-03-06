package fogaiht.shema;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by thiag on 20/01/2017.
 */
public class Capela1 extends AppCompatActivity {

    ListView listView;

//    @Override
//    public void onBackPressed()
//    {
//        startActivity(new Intent(getBaseContext(), Sabado.class));
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_capela);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list_day);

        // Defined Array values to show in ListView
        String[] values = new String[]{"16:00\n\nMomento Cura e Libertação\n\nMaísa\nAcompanha: Ministério Ágape\n",
                "17:00\n\nAdoração e Louvor\n\nCamila Max\n",
                "18:00\n\nEncerramento\n",
                "","Santíssimo com a equipe de Intercessão até as 21h."
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (position == 0) {
//                    startActivity(new Intent(getBaseContext(), Capela1.class));
//                } else if (position == 1) {
//                    startActivity(new Intent(getBaseContext(), Sabado.class));
//                } else if (position == 2) {
//                    startActivity(new Intent(getBaseContext(), Sabado.class));
//                } else if (position == 3) {
//                    startActivity(new Intent(getBaseContext(), Capela1.class));
//                } else if (position == 4) {
//                    startActivity(new Intent(getBaseContext(), Sabado.class));
//                }
//            }
//        });
    }
}