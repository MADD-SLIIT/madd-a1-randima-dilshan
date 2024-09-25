import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        // Set up the default fragment
        if (savedInstanceState == null) {
            loadFragment(HomeFragment())
        }

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            var selectedFragment: Fragment? = null
            when (item.itemId) {
                R.id.navigation_home -> selectedFragment = HomeFragment()
                R.id.navigation_explore -> selectedFragment = ExploreFragment()
                R.id.navigation_bucket -> selectedFragment = BucketFragment()
                R.id.navigation_profile -> selectedFragment = ProfileFragment()
            }
            selectedFragment?.let { loadFragment(it) }
            true
        }
    }

    // Helper function to load the selected fragment
    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment, fragment)
            .commit()
    }
}
