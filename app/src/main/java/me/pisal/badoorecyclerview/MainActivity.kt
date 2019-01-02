package me.pisal.badoorecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import me.pisal.badoorecyclerview.adapter.BDAdapter
import me.pisal.badoorecyclerview.custom.ui.BDItemDecorator
import me.pisal.badoorecyclerview.model.User
import me.pisal.badoorecyclerview.service.UserSevice

class MainActivity : AppCompatActivity() {

    private var users: ArrayList<User>? = null

    lateinit var userAdapter: BDAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()
        initData()
    }

    //region init
    private fun initData(){
        users = UserSevice.getUsers()
        updateUI()
    }
    private fun initUI(){
        val lm = StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL)
        rcl.layoutManager = lm
        userAdapter = BDAdapter()
        val itemDecorator = BDItemDecorator(resources.getDimensionPixelOffset(R.dimen.default_item_space))
        rcl.addItemDecoration(itemDecorator)
        rcl.adapter = userAdapter
    }

    private fun updateUI(){
        //user recycler view
        if (users != null) {
            userAdapter.models = users!!
        }
    }
    //endregion
}
