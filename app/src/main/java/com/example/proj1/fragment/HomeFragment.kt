package com.example.proj1.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel

import com.example.proj1.R
import com.example.proj1.adapter.PopularAdapter
import com.example.proj1.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding:FragmentHomeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageList=ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.one, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.two, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.three, ScaleTypes.FIT))
        val imageSlider=binding.imageSlider
        imageSlider.setImageList(imageList)
        imageSlider.setImageList(imageList , ScaleTypes.FIT)
        imageSlider.setItemClickListener(object:ItemClickListener{
            override fun doubleClick(position: Int) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(position: Int) {
                val itemPosition=imageList[position]
                val itemMessage="Selected Image $position"
                Toast.makeText(requireContext(),itemMessage,Toast.LENGTH_SHORT).show()
            }
        })
        val foodName=listOf("Burger","Sandwich","Momo","Noodles")
        val Price= listOf("$10","$5","$8","$50")
        val popularFoodImages=listOf(R.drawable.menu1,R.drawable.menu2,R.drawable.menu3,R.drawable.menu4)
  val adapter=PopularAdapter(foodName,Price,popularFoodImages)
        binding.PopularRecyclerView.layoutManager=LinearLayoutManager(requireContext())
        binding.PopularRecyclerView.adapter=adapter
    }

    companion object {



    }
}