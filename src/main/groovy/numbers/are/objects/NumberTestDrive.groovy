package numbers.are.objects

/**
 * Created by Pankaj.Nimgade on 22-08-2016.
 */
class NumberTestDrive {

    public static void main(String[] args) {


        def x = 1
        def y = 2
        assert x + y == 3
        assert x.plus(y) == 3
        assert x instanceof Integer
    }
}
