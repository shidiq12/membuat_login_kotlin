package sidikmilati1998gmail.com

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter//perintah diats digunakan sebagain class ang nantinya digunkan untuk menmpilkan hasil dari setip kluran yang mana pada clas tersebut nantiny
//akan digunakan untuk menmpilkan data pada sebuah list pada kelas list
    (private val context: Activity, private val maintitle: Array<String>, private val subtitle: Array<String>, private val subtitle1: Array<String>, private val imgid: Array<Int>)//mendeskripsikan nama setiap kelas dan beserta tipe data
    : ArrayAdapter<String>(context, R.layout.activity_my_adapter, maintitle) {
    //mendeksripsikan nama dan title sub dan img id

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        //digunakan untuk menmpilkan hasil dari sebuah classadpater yang akna diurutkan berdarkan tampilan
        val rowView = inflater.inflate(R.layout.activity_my_adapter, null, true)
        //menampilkan hasil dari sebuah class xml my adapter
        val titleText = rowView.findViewById<View>(R.id.title) as TextView
        //nama dari titele yang berada diatas pada setiap list
        val imageView = rowView.findViewById<View>(R.id.icon) as ImageView
        //menmpilkn gambar yang akan ditampilkan pada list
        val subtitleText = rowView.findViewById<View>(R.id.subtitle) as TextView
        //berisi ketrangan pada gambra setiap daftar list
        val subtitle1Text = rowView.findViewById<View>(R.id.subtitle1) as TextView
        titleText.text = maintitle[position]
        //berfungsi sebgai urutan dari setiap class main title diman apda maintitle urutan ke 1
        imageView.setImageResource(imgid[position])
        //kemudian pada img urutan ke 2 pada list nantinya
        subtitleText.text = subtitle[position]
        subtitle1Text.text = subtitle1[position]
        return rowView


    }
}