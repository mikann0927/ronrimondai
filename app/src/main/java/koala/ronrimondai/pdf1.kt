package koala.ronrimondai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.joanzapata.pdfview.PDFView
import kotlinx.android.synthetic.main.activity_pdf1.*

class pdf1 : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf1)

        supportActionBar!!.hide()

        val adView = AdView(this)
        adView.adSize = AdSize.BANNER
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        val pdfView = findViewById<PDFView>(R.id.pdfview)
        pdfView.fromAsset("q1.pdf")
            .defaultPage(1)
            .showMinimap(false)
            .enableSwipe(true)
            .load()

        a1.setOnClickListener {

            val pdfView = findViewById<PDFView>(R.id.pdfview)
            pdfView.fromAsset("a1.pdf")
                .defaultPage(1)
                .showMinimap(false)
                .enableSwipe(true)
                .load()

            q1.setOnClickListener {

                val pdfView = findViewById<PDFView>(R.id.pdfview)
                pdfView.fromAsset("q1.pdf")
                    .defaultPage(1)
                    .showMinimap(false)
                    .enableSwipe(true)
                    .load()
            }
        }
    }
}