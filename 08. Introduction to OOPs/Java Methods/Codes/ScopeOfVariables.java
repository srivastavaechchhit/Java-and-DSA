class classLevelScope {
    int a = 20;
    int b = 21;
}   // a and b cannot be accessed after this line as they are initialized within the class

class methodLevelScope {
    int add() {
        int a = 20;
        int b = 21;
        return a + b;
    }   // a and b cannot be accessed after this line as they are initialized within the method
}

class blockLevelScope{
    void print() {
        {
            int a = 20;
            System.out.println(a);  // Output: 20
        }
//        System.out.println(a);  // error
    }
}

public class ScopeOfVariables {
    public static void main(String[] args) {

        classLevelScope obj1 = new classLevelScope();
        methodLevelScope obj2 = new methodLevelScope();
        blockLevelScope obj3 = new blockLevelScope();
    }
}
