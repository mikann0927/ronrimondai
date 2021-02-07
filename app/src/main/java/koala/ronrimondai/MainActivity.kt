package koala.ronrimondai

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_main.*

//広告ID ca-app-pub-2444364213094953/4588700246
//tテスト広告　ca-app-pub-3940256099942544/6300978111

class MainActivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this) {}

        val adView = AdView(this)
        adView.adSize = AdSize.BANNER
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        Q1.setOnClickListener {
            val intent = Intent(this, pdf1::class.java)
            startActivity(intent)
        }

        Q2.setOnClickListener {
            val intent = Intent(this, pdf2::class.java)
            startActivity(intent)
        }

        Q3.setOnClickListener {
            val intent = Intent(this, pdf3::class.java)
            startActivity(intent)
        }

        Q4.setOnClickListener {
            val intent = Intent(this, pdf4::class.java)
            startActivity(intent)
        }

        Q5.setOnClickListener {
            val intent = Intent(this, pdf5::class.java)
            startActivity(intent)
        }

        Q6.setOnClickListener {
            val intent = Intent(this, pdf6::class.java)
            startActivity(intent)
        }

        Q7.setOnClickListener {
            val intent = Intent(this, pdf7::class.java)
            startActivity(intent)
        }

    }
}