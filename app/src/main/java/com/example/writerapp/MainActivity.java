package com.example.writerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = (TextView)findViewById(R.id.text1);
        String para = "Malinga to Thakur, OUT\n" +
                "Mumbai Indians win IPL 2019! Slower ball, yorker on middle, and the leg-side swipe has been missed by the batsman. Malinga appeals, and umpire Menon raises his finger. Was that going down leg side? We'll never know since Raina had used his review. Lasith Malinga has redeemed himself after that 20-run over.\n" +
                "SN Thakur lbw b Malinga 2 (2b 0x4 0x6) SR: 100.00\n" +
                "\n" +
                "What a final this is. CSK need two to win. Mumbai need a dot to win. We need a single for a super over. Quinton de Kock has taken his gloves off. People are praying in the stands. Indians, foreigners, you name it. Rohit has another conversation with Malinga. Guys, we've now gone beyond four hours too, but do we mind? What a game of cricket. Nervous faces everywhere. Deep midwicket and long on in place.\n" +
                "19.5\n" +
                "2\n" +
                "Malinga to Thakur, 2 runs\n" +
                "full toss on leg, and swiped away to deep backward square. Only two. CSK need two off the final ball\n" +
                "\n" +
                "Ankit: \"Ridiculously entertaining match. Comedy of errors.\"\n" +
                "19.4\n" +
                "w\n" +
                "Malinga to Watson, 1 run, OUT\n" +
                "yorker, just outside off, and slapped to deep point. Ball races to the fielder in the deep, and they complete an easy single. But wait.... Watson wants to come back on strike, and he's run out trying to complete the second run! Great throw from the deep, and terrific work from de Kock. New man in now with Chennai still needing four runs in two balls. Dramatic!\n" +
                "SR Watson run out (KH Pandya/†de Kock) 80 (59b 8x4 4x6) SR: 135.59\n" +
                "\n" +
                "CSK need 5 off 3.\n" +
                "19.3\n" +
                "2\n" +
                "Malinga to Watson, 2 runs\n" +
                "yorker, just outside leg, and hammered to wide long on. They come back for the second\n" +
                "\n" +
                "Seven off four balls. Crucial delivery, this.\n" +
                "19.2\n" +
                "1\n" +
                "Malinga to Jadeja, 1 run\n" +
                "low full toss on middle, and drilled back to Malinga. He parries the ball to the leg side, and Jadeja scampers across for one\n" +
                "19.1\n" +
                "1\n" +
                "Malinga to Watson, 1 run\n" +
                "yorker, on leg stump, from around the wicket. Toe-ends the drive to long on\n" +
                "\n" +
                "What could've been 13 off six balls now reads at nine off it. CSK favourites entering the final over. And Malinga is back to bowl. Can he redeem himself?\n" +
                "end of over 199 runs • 1 wicket\n" +
                "CSK: 141/5CRR: 7.42 • RRR: 9.00 • Need 9 runs from 6b\n" +
                "Ravindra Jadeja4 (4)\n" +
                "Shane Watson76 (56)\n" +
                "Jasprit Bumrah4-0-14-2\n" +
                "Krunal Pandya3-0-39-1\n" +
                "18.6\n" +
                "4b\n" +
                "Bumrah to Jadeja, 4 byes\n" +
                "would you believe it? Quinton de Kock has let the ball go for four byes! The South African has let this go through. Back of a length, on off, and QdK can't hold on despite Jadeja missing the cut. Oh dear. CSK need 9 off the final over\n" +
                "\n" +
                "Bumrah's final ball of IPL 2019. CSK need 13. Can they afford to play this ball out with zero risk?\n" +
                "18.5\n" +
                "2\n" +
                "Bumrah to Jadeja, 2 runs\n" +
                "swung away to the leg side but only to McClenaghan at deep midwicket\n" +
                "\n" +
                "Prashanth: \"Let's take a moment and appreciate the Hyderabad ground groundsman for the kind of pitch.. batsman seamers, spinners...everyone has something from this pitch\"\n" +
                "18.4\n" +
                "•\n" +
                "Bumrah to Jadeja, no run\n" +
                "length ball, just outside off, and Jadeja can't play the cut. Through to the keeper and Bumrah gives the batsman a wry smile\n" +
                "\n" +
                "CSK need 15 off 9. Bumrah around the wicket\n" +
                "\n" +
                "Aravinth Subram: \"Nothing other than a super over can do justice to this game!\"\n" +
                "18.3\n" +
                "2\n" +
                "Bumrah to Jadeja, 2 runs\n" +
                "full, just outside off, and he mistimes a slog to fine leg. They run hard, and comfortably complete the second\n" +
                "\n" +
                "Nikhil: \"Request from a CSK and Rohit's captaincy fan: I know it's easy for me to say but MI fans please don't criticize Rohit for this move. At the start of the over I seriously thought this was a great move but sometimes things don't go your way\"\n" +
                "18.2\n" +
                "w\n" +
                "Bumrah to Bravo, OUT\n" +
                "given! Back of a length on off again, and angling in. This ball, nearly 149kph, snakes off the pitch and takes the outside of Bravo's bat as he tries to loft it over cover. QdK ain't missing that, and Ravindra Jadeja walks in at No. 7\n" +
                "DJ Bravo c †de Kock b Bumrah 15 (15b 0x4 1x6) SR: 100.00\n" +
                "\n" +
                "Nilay: \"Catches win matches they said, very well said!!!\"\n" +
                "\n" +
                "Srivatsan : \"Watson is CSK's equivalent of a bitcoin investment. Amazing RoI\"";
        textview.setText(para);
        textview.setMovementMethod(new ScrollingMovementMethod());
    }
}