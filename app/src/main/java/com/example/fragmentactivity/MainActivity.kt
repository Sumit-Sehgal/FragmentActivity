package com.example.fragmentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fragmentactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var fragmentInterface: FragmentInterface
    lateinit var binding: ActivityMainBinding
    var i=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn.setOnClickListener {
            i++
            fragmentInterface.FragmentInterface()
            var alertDialog=AlertDialog.Builder(this)
            alertDialog.setTitle("Color")
            alertDialog.setMessage("Choose Color from following")
            alertDialog.setPositiveButton("Red"){_,_->
            binding.frag.setBackgroundResource(R.color.red)
            }
            alertDialog.setNegativeButton("Blue"){_,_->
                binding.frag.setBackgroundResource(R.color.blue)
            }
            alertDialog.setNeutralButton("Green"){_,_->
                binding.frag.setBackgroundResource(R.color.green)
            }
            alertDialog.show()
        }

    }
}


