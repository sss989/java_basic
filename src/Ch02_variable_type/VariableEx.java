package Ch02_variable_type;

class VariableEx {
    public static void main(String[] args) {
        // 변수 선언과 함께 초기화
        int hour =3;
        int minute =5;
        System.out.println(hour + "시간 " + minute +"분"); // hour, minuate 값 출력

        int totalMinute = (hour*60) +minute;
        System.out.println("총 " + totalMinute + "분");
    }
}