package com.app.hasnain.sample.mvvmdihilt.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.app.hasnain.sample.mvvmdihilt.R
import com.app.hasnain.sample.mvvmdihilt.databinding.ActivityMainBinding
import com.app.hasnain.sample.mvvmdihilt.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        mainViewModel.loadUser();
        mainViewModel.user.observe(this){
            user->
            binding.user=user
        }

        if (savedInstanceState==null){
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,SampleFragment())
                .commit()
        }
    }
}