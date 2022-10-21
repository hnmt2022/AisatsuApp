package jp.techacademy.hiromi.nomoto.aisatsuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.TimePickerDialog
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*





class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }


    override fun onClick(v: View) {

       showTimePickerDialog()

    }


    //showtimepickerdialogの時間を設定（セット）したときのリスナーを登録する
    //イベントリスナーonTimeSet()⇒時刻がセットされたときに行う動作
    //関数パラメータ経由で渡される

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                //時刻が選択される度にコールされるリスナー関数
                //hour minuteという変数に代入される
                //時、分をtimepickerdialogのインスタンスからhourとminuteで取得する

                if (hour >= 2 && hour < 10) {

                    textView.text = "おはよう"


                } else if (hour >= 10 && hour < 18) {
                    textView.text = "こんにちは"

                } else {
                    textView.text = "こんばんは"
                }

            }, 13, 0, true)

             timePickerDialog.show()
        





    }



}