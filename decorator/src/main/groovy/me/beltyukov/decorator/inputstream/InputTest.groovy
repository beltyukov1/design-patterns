package me.beltyukov.decorator.inputstream

class InputTest {

    public static void main(String[] args) {
        def character

        def inputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream('test.txt')))
        while ((character = inputStream.read()) >= 0) {
            print character as Character
        }
    }
}
