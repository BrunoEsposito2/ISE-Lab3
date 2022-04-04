package it.unibo.ise.lab.thermostat

import it.unibo.tuprolog.core.Fact
import it.unibo.tuprolog.core.Struct
import it.unibo.tuprolog.core.Term
import it.unibo.tuprolog.solve.ExecutionContext
import it.unibo.tuprolog.solve.primitive.Solve
import it.unibo.tuprolog.solve.primitive.UnaryPredicate

object Update : UnaryPredicate.NonBacktrackable<ExecutionContext>("update") {
    override fun Solve.Request<ExecutionContext>.computeOne(first: Term): Solve.Response {
        TODO()
    }
}