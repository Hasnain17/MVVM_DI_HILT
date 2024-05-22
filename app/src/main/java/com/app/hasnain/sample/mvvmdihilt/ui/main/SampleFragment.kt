package com.app.hasnain.sample.mvvmdihilt.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.app.hasnain.sample.mvvmdihilt.R
import com.app.hasnain.sample.mvvmdihilt.databinding.FragmentSampleBinding
import com.app.hasnain.sample.mvvmdihilt.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SampleFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
@AndroidEntryPoint
class SampleFragment : BaseFragment<FragmentSampleBinding>() {

    private val sampleViewModel:SampleViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): FragmentSampleBinding {
        return FragmentSampleBinding.inflate(inflater,container,false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sampleViewModel.loadData()
        sampleViewModel.data.observe(viewLifecycleOwner){
            data ->
            binding.data=data
        }
    }
}