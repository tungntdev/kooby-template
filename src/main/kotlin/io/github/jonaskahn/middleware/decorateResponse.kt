package io.github.jonaskahn.middleware

import io.github.jonaskahn.assistant.Language
import io.github.jonaskahn.dto.Response
import io.github.jonaskahn.exception.LogicException
import io.jooby.MediaType
import io.jooby.StatusCode
import io.jooby.kt.Kooby

fun Kooby.decorate() {
    after {
        ctx.setDefaultResponseType(MediaType.json)
        if (failure == null) {
            ctx.responseCode = StatusCode.OK
            ctx.render(Response.ok(result))
            return@after
        }
        val ex = failure as Throwable
        val acceptLanguage: String? = ctx.header("Accept-Language").valueOrNull()
        val (statusCode, message) = getStatusCodeAndMessage(ex)
        ctx.responseCode = statusCode
        ctx.render(Response.fail(Language.of(acceptLanguage, message)))
    }
}

private fun getStatusCodeAndMessage(ex: Throwable): Pair<StatusCode, String?> {
   ex.printStackTrace()
    return when (ex) {
        is LogicException -> Pair(StatusCode.BAD_REQUEST, ex.message)
        is IllegalArgumentException -> Pair(StatusCode.BAD_REQUEST, "app.common.exception-invalid-args")
        is NoSuchElementException -> Pair(StatusCode.BAD_REQUEST, "app.common.exception.no-such-element")
        is Exception -> Pair(StatusCode.SERVER_ERROR, "app.common.exception.server-error")
        else -> Pair(StatusCode.SERVER_ERROR, "app.common.exception.unknown-error")
    }
}