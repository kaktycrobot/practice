package module13.lesson6

import kotlinx.coroutines.*
import module13.lesson3.Callback
import module13.lesson3.magicNumber
import java.math.BigInteger
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
    println("error from handler - ${throwable.message}")
}
val parentJob = Job()
val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default + exceptionHandler)

suspend fun main() {
//    scope.launch {
//        println("Start runBlocking...")
//        suspendMagicNumber()
//        println("Finish runBlocking")
//    }
//    println("Start working...")
    cancelledCoroutines()
    (scope.coroutineContext.job as? CompletableJob)?.let {
        it.complete()
        it.join()
    } ?: throw IllegalStateException()
}

fun cancelledCoroutines() {
    scope.launch {
        delay(3000)
        println("error test exception")
    }
    scope.launch {
        var i = 0
        while (true) {
            delay(200)
            println(i++)
        }
    }
}

suspend fun doSomeWork() {
    println("Start work...")
    delay(3000)
    println("Finish work...")
}

suspend fun suspendMagicNumber() {
    suspendCoroutine<BigInteger> { continuation ->
        magicNumber(object : Callback {
            override fun onSuccess(value: BigInteger) {
                println("number $value")
                continuation.resume(value)
            }

            override fun onFailure(error: Throwable) {
                println("error ${error.message}")
                continuation.resumeWithException(error)
            }
        })

    }
}