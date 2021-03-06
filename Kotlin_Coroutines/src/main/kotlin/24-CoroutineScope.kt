import jdk.nashorn.internal.objects.Global
import kotlinx.coroutines.*

fun main() = runBlocking {

    println("runBlocking: $this")

    launch {
        println("launch: $this")

        launch {
            println("child launch: $this")
        }
    }

    async {
        println("async: $this")
    }

    println("... some other code...")
}