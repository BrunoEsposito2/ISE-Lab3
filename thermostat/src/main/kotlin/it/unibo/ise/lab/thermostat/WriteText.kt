package it.unibo.ise.lab.thermostat

import it.unibo.tuprolog.core.Atom
import it.unibo.tuprolog.core.Term
import it.unibo.tuprolog.solve.ExecutionContext
import it.unibo.tuprolog.solve.primitive.BinaryRelation
import it.unibo.tuprolog.solve.primitive.Solve
import java.io.File
import java.io.IOException

object WriteText : BinaryRelation.Predicative<ExecutionContext>("write_text") {
    override fun Solve.Request<ExecutionContext>.compute(first: Term, second: Term): Boolean {
        TODO()
    }
}