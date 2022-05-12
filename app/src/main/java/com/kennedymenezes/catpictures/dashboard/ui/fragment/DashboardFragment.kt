package com.kennedymenezes.catpictures.dashboard.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.kennedymenezes.catpictures.R
import com.kennedymenezes.catpictures.dashboard.data.response.ImageResponse
import com.kennedymenezes.catpictures.dashboard.ui.adapter.ImagesAdapter
import com.kennedymenezes.catpictures.dashboard.ui.viewmodel.DashboardViewModel
import com.kennedymenezes.catpictures.databinding.DashboardFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class DashboardFragment : Fragment(R.layout.dashboard_fragment) {

    private val viewModel: DashboardViewModel by viewModel()
    private lateinit var binding: DashboardFragmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = DashboardFragmentBinding.bind(view)
        setupObservers()
        viewModel.getCatsImg()
    }

    private fun setupObservers(){
        viewModel.catsList.observe(viewLifecycleOwner){
            handleCatsResponse(it)
        }
    }

    private fun handleCatsResponse(imageResponse: ImageResponse){
        binding.pbMainLoading.visibility = View.GONE
        binding.rvMainList.layoutManager = GridLayoutManager(requireContext(), 4)
        binding.rvMainList.adapter = ImagesAdapter(imageResponse.data)
    }

}