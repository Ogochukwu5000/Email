package com.example.email

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emailArg: List<email>): RecyclerView.Adapter<EmailAdapter.ViewHolder>()
{
    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // TODO: Create member variables for any view that will be set
        var senderTextView: TextView = itemView.findViewById(R.id.sender)
        var titleTextView: TextView = itemView.findViewById(R.id.title)
        var summaryTextView: TextView = itemView.findViewById(R.id.summary)       // as you render a row.
        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each sub-view
        init {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            senderTextView = itemView.findViewById(R.id.sender)
            titleTextView = itemView.findViewById(R.id.title)
            summaryTextView = itemView.findViewById(R.id.summary)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailAdapter.ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val emailView = inflater.inflate(R.layout.email_item, parent, false)
        // Return a new holder instance
        return ViewHolder(emailView)
    }

    // Involves populating data into the item through holder
    override fun onBindViewHolder(viewHolder: EmailAdapter.ViewHolder, position: Int) {
        // Get the data model based on position
        val email: email = emailArg[position]
        // Set item views based on your views and data model
        viewHolder.senderTextView.text=email.sender
        viewHolder.titleTextView.text=email.title
        viewHolder.summaryTextView.text=email.summary

    }

    // Returns the total count of items in the list
    override fun getItemCount(): Int {
        return emailArg.size
    }

}