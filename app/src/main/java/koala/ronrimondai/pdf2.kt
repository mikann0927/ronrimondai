package koala.ronrimondai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdView
import com.joanzapata.pdfview.PDFView
import kotlinx.android.synthetic.main.activity_pdf2.*

class pdf2 : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf2)

        supportActionBar!!.hide()

        val pdfView = findViewById<PDFView>(R.id.pdfview)
        pdfView.fromAsset("q2.pdf")
            .defaultPage(1)
            .showMinimap(false)
            .enableSwipe(true)
            .load()

        a2.setOnClickListener {

            val pdfView = findViewById<PDFView>(R.id.pdfview)
            pdfView.fromAsset("a2.pdf")
                .defaultPage(1)
                .showMinimap(false)
                .enableSwipe(true)
                .load()

            q2.setOnClickListener {

                val pdfView = findViewById<PDFView>(R.id.pdfview)
                pdfView.fromAsset("q2.pdf")
                    .defaultPage(1)
                    .showMinimap(false)
                    .enableSwipe(true)
                    .load()
            }
        }
    }
}