
class Assert {
    static void isTrue(String comment, boolean test){
        if (!test){
            throw new RuntimeException("Assertion failed: " + comment);
        }
    }
}
