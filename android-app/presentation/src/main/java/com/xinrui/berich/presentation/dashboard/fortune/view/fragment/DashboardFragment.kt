package com.xinrui.berich.presentation.dashboard.fortune.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.xinrui.berich.R
import com.xinrui.berich.presentation.dashboard.fortune.view.DashboardViewModel
import com.xinrui.berich.presentation.dashboard.fortune.view.adapter.FundListAdapter
import com.xinrui.berich.presentation.dashboard.fortune.model.FundModel
import com.xinrui.berich.presentation.dashboard.fortune.view.FundListView

class DashboardFragment : Fragment(), FundListView {

    companion object {
        fun newInstance() = DashboardFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewManager = LinearLayoutManager(this.context)
        val viewAdapter = this.context?.let {
            FundListAdapter(
                buildData(),
                it
            )
        }

        val fragementView = inflater.inflate(R.layout.dashboard_fragment, container, false)
        fragementView!!.findViewById<RecyclerView>(R.id.my_recycler_view).apply {
            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            setHasFixedSize(true)
            // use a linear layout manager
            layoutManager = viewManager
            // specify an viewAdapter (see also next example)
            adapter = viewAdapter
        }
        return fragementView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //should show applicational page
    }

    private fun buildData(): List<FundModel> {
        val first = FundModel("first", "001", "001")
        val second = FundModel("second", "002", "002")
        val third = FundModel("third", "003", "003")
        return listOf<FundModel>(first, second, third)
    }

    override fun renderFundList() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}
