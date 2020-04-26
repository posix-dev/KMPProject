package uptop.me.kmpproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import createApplicationScreenMessage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainText.text = createApplicationScreenMessage()
    }
}
