package com.pindelia.soft.gardian.net.service

import com.pindelia.soft.gardian.ui.data.model.LoggedInUser

interface AuthenticationService {


    suspend fun login(userName: String, password: String): LoggedInUser?
}