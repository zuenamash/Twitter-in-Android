package zuu.com.twitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterAdapter  (var twitter_list_items:List<Twitter>):
    RecyclerView.Adapter<TwitterViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitterViewHolder {
            var itemView=LayoutInflater.from(parent.context)
                .inflate(R.layout.twitter_list_items,parent,false)
            return TwitterViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: TwitterViewHolder, position: Int) {
            var currenttweet=twitter_list_items.get(position)
            holder.tvName.text=currenttweet.name
            holder.tvmail.text=currenttweet.mail
            holder.tvTweet.text=currenttweet.tweet


        }

        override fun getItemCount(): Int {
            return twitter_list_items.size

        }
    }

    class  TwitterViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        var tvName = itemView.findViewById<TextView>(R.id.tvName)
        var tvmail= itemView.findViewById<TextView>(R.id.tvMail)
        var tvTweet= itemView.findViewById<TextView>(R.id.tvTweet)
        var imgRetweet= itemView.findViewById<ImageView>(R.id.imgRetweet)
        var imgPic= itemView.findViewById<ImageView>(R.id.imgPic)
        var imgLike= itemView.findViewById<ImageView>(R.id.imgLike)
        var imgMessage= itemView.findViewById<ImageView>(R.id.imgtext)
        var imgShare= itemView.findViewById<ImageView>(R.id.imgShare)

    }
