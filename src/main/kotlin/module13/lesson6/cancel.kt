package module13.lesson6

import kotlinx.coroutines.*

suspend fun main() {
    val job = scope.launch {
        var i = 0
        while (true) {
            yield()
            println(i++)
            Thread.sleep(500)
        }
    }
    scope.launch {
        delay(3000)
        println("cancel job")
        job.cancel()
    }

    (scope.coroutineContext.job as? CompletableJob)?.let {
        it.complete()
        it.join()
    } ?: throw IllegalStateException()
}

suspend fun cancellableSuspend() {
    suspendCancellableCoroutine<Unit> { continuation ->
        continuation.invokeOnCancellation {
            //some code
        }
    }
}
