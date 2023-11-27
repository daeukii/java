package d6;

/*
연료가 얼마나 들었는지에 대한 정보
연료가 얼마나 남았는지에 대한 정보를 반환하는 메서드
연료를 설정하는 메서드
운전하는 메서드, 실행시 주행거리 / 10 (정수) 만큼 연료 소모
경적을 울리는 'beep'
 */

public class Car {
    // private 접근 제어자는 나, 그리고 오로지 나
    private int fuel;
    public int getFuel;

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void drive(int kilos) {
        System.out.println("drive car");
        this.fuel -= kilos / 10;
        System.out.println(String.format("moved: %d, current fuel: %d",
                kilos, this.fuel));
    }
    public void beep(){
        System.out.println("빵빵");
    }
}
