package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Spinner
import android.widget.TextView

class TextSizeAdapter(_context: Context, _numberArray: Array<Int>) : BaseAdapter() {

    private val context = _context
    private val numberArray = _numberArray
    override fun getCount(): Int {
        return numberArray.size
    }

    override fun getItem(position: Int): Any {
        return numberArray[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView : TextView
        if(convertView != null){
            textView = convertView as TextView
        }
        else{
            textView = TextView(context)
            textView.textSize = 22f
            textView.setPadding(5, 10, 0, 10)
        }
        textView.text = numberArray[position].toString()
        textView.textSize = 22f
        textView.setPadding(5, 10, 0, 10)

        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView : TextView
        if(convertView != null){
            textView = convertView as TextView
        }
        else{
            textView = TextView(context)
        }
        textView.text = numberArray[position].toString()
        textView.textSize = numberArray[position].toFloat()
        textView.setPadding(5, 10, 0, 10)

        return textView
    }

}