package com.example.pil_hello_world.mvp.model

import com.example.pil_hello_world.mvp.contract.MainContract

class CountModel : MainContract.Model {
    private var count = 0
    override fun getCount(): String = count.toString()
    override fun increase(acc: Int) {
        count += acc
    }

    override fun decrease(acc: Int) {
        count -= acc
    }

    override fun reset() {
        count = 0
    }
}