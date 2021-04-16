package com.anand.kotlinmvvmtask.ui.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.anand.kotlinmvvmtask.R
import com.anand.kotlinmvvmtask.data.model.TracksApiResponse
import com.anand.kotlinmvvmtask.databinding.FragmentInfoBinding
import com.anand.kotlinmvvmtask.utility.Utility.loadImage


class InfoFragment : Fragment() {
    private lateinit var binding:FragmentInfoBinding
    private lateinit var data:TracksApiResponse.Result

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_info, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val b=arguments
        data = b?.getSerializable("data") as TracksApiResponse.Result
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bind = FragmentInfoBinding.bind(view)
        binding=bind
        bindView();
    }

    private fun bindView() {
        binding.track.text=data.trackName
        binding.image.loadImage(data.artworkUrl100)
        binding.collection.text=data.collectionName
        binding.artist.text=data.artistName
        binding.price.text="$"+data.trackPrice
    }
}