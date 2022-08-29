package androidStudio.com.Lab3PuzzleGame.Time;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidStudio.com.Lab3PuzzleGame.PuzzleImage.MainPuzzleLayout;
import androidStudio.com.Lab3PuzzleGame.R;

public class PuzzleTime extends AppCompatActivity {


    Button button;


    @Override
    public void onCreate(Bundle savedInstanceState) {






        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle_time);




        button = (Button) findViewById(R.id.play_again_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });



    }
    public void openNewActivity(){
        Intent intent = new Intent(this, MainPuzzleLayout.class);
        startActivity(intent);






    }







}