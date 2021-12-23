package fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.kitxvari.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.navigation)

        val controller = findNavController(R.id.navigation)
        val appBarConfig = AppBarConfiguration(
            setOf
            (R.id.kitxvebiFragment,
             R.id.pasuxebiFragment))

        setupActionBarWithNavController(controller, appBarConfig)
        bottomNavigationView.setupWithNavController(controller)
    }
}