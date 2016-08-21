package g.string.source

/**
 * Created by pankaj.nimgade on 21-08-2016.
 */
class GStringTestDrive {

    public static void main(String[] args){

        def nick = 'ReGina'
        def book = '2nd edition'

        assert "$nick is $book" == 'ReGina is 2nd edition'
        println("$nick is $book")
    }
}
