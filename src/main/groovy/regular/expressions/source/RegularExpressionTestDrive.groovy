package regular.expressions.source

/**
 * Created by pankaj.nimgade on 21-08-2016.
 */
class RegularExpressionTestDrive {

    public static void main(String[] args){

        assert '12345' =~ /\d/

        if ('12345' =~ /\d/) {
            println('true')

        }else{
            println('false')
        }
    }
}
