package devapp.lanze.loginlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import devapp.lanze.loginlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewRegister.setOnClickListener(this)

    }

    override fun onClick(view: View) {
       if(view.id == R.id.textView_register){
           changeActivityForSingup()
       }
    }

    private fun changeActivityForSingup() {
        val intent = Intent(this, SingupActivity::class.java)
        startActivity(intent)
    }


}