package com.example.adam.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


     EditText wordsToWriteEditText;
     Button wordCountButton;
     TextView countNumDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.wordsToWriteEditText = findViewById(R.id.Input_Text);
        this.wordCountButton = findViewById(R.id.Word_Count);
        this.countNumDisplay = findViewById(R.id.Number_Display);

        Log.d("MainActivity", "OnCreate called");

        //define wordCounter = new WordCounter();


    }


/*    public void onButtonClicked(View button){
       String wordsToWriteEditText = editText.getText().toString();
       Log.d ("WordCounter", "Count these words : " + textToScan + "");

       int countNumDisplay = WordCounter.getCount(textToScan);

       textView.setText(Integer.toString(countNumDisplay) + "words entered");

 */








}
