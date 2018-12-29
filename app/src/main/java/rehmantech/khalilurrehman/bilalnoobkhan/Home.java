package rehmantech.khalilurrehman.bilalnoobkhan;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    private static final String TAG = "bilalApp";

    TextView teamAscore,teamBscore;
    Button teamA1pointer,teamA2pointer,teamA5pointer,teamAPanelty,teamB1pointer,teamB2pointer,teamB5pointer,teamBPanelty;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //team A data
        teamAscore = findViewById(R.id.teamAscore);
        teamA1pointer = findViewById(R.id.teamA1pointer);
        teamA2pointer = findViewById(R.id.teamA2pointer);
        teamA5pointer = findViewById(R.id.teamA5pointer);
        teamAPanelty = findViewById(R.id.teamApanelty);

        //team B data
        teamBscore = findViewById(R.id.teamBscore);
        teamB1pointer = findViewById(R.id.teamB1pointer);
        teamB2pointer = findViewById(R.id.teamB2pointer);
        teamB5pointer = findViewById(R.id.teamB5pointer);
        teamBPanelty = findViewById(R.id.teamBpanelty);


        teamA1pointer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentScore = Integer.parseInt(teamAscore.getText().toString());
                currentScore +=1;
                teamAscore.setText(String.valueOf(currentScore));
            }
        });

        teamA2pointer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentScore = Integer.parseInt(teamAscore.getText().toString());
                currentScore +=2;
                teamAscore.setText(String.valueOf(currentScore));
            }
        });

        teamA5pointer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentScore = Integer.parseInt(teamAscore.getText().toString());
                currentScore +=5;
                teamAscore.setText(String.valueOf(currentScore));
            }
        });

        teamAPanelty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentScore = Integer.parseInt(teamAscore.getText().toString());
                currentScore -=3;
                if (currentScore>0){
                    teamAscore.setText(String.valueOf(currentScore));
                }else{
                    teamAscore.setText(String.valueOf(0));
                }

            }
        });

        teamB1pointer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentScore = Integer.parseInt(teamBscore.getText().toString());
                currentScore +=1;
                teamBscore.setText(String.valueOf(currentScore));
            }
        });

        teamB2pointer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentScore = Integer.parseInt(teamBscore.getText().toString());
                currentScore +=2;
                teamBscore.setText(String.valueOf(currentScore));
            }
        });

        teamB5pointer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentScore = Integer.parseInt(teamBscore.getText().toString());
                currentScore +=5;
                teamBscore.setText(String.valueOf(currentScore));
            }
        });

        teamBPanelty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentScore = Integer.parseInt(teamBscore.getText().toString());
                currentScore -=3;
                if (currentScore<=0){
                    currentScore=0;
                }
                teamBscore.setText(String.valueOf(currentScore));

            }
        });

    }
}
