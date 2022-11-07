package edu.miu.mdp.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Date

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submit.setOnClickListener{view ->
            var alertDialog = AlertDialog.Builder(this);
            alertDialog.setTitle("Result")
            alertDialog.setMessage(Date().toString() + " \nYour score is 50%")
            alertDialog.setPositiveButton("Ok") {dialogInterface, which ->
                dialogInterface.dismiss()
                finish()
            };
            alertDialog.setNegativeButton("Cancel") {dialogInterface, which ->
                dialogInterface.dismiss()
            }

            alertDialog.create().show();
        };
    }
}