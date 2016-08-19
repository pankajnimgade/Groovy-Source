package book.source.test

/**
 * Created by pankaj.nimgade on 18-08-2016.
 */
class BookTestDrive {

    public static void main(String[] args){


        Book gina = new Book('Groovy in Action')

        assert gina.getTitle() == 'Groovy in Action'

        println(gina.getTitle())

        assert getTitleBackwards(gina) == 'noitcA ni yvoorG'

        println(getTitleBackwards(gina))

    }

    private static String getTitleBackwards(Book book){
        String title = book.getTitle();
        return title.reverse();
    }

}
