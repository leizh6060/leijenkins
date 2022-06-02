package org.any

class MultiMethod {
    def steps;
    MultiMethod(steps) {
        this.steps = steps
    }
    def foo() {
        steps.echo "Hello foo from src/org/any/MultiMethod.groovy"
        steps.println"lei"
        println (steps.dump())
    }
    def bar() {
        steps.echo "Hello bar from src/org/any/MultiMethod.groovy"
    }
}
