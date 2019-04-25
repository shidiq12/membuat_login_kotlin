package sidikmilati1998gmail.com


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun btn(view: View) {
        val intent = Intent(this@register, MainActivity::class.java)
        startActivity(intent)
        //brisi perintah yang digunakan sebgaian perintah pada sebuah button yang mana nantinya digunakan untuk kembali dri halaman regitrasi ke halam utama yaitu ke halaman login
    }
}
