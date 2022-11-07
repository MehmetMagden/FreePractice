package day02_Practice;

public class C06_StringManipulations {

    public static void main(String[] args) {

        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.


        String str = "asdfasf a sfas fasdfasdfs";

        if( str.contains(" ")){
            System.out.println("evet boşluk var");
        }if(str.isBlank()){
            System.out.println("kelime boşluklardan oluşuyor");
        }if(str.isEmpty()){
            System.out.println("sanırım yazmayı unuttunuz");
        }



    }
}
