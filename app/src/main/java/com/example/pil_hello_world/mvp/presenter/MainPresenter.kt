package com.example.pil_hello_world.mvp.presenter

import com.example.pil_hello_world.mvp.contract.MainContract

class MainPresenter(private val model: MainContract.Model, private val view: MainContract.View) :
    MainContract.Presenter {
    init {
        view.onClickIncreaseButton { onClickIncreaseButton() }
        view.onClickDecreaseButton { onClickDecreaseButton(model.getCount()) }
    }

    override fun onClickIncreaseButton() {
        model.increase()
        view.setCount(model.getCount())
    }

    override fun onClickDecreaseButton(count: String) {

    }


}