package multiple;

public class Multiple {
    public static void main(String[] args) {
        
    }
}

interface Parent1 extends Multiple{
    int varParent2=1;
}

class Parent2{
    int varParent2;
}

class child implements Parent1, Parent2{

}
