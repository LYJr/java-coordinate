![mvc -](https://user-images.githubusercontent.com/40202945/53384407-2347fa80-39be-11e9-81d2-d8b29ff95845.png)

##요구 사항
  - 사용자가 입력한 점의 위치를 좌표축에 맞게 보여주고 형태에 따라 
면적을 구하는 좌표계산기 기능 구현
 
##설계
<MVC 패턴과 객체 지향 기반으로 작업>

Model<Domain>









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
