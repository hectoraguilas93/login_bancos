package com.devnight.totalplay.ui.Login


import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.devnight.totalplay.databinding.ActivityMainBinding
import com.devnight.totalplay.ui.Bancos.BancosActivity
import com.devnight.totalplay.ui.Bancos.BancosViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    private lateinit var progressDialog: ProgressDialog


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()


        progressDialog = ProgressDialog(this)


        binding.btnLogin.setOnClickListener {
            viewModel.validationUsers(binding.usuario, binding.password, this)
        }

        viewModel.showBanks.observe(this, Observer {
            val intent = Intent(this, BancosActivity::class.java)
            intent.putExtra("session", it)
            startActivity(intent)
        })



    }
}