package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {
   lateinit var diceimage : ImageView    // lateinit is keyword ensure that some value will be assign it will not left null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
     // val diceimage : ImageView    if we declare it here it will be accessable within this function oncreate therefore we declare it out side to make it acessable out of function
        val rollbutton:Button
        rollbutton = findViewById(R.id.roll_button)
        rollbutton.text="Let's Roll"
          diceimage = findViewById(R.id.diceimage)
        rollbutton.setOnClickListener{
            diceroll()
    }
}

          fun diceroll()
                 {  // this very expensive operation because for this u have to everytime check view heirachy -> using field instead
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

                     diceimage.setImageResource(drawableresource) // this setimageResources set the image to the image view


                 }
    }



/*-------------------------------------------------------------------------------------------------------------------
#  when is just like the switch function in java

# Understanding **setonclicklistener** and **onclick** two approaches to click on the button
  for set on clicklistener in java we have to pass an annymous class

 */
/*  ----------------------------------------------------------------------------------------------------------------------------------------
# what actually gradle so in android apps
   . what devices run your apps
   . compile to executable
   . dependency management
   . app sigining for google play
   . running automated test

# let's understand basics of gradle
 when u click on run button a series of command runs on the gradle such as
 compile your source code , your dependencies, any associated resources into
 android application package or APK is run, it is file format use dto run and
 distrubute and install android app

 # project contains two types of gradle files
 build.gradle(project)  there's a single gradle file for project wide build settings
 build.gradle(module:app) then there is a specific gradle file for each module of your project
      module : are the collections of source files and resources for a discrete piece of functionality
        of application
        . right now u only have one module by default but u may have more than one module when u make larger applications



vector drawables :
       cannot be used for apk version below 21 , so for this png files are created
       for lower verison but this can increase apps size and use lots of data of user

       therefore we have androidX vector support gradle files  androidX is used for (jetcompose file ) which are helpful to increase
       compatibility
        */