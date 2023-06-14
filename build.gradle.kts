plugins {
    id("base")
    id("io.freefair.plantuml") version "8.0.1"
}

tasks.plantUml {
    fileFormat.set("svg")
}
