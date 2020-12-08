package com.example.fragmentpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class ScreenSlidePageFragment:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.activity_main, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val visitorPoints=ArrayList<PointsModel>()
        visitorPoints.add(PointsModel("This is my visitor text for faq of visitor"))
        visitorPoints.add(PointsModel("This is my visitor text for faq of visitor"))
        visitorPoints.add(PointsModel("This is my visitor text for faq of visitor"))
        visitorPoints.add(PointsModel("This is my visitor text for faq of visitor"))
        visitorPoints.add(PointsModel("This is my visitor text for faq of visitor"))
        visitorPoints.add(PointsModel("This is my visitor text for faq of visitor"))
        visitorPoints.add(PointsModel("This is my visitor text for faq of visitor"))
        visitorPoints.add(PointsModel("This is my visitor text for faq of visitor"))
        visitorPoints.add(PointsModel("This is my visitor text for faq of visitor"))
        visitorPoints.add(PointsModel("This is my visitor text for faq of visitor"))
        visitorPoints.add(PointsModel("This is my visitor text for faq of visitor"))
        visitorPoints.add(PointsModel("This is my visitor text for faq of visitor"))
        visitorPoints.add(PointsModel("This is my visitor text for faq of visitor"))
        visitorPoints.add(PointsModel("This is my visitor text for faq of visitor"))
        visitorPoints.add(PointsModel("This is my visitor text for faq of visitor"))
        visitorPoints.add(PointsModel("This is my visitor text for faq of visitor"))
        visitorPoints.add(PointsModel("This is my visitor text for faq of visitor"))
        visitorPoints.add(PointsModel("This is my visitor text for faq of visitor"))
        visitorPoints.add(PointsModel("This is my visitor text for faq of visitor"))

        val adapter=MyAdapter(context!!.applicationContext,visitorPoints)

        visitor_Recycler?.layoutManager= LinearLayoutManager(context!!.applicationContext, LinearLayoutManager.VERTICAL,false)
        visitor_Recycler?.adapter=adapter
    }


}