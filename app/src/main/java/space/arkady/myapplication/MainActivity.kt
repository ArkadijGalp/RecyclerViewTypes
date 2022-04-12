package space.arkady.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import space.arkady.myapplication.presentation.recycler.AdapterUnited
import space.arkady.myapplication.presentation.recycler.ViewModels

class MainActivity : AppCompatActivity() {

    private val viewModel = ViewModels()
    private val adapter by lazy { AdapterUnited() }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        initView()
        initObserver()
    }


    private fun initView() {
        recycler.adapter = adapter
    }

    private fun initObserver() {
        viewModel.data.observe(this) { items ->
            adapter.submitList(items)
        }
    }
}