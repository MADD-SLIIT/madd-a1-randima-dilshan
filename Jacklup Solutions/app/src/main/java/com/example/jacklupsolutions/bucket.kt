class BucketActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bucket)

        // Access the BottomNavigationView
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        // Set the second icon (Bucket) as selected
        bottomNavigationView.selectedItemId = R.id.nav_bucket

        // Set up listeners to handle item selections
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    // Navigate to Home screen
                    startActivity(Intent(this, HomeActivity::class.java))
                    true
                }
                R.id.nav_bucket -> {
                    // Stay on this screen since it's already the active page
                    true
                }
                R.id.nav_profile -> {
                    // Navigate to Profile screen
                    startActivity(Intent(this, ProfileActivity::class.java))
                    true
                }
                else -> false
            }
        }
    }
}
