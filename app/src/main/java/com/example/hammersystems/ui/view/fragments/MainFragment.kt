package com.example.hammersystems.ui.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hammersystems.R
import com.example.hammersystems.databinding.MainFragmentBinding
import com.example.hammersystems.ui.view.adapter.CategoryRecyclerAdapter
import com.example.hammersystems.ui.view.adapter.PromoutionRecyclerAdapter

class MainFragment : Fragment(R.layout.main_fragment) {

    private var _binding: MainFragmentBinding? = null
    private val binding get() =_binding!!

    private lateinit var categoryRecyclerAdapter: CategoryRecyclerAdapter
    private lateinit var promoutionRecyclerAdapter: PromoutionRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = MainFragmentBinding.inflate(inflater, container, false)
        val view = binding.root
        categoryRecyclerAdapter = CategoryRecyclerAdapter()
        promoutionRecyclerAdapter = PromoutionRecyclerAdapter()
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.categoriesRecycler.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.HORIZONTAL, false)
        binding.categoriesRecycler.adapter = categoryRecyclerAdapter

        binding.promotionsRecycler.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.HORIZONTAL, false)
        binding.promotionsRecycler.adapter = promoutionRecyclerAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}