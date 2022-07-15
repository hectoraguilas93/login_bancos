package com.devnight.totalplay.ui.Bancos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.devnight.totalplay.R
import com.devnight.totalplay.adapters.BancosAdapter
import com.devnight.totalplay.databinding.ActivityBancosBinding

class BancosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBancosBinding
    private val viewModel: BancosViewModel by viewModels()

    private lateinit var sessionValue: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBancosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setTitle("Referencias bancarias")

        val xtras = intent.extras
        if (xtras != null)
            sessionValue = xtras.getString("session").toString()


        viewModel.createRecycler(sessionValue)
        viewModel.setList.observe(this) {
            binding.recycler.layoutManager = LinearLayoutManager(this)
            binding.recycler.adapter = it?.let {  lista -> BancosAdapter(context = this, list = lista) }
        }


    }
}