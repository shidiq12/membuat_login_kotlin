package sidikmilati1998gmail.com
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class list : AppCompatActivity() {
    internal lateinit var list: ListView
    internal var maintitle = arrayOf("Bilal ", "Danang", "Dion ", "Anton ", "sidik ", "Man ", "Mikael", "Zakie ")
    //memberikan title dari sebuah daftar pada sebuah list view
    internal var subtitle = arrayOf("165410097", "165410049", "165410062", "165410093", "165410067", "165410095", "1654100102", "165410102")
    //membrikan nama sub yang nantinya berada dibwah main title
    internal var subtitle1 = arrayOf("bilalridwan@gmail.com", "danangsgj@gmail.com", "dionfeb12@gmail.com", "antoniusjonatan@gmail.com", "sidikmilati1998@gmail.com", "emanuelkroe1@gmail.com", "mikaeldinito@gmail.com", "zakieal@gmail.com")
    //membrikan nama yang berda dibawah subtitle
    internal var imgid = arrayOf(R.drawable.tm1, R.drawable.tm2, R.drawable.tm3, R.drawable.tm4, R.drawable.tm5, R.drawable.tm6, R.drawable.tm7, R.drawable.tm9)

    //menmbil nama gambar yang sudah dimasukan yang berdapa pada menu drwable dimana nama yang diambil sesuai nama ypada drawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        val adapter = MyAdapter(this, maintitle, subtitle, subtitle1, imgid)
        //perintah diatas dimana berdungsi untuk menmpilkan nantinya apa saja yang akan dimasukan pada halaman list dseperti maintitle subtitltle dan img ig yang berfungsi sebagain gambar
        list = findViewById<View>(R.id.list) as ListView
        list.adapter = adapter
        list.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            //menmpilkan list dengan cara melkukan pemggilan pada sebua id list
            if (position == 0) {
                Toast.makeText(applicationContext, "nama saya bilal", Toast.LENGTH_SHORT).show()
            } else if (position == 1) {
                Toast.makeText(applicationContext, "nama saya danang", Toast.LENGTH_SHORT).show()
            } else if (position == 2) {
                Toast.makeText(applicationContext, "nama saya dion", Toast.LENGTH_SHORT).show()
            } else if (position == 3) {
                Toast.makeText(applicationContext, "nama saya anton", Toast.LENGTH_SHORT).show()
            } else if (position == 4) {
                Toast.makeText(applicationContext, "nama saya sidik", Toast.LENGTH_SHORT).show()
            } else if (position == 5) {
                Toast.makeText(applicationContext, "nama saya emanuel", Toast.LENGTH_SHORT).show()
            } else if (position == 6) {
                Toast.makeText(applicationContext, "nama saya mikael", Toast.LENGTH_SHORT).show()
            } else if (position == 7) {
                Toast.makeText(applicationContext, "nama saya zakie", Toast.LENGTH_SHORT).show()
            }
            fun button2(view: View) {
                val intent = Intent(this@list, MainActivity::class.java)
                startActivity(intent)}}}}