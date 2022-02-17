package ramonfraijo.practica4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)

        val button: Button = findViewById(R.id.btnStart)

        button.setOnClickListener{
            var intent:Intent=Intent(this, RegisterPage::class.java)
            startActivity(intent)
        }

    }
}