package sidikmilati1998gmail.com

import android.content.Intent
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    internal lateinit var username: EditText
    internal lateinit var password: EditText
    internal lateinit var btnLogin: Button
    //berfungsi memberikan nama id dari edit text dan button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //befungsi nantinya untuk menmpilkan hasil keluran pada sebuah class xml pada xlass activity_main
        username = findViewById<View>(R.id.Name) as EditText
        password = findViewById<View>(R.id.sandi) as EditText
        btnLogin = findViewById<View>(R.id.btnLogin) as Button
        //perintah diats berfungsi untuk memnggil nama dari id pada sebuah edit text dan button yang sudah dibuat diatas
        btnLogin.setOnClickListener {
            val usernameKey = username.text.toString()
            val passwordKey = password.text.toString()
            //memberikan tipe data string yang nantinya dapat diinputkan pada kolom username dan password
            if (usernameKey == "sidik" && passwordKey == "165410067") {
                //digunakan untuk memberikan username dan password sehingga pada saat user memasukan seperti yang sudah dibuat akan masuk ke tampilan list dan apabila user slah akan mucul pesat eror
                Toast.makeText(applicationContext, "LOGIN SUKSES",
                    //apabila pada kolom username dan password benar masa akan muncull notive login sukses
                    Toast.LENGTH_SHORT).show()
                val intent = Intent(this@MainActivity, list::class.java)
                this@MainActivity.startActivity(intent)
                //perintah ditas berfungsi sebgaian nantinya pada sebuah class mainactivity nantiny akan dilakuakn sebuah perpindahan antar layout atau dnegan kata lain intet antar activity

                finish()
            } else {
                val builder = AlertDialog.Builder(this@MainActivity)
                builder.setMessage("Username atau Password Anda salah!")
                    .setNegativeButton("Retry", null).create().show()
                //perintah diats berfungsi menmpilkan sebuah notive yaitu username atau password slaah dikarenakan
                //pada kolom username dan password kita slah memsukan sesuai yang sudah dibuat di dalam program
            }
        }

    }

    fun ButtonOnClick(view: View) {
        val intent = Intent(this@MainActivity, register::class.java)
        startActivity(intent)
        //digunakan untuk menmbahkan sebuah action pada sebuah button nantinya botton tersebut mendpatkan fungsi untuk melkukan perpindahan antar halaman activity
        //dengan menmbhakan buttononclik pada program xml dan kemudian dibuat nantinya akan pindah ke activit register
    }

}