![mvc -](https://user-images.githubusercontent.com/40202945/53384407-2347fa80-39be-11e9-81d2-d8b29ff95845.png)

##요구 사항
  - 사용자가 입력한 점의 위치를 좌표축에 맞게 보여주고 형태에 따라 
면적을 구하는 좌표계산기 기능 구현
 
##설계
<MVC 패턴과 객체 지향 기반으로 작업>

#Model<Domain>
- Area :
Interface를 적용하여 각 도형마다 공통의 area 메서드를 구현하도록 강제함

- Figure :
Abstract Class로 Area Class를 implements하고, 인스턴스 변수로 받아오는 point의 개수를 활용하여 조건에 해당하는 도형을 생성할 수 있도록 추상화 시킴.
해당 Figure 객체를 상속받는 객체는 생성 조건인 valid 메서드와 면적을 구하는 area 메서드, 각 객체의 이름을 생성하는 메서드를 구현해야함.

- FigureFactory :
 Figure Class를 HashMap에 담아 point의 개수에 해당하는 객체를 return 해주는 실질적인 로직을 구현함
 
- Line :
point의 개수가 2개일 경우 생성되는 객체

- Point :
X와 Y축을 가진 Class로 객체마다 구해야하는 면적에 해당하는 거리를 구해야하기 때문에 Comparable을 적용하여 각 점의 위치를 원하는 순서대로 정렬하는 로직을 구현.

- Rectangle :
Point의 개수가 4개일 경우 생성되는 사각형의 객체

- Triangle :
 Point의 개수가 3개일 경우 생성되는 삼각형의 객체

- CoordinatePlay :
 Point에 해당하는 객체를 생성하고 정렬하는 객체 생성 로직을 구현.


#Util
 - SplitUtil :
 InputView에서 입력받은 String값의 번호를 특정 값을 기준으로 나눠 Integer 타입의 List로 변환해주는 Class


#View
 - InputView :
  사용자에게 입력받은 데이터를 MainController로 전달하는 Class
  
 - ResultView :
  MainController에서 전달받은 데이터를 출력하는 로직을 관리하는 Class

#Controller
- MainController :
 직접 전달이 아님 MainController를 통해 Domain과 View에 데이터를 전달해주고 실행함.


![default](https://user-images.githubusercontent.com/40202945/53384424-34910700-39be-11e9-8486-e8e154abaef7.jpg)


##회고

로직 리팩토링 필요하여 
