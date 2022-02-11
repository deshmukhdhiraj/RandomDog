package com.sensibol.lucidmusic.singstr.domain

import com.randomdog.network.Failure

class WebServiceFailure {
    class NoNetworkFailure(
        msg: String = "Network not available!"
    ) : Failure.DataFailure(msg)

    class AuthenticationFailure(
        msg: String = "Authentication error!"
    ) : Failure.DataFailure(msg)

    class NetworkTimeOutFailure(
        msg: String = "Network timeout!"
    ) : Failure.DataFailure(msg)

    class NetworkDataFailure(
        msg: String = "Error parsing data!"
    ) : Failure.DataFailure(msg)

    class UnknownNetworkFailure(
        msg: String = "Unknown network error!"
    ) : Failure.DataFailure(msg)
}