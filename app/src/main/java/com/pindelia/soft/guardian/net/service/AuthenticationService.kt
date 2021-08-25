package com.pindelia.soft.guardian.net.service

import com.pindelia.soft.guardian.ui.data.model.LoggedInUser
import retrofit2.http.GET

interface AuthenticationService {


    @GET("/login")
    suspend fun login(userName: String, password: String): LoggedInUser?
}