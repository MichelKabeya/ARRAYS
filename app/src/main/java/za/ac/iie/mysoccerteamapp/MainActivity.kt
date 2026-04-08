package za.ac.iie.mysoccerteamapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val teams = arrayOf<String>(
        "Lionel Messi",
        "Xavi Hernandez",
        "Andres Iniesta",
        "Johan Cruyff, ",
        "Sergio Busquets"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // creating a variable to hold the textView
        val teamText = findViewById<TextView>(R.id.teamdisplay)
        // displaying array items in textView
        // assigned position 0 of team array to a new value
        teams[0]= "Lionee Messi :)"
        










        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}