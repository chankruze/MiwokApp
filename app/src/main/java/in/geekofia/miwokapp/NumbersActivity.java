package in.geekofia.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one","tatti"));
        words.add(new Word("two","tatti"));
        words.add(new Word("three","tatti"));
        words.add(new Word("four","tatti"));
        words.add(new Word("five","tatti"));
        words.add(new Word("six","tatti"));
        words.add(new Word("seven","tatti"));
        words.add(new Word("eight","tatti"));
        words.add(new Word("nine","tatti"));
        words.add(new Word("ten","tatti"));

//        for (int i = 0; i < words.size(); i++)
//            Log.v("NumbersActivity","Word at index " + i + " : " + words.get(i));

//        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
//
//        for (int i = 0; i < words.size(); i++){
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(i));
//            rootView.addView(wordView);
//        }
        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
