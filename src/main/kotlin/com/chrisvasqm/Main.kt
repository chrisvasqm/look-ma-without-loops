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

    val aboveAverage = students.count { it.score > average }

    val belowAverage = students.count { it.score < average }

    println("With an average of $average, there are $aboveAverage students above average and $belowAverage below it.")
}

private fun calculateAverageScore(students: Array<Student>) = students.sumBy { it.score } / students.size