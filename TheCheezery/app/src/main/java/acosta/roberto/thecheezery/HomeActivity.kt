package acosta.roberto.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var intent = Intent(this, ProductsActivity::class.java)


        button_cold_drinks.setOnClickListener{
            intent.putExtra("Type", "coldDrinks")
            startActivity(intent)


        }

        button_hot_drinks.setOnClickListener{
            intent.putExtra("Type", "hotDrinks")
            startActivity(intent)
        }

        button_salties.setOnClickListener{
            intent.putExtra("Type", "salties")
            startActivity(intent)
    }
        button_sweets.setOnClickListener{
            intent.putExtra("Type", "sweets")
            startActivity(intent)
        }
    }
}
