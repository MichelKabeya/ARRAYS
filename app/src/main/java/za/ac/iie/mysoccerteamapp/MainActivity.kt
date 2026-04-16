package za.ac.iie.mysoccerteamapp

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Arrays

// create a fonction to find the shortest string in an array of strings
fun getShortestString(arr:Array<String>):String{
    var shortestLength = 0
    var shortestElement = ""
    for (element in arr){
        if (element.length < shortestLength){
            shortestLength = element.length
            shortestElement = element
        }
    }
    return shortestElement
}
// log the content of an array of strings
fun logArrayValues(arr:Array<String>, limit:Int = 0) {
    if (limit == 0) {
        Log.v("Array Values", arr.toString())
    }else
        Log.v("Array Values", Arrays.toString(
            arr.sliceArray(0..limit - 1)
        ))
}

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
        // call the method to find the shortest string in the array
        var shortestName = getShortestString(teams)
        Log.v("Shortest Name", shortestName)
        // creating a variable to hold the textView
        val teamText = findViewById<TextView>(R.id.teamdisplay)
        // assigned position 0 of team array to a new value
        teams[0]= "Lionee Messi :)"

        // call the method to log values
        logArrayValues(teams)
        logArrayValues(teams, 3)


        //assigned array content to  a variable
        var teamdisplay= ""
//            teamdisplay += "${teams[0]}\n"
//            teamdisplay += "${teams[1]}\n"
//            teamdisplay += "${teams[2]}\n"
//            teamdisplay += "${teams[3]}\n"
//            teamdisplay += "${teams[4]}\n"
//      var count = 0
        //FOR loop to loop to the array and display all its values
        for (team in teams){
            teamdisplay += "${teams}\n"
        }
//)
//        while (count < 5){
//            teamdisplay += "${teams[count]}\n"
//            count++
//        }
        // displaying all the content of the array
        teamText.text= teamdisplay








        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}