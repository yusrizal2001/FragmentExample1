package id.ac.polbeng.yusrizal.fragmentexample1

import android.media.metrics.PlaybackStateEvent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import kotlinx.android.synthetic.main.book_titles.*

class BookTitle: Fragment(), View.OnLongClickListener {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.book_titles, container, false)
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        rlas3.setOnLongClickListener(this)
        rlas3kotlin.setOnLongClickListener(this)
        rminandroid.setOnLongClickListener(this)
    }
    override fun onClick(view: View?){
        var index:Int = 0
        when(view?.id) {
            R.id.rlas3->{
                index = 0
            }
            R.id.rlas3kotlin-> {
                index = 1
            }
            R.id.rminandroid-> {
                index = 2
            }
        }
    }
}