package com.example.android.messagefirestore.Model

import android.net.sip.SipRegistrationListener

data class User(val name: String,
                val bio: String,
                val profilePicturePath: String?,
                val registrationToken: MutableList<String>) {
    constructor():this("","",null, mutableListOf())
}