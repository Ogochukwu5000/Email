package com.example.email

class EmailFetcher {
    companion object {
        val senders = listOf("Dahlia Cline", "Kevin Miranda", "Kaya Austin", "Laila Calderon", "Marquise Rhodes", "Fletcher Patel", "Luz Barron", "Kamren Dudley", "Jairo Foster", "Lilah Sandoval", "Ansley Blake", "Slade Sawyer", "Jaelyn Holmes", "Phoenix Bright", "Ernesto Gould")
        val title = listOf("Welcome to Kotlin!","Glad you could make it!","Let's try to finish this time")
        val summary = "Welcome to the Android Kotlin Course! We're excited to have you join us and learn how to develop Android apps using Kotlin. Here are some tips to get started."
        fun getEmails(): MutableList<email> {
            var emails : MutableList<email> = ArrayList()
            for (i in 0..9) {
                val email = email(senders[i], title[i%3], summary)
                emails.add(email)
            }
            return emails
        }

        fun getNext5Emails(): MutableList<email> {
            var newEmails : MutableList<email> = ArrayList()
            for (i in 10..14) {
                val email = email(senders[i], title[i%3], summary)
                newEmails.add(email)
            }
            return newEmails
        }
    }
}