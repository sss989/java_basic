package Ch02_variable_type;

public class TypeEx {
    public static void main(String[] args) {
        int var1 = 123; //10진수
        byte var2 = 127; // -128~127까지 허용범위 그 외는 컴파일 에러나옴
        long var3 = 100000000000L; // int허용범위 초과하면 뒤에 l,L을 붙여줘야함
        char var4 = 'A'; //문자타입
        float var5 = 3.14f; // f,F를 붙여 float타입임을 증명
        double var6 = 3.14;

        System.out.println("var1은 " + var1);
        System.out.println("var2은 " + var2);
        System.out.println("var3은 " + var3);
        System.out.println("var4은 " + var4);
        System.out.println("var5은 " + var5);
        System.out.println("var6은 " + var6);

    }
}
