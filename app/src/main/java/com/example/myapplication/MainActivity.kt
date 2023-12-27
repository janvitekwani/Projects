package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton:Button= findViewById(R.id.roll_button);
        rollbutton.text="Let's Roll";
        rollbutton.setOnClickListener{
            diceroll()
    }
}

          fun diceroll()
                 {
                     val image: ImageView = findViewById(R.id.diceimage)
                     val randomnumber= Random().nextInt(6)+1
                     val drawableresource = when(randomnumber)
                     {
                         1->R.drawable.dice_1
                         2-> R.drawable.dice_4
                         3->R.drawable.dice_3
                         4->R.drawable.dice_4
                         5->R.drawable.dice_5
                         else-> R.drawable.dice_6
                    }

                     image.setImageResource(drawableresource) // this setimageResources set the image to the image view


                 }
    }



/*-------------------------------------------------------------------------------------------------------------------
#  when is just like the switch function in java

# Understanding **setonclicklistener** and **onclick** two approaches to click on the button
  for set on clicklistener in java we have to pass an annymous class

 */
