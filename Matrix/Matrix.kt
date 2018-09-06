class IntMatrix(val size: Int){
    private var arr : Array<IntArray?> = arrayOfNulls<IntArray>(size)

    init{
        for(i in 0 until size)
            arr[i] = IntArray(size)
    }

    fun get(i1: Int, i2: Int) = arr[i1]!![i2]
    fun set(i1: Int, i2: Int, value: Int){
        arr[i1]!![i2] = value
    }

}

class Matrix<T>(val size: Int) {

    private class Wrapper<T>(arg: T){
        var ar: T = arg
        fun get() = ar
    }

    private var arrWrap: Array<Array<Wrapper<T>?>?> = arrayOfNulls<Array<Wrapper<T>?>>(size)

    init{
        for(i in 0 until size)
            arrWrap[i] = arrayOfNulls<Wrapper<T>>(size)
    }

    operator fun get(i1: Int, i2: Int) = arrWrap[i1]!![i2]!!.get()
    operator fun set(i1: Int, i2: Int, value: T){
        arrWrap[i1]!![i2] = Wrapper<T>(value)
    }
}