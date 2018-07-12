package com.chrisvasqm

fun main(args: Array<String>) {
    val students = arrayOf(
            Student("Chris", 80),
            Student("Mark", 67),
            Student("Joseph", 98),
            Student("Carl", 74),
            Student("Katherine", 86)
    )

    val average = calculateAverageScore(students)

    val aboveAverage = students.filter { it.score > average }.size
}

private fun calculateAverageScore(students: Array<Student>) = students.sumBy { it.score } / students.size