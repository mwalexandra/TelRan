class InputThrow extends Throwable {
    static void procedure() throws IllegalAccessException {
        System.out.println("Wrong input values");
        throw new IllegalAccessException();
    }
}