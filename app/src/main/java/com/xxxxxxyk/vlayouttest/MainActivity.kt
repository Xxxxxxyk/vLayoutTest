package com.xxxxxxyk.vlayouttest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.alibaba.android.vlayout.DelegateAdapter
import com.alibaba.android.vlayout.VirtualLayoutManager
import com.alibaba.android.vlayout.layout.GridLayoutHelper
import com.alibaba.android.vlayout.layout.LinearLayoutHelper
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private var adapters = ArrayList<DelegateAdapter.Adapter<RecyclerView.ViewHolder>>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var layoutManager = VirtualLayoutManager(this)
        rl_list.layoutManager = layoutManager

        var recyclerPool = RecyclerView.RecycledViewPool()
        recyclerPool.setMaxRecycledViews(0, 10)
        rl_list.recycledViewPool = recyclerPool

        var delegateAdapter = DelegateAdapter(layoutManager, true)
        rl_list.adapter = delegateAdapter

        adapters.add(MainBannerAdapter(this@MainActivity, LinearLayoutHelper(), 1))

        adapters.add(MainAdapter(this@MainActivity, LinearLayoutHelper(), 1, VirtualLayoutManager.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 50)))

        adapters.add(MainAdapter(this@MainActivity, GridLayoutHelper(2), 8, VirtualLayoutManager.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 300)))

        adapters.add(MainAdapter(this@MainActivity, LinearLayoutHelper(), 1, VirtualLayoutManager.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 50)))

        adapters.add(MainAdapter(this@MainActivity, GridLayoutHelper(2), 4, VirtualLayoutManager.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 900)))

        adapters.add(MainAdapter(this@MainActivity, LinearLayoutHelper(), 1, VirtualLayoutManager.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 50)))

        adapters.add(MainAdapter(this@MainActivity, GridLayoutHelper(2), 4, VirtualLayoutManager.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 300)))

        adapters.add(MainAdapter(this@MainActivity, LinearLayoutHelper(), 1, VirtualLayoutManager.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 50)))

        adapters.add(MainAdapter(this@MainActivity, GridLayoutHelper(2), 4, VirtualLayoutManager.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 300)))

        adapters.add(MainAdapter(this@MainActivity, LinearLayoutHelper(), 1, VirtualLayoutManager.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 50)))

        adapters.add(MainAdapter(this@MainActivity, GridLayoutHelper(2), 4, VirtualLayoutManager.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 300)))

        adapters.add(MainAdapter(this@MainActivity, LinearLayoutHelper(), 1, VirtualLayoutManager.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 50)))

        adapters.add(MainAdapter(this@MainActivity, GridLayoutHelper(2), 4, VirtualLayoutManager.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 300)))

        adapters.add(MainAdapter(this@MainActivity, LinearLayoutHelper(), 1, VirtualLayoutManager.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 50)))

        adapters.add(MainAdapter(this@MainActivity, GridLayoutHelper(2), 4, VirtualLayoutManager.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 300)))




        delegateAdapter.setAdapters(adapters)

    }
}
