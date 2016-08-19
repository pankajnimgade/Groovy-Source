package tree.source.test

/**
 * Created by Pankaj.Nimgade on 19-08-2016.
 */
class TreeTestDrive {

    public static void main(String[] args){

        def tree = new Tree();
        tree.setTitle('some # Tree Name')

        assert tree.getTitle() == 'some # Tree Name'
        println(tree.getTitle())

    }
}
