fun main(args: Array<String>) {
    var mtrInt = IntMatrix (5)
    mtrInt.set(0, 0, 3)
    println(mtrInt.get(0, 0))

    var mtrStr = Matrix<String>(5)
    mtrStr.set(0, 0, "BuckWheat")
    println(mtrStr.get(0, 0))

    var mtrT = Matrix<Int>(3)

    for(i in 0 until 3)
        for(j in 0 until 3)
            mtrT[i, j] = i * 3 + j

    for(i in 0 until 3) {
        for (j in 0 until 3) {
            print(mtrT[i, j])
            print(" ")
        }
        println()
    }
}