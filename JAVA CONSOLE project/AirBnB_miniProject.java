import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;
import java.time.*;


public class AirBnb_01 {
    public static void main(String[] args) {

        ArrayList<Info> inputEng = new ArrayList<Info>();

        inputEng.add(new Info("유럽," + "Italy", "20221019","20221024","더블침대1개,욕실1",5,4,"박정석", "저는 변두리에서 열심히 일하고 있는 박정석입니다.", 4.9,
                "ArisHome", "한국인이 관리하고 있는 Aris 숙박으로 오세요! 깔끔합니다.", "소방시설 설비, 도어락설치", "애완견 출입금지", 70000, 4.3));
        inputEng.add(new Info("한국"+",Seoul", "20230122","20230124","더블침대1개",2, 4, "김경숙", "저녁 파티가 있고, 조용합니다. 밤에 별을 볼 수 있습니다.",4.2 ,
                "언덕위의소나무", "별 보며, 맥주한잔 하실래요 ? 조용하고 깔끔한 방으로 ! ", "소방시설 설비, 도어락설치, 지진대비", "술 반입 금지", 140000, 4.2));
        inputEng.add(new Info("미국"+"Boston", "20221023","20221028","침대1,욕실1",5,2, "Aron", "저는 변두리에서 열심히 일하고 있는 박정석입니다.", 3.7,
                "Star", "just come on! 조용하고 단아한 분위기", "소방시설 설비", "애완견 동반 가능, 술 반입 금지", 70000, 4.9));
        inputEng.add(new Info("한국,"+"Busan", "20221104","20221109","침대2욕실1",5,4,"종철", "전화:01023234243", 4.8,
                "바동", "전통한옥 공법으로 잘지은 한옥독체, 배산임수로 무엇보다 단지뒤 고래산자락 둘레길 21km 산책로가 좋습니다.", "코로나 방역수칙,보안카메라,일산화 탄소 경보기,화재경보기", "반려동물동반가능", 170000, 3.5));
        inputEng.add(new Info("한국,Daegu", "20221005","20221011","침대2 욕실2",6, 4,"Jeong Im", "저희 부부는 퇴직 후 자연을 좋아하여 이곳 영월에서 집을 짓고 살고 있습니다!", 4.9,
                "CosmosHome", "영월의 스테이하우스는 커플이 프라이빗하게 쉬기 좋은 객실입니다. 복층 구조로 되어있습니다.", "코로나 방역수칙, 일산화탄소 경보기,화재 경보기", "반려동물 동반불가, 흡연금지, 파티이벤트 금지", 116500, 4.4));
        //숙소 등록
/*
        InputHosting h1 = new InputHosting();
        h1.addlist(new Info("유럽","2022-10-19",5,"박정석","저는 변두리에서 열심히 일하고 있는 박정석입니다.",5,
                "ArisHome","한국인이 관리하고 있는 Aris 숙박으로 오세요! 깔끔합니다.","소방시설 설비, 도어락설치","애완견 출입금지",70000,4));
        h1.addlist(new Info("한국","2023-01-22",4,"김경숙","저녁 파티가 있고, 조용합니다. 밤에 별을 볼 수 있습니다.",3,
                "언덕위의소나무","별 보며, 맥주한잔 하실래요 ? 조용하고 깔끔한 방으로 ! ","소방시설 설비, 도어락설치, 지진대비","술 반입 금지",140000,4));
        h1.addlist(new Info("미국","2022-10-23",2,"Aron","저는 변두리에서 열심히 일하고 있는 박정석입니다.",4,
                "Star","just come on! 조용하고 단아한 분위기","소방시설 설비","애완견 동반 가능, 술 반입 금지",70000,4));
        h1.addlist(new Info("한국","2022-11-04",6,"종철","전화:01023234243",5,
                "바동","전통한옥 공법으로 잘지은 한옥독체, 배산임수로 무엇보다 단지뒤 고래산자락 둘레길 21km 산책로가 좋습니다.","코로나 방역수칙,보안카메라,일산화 탄소 경보기,화재경보기","반려동물동반가능",170000,4));
        h1.addlist(new Info("한국","2022-10-5",2,"Jeong Im","저희 부부는 퇴직 후 자연을 좋아하여 이곳 영월에서 집을 짓고 살고 있습니다!",5,
                "CosmosHome","영월의 스테이하우스는 커플이 프라이빗하게 쉬기 좋은 객실입니다. 복층 구조로 되어있습니다.","코로나 방역수칙, 일산화탄소 경보기,화재 경보기","반려동물 동반불가, 흡연금지, 파티이벤트 금지",116500,5));
        h1.showList();
        */

        //검색
        System.out.println("----------------------------------------------");
        Scanner in = new Scanner(System.in);
        boolean y;
        System.out.println("지역으로 검색하기 1번 : 날짜로 검색하기 2번: 게스트 수로 검색하기 3번 : 지역과 날짜로 검색 4번: " +
                "\n" +
                " 날짜와 게스트로 검색 5번 : 지역과 게스트로 검색 6번 : 모두 검색 하기 7번 : 나가기 8번 ");
        System.out.println("----------------------------------------------");

        while (y = true) {
            System.out.print("검색 유형 설정 :");
            String x = in.nextLine();
            if (x.equals("1")) {
                System.out.print("지역으로 검색: ");
                String search1 = in.nextLine();
                //지역으로 검색하기
                for (Info input : inputEng) {
                    if (input.getNation().contains(search1) == true) {
                        input.searchInfo();
                    } else {
                        continue;
                    }
                }
                System.out.print("호스트이름으로 조회하기 : ");
                String lookUp = in.nextLine();

                for(Info input : inputEng) {
                    if (input.getHomeName().indexOf(lookUp) != -1) {
                        input.showInfo();
                        input.showCheck();
                    } else {
                        continue;
                    }
                }
            }

                    // 날짜를 통한 검색

            else if (x.equals("2")) {
                System.out.print("날짜 검색(시작날짜/YYYYMMDD) : ");
                String start = in.nextLine();
                System.out.print("날짜 검색(마지막날짜/YYYYMMDD) : ");
                String end = in.nextLine();
                for (Info input : inputEng) {
                    if(input.StartWithinRange(start,input.getStartDate(),input.getEndDate())==true){
                        if(input.endWithinRange(end,input.getStartDate(),input.getEndDate())==true){
                        input.InsertSearchInfo(start,end);
                        }
                    }
                    else {
                        continue;
                    }
                }
                System.out.print("숙박이름으로 조회하기 : ");
                String lookUp = in.nextLine();
                for (Info input : inputEng) {
                    if (input.getHomeName().equals(lookUp)) {
                        input.showInfo();
                        input.showCheck(start,end);
                    } else {
                        continue;
                    }
                }

                // 게스트 수가 같거나 적으면 번호 찾기
            } else if (x.equals("3")) {
                System.out.println("게스트 수로 검색 시작");
                System.out.println("성인(만13세): ");
                String a = in.nextLine();
                System.out.println("어린이(2세~12세): ");
                String b = in.nextLine();
                System.out.println("유아:");
                String c = in.nextLine();



                //유아는 게스트 계산에서 제외
                for (Info input : inputEng) {
                    if (input.getGuestNum() >= (Integer.parseInt(a)+Integer.parseInt(b))) {
                        input.searchInfo();
                    }
                }

                System.out.print("호스트이름으로 조회하기 : ");
                String lookUp = in.nextLine();

                for (Info input : inputEng) {
                    if (input.getHomeName().equals(lookUp)) {
                        input.showInfo();

                    }
                }


            } else if (x.equals("4")) {
                System.out.print("지역 검색: ");
                String search5 = in.nextLine();
                System.out.print("날짜 검색(시작날짜/YYYYMMDD) : ");
                String start = in.nextLine();
                System.out.print("날짜 검색(마지막날짜/YYYYMMDD) : ");
                String end = in.nextLine();
                for (Info input : inputEng) {
                    if (input.getNation().contains(search5) == true) {
                       if(input.StartWithinRange(start, input.getStartDate(), input.getEndDate())==true) {
                           if (input.endWithinRange(end, input.getStartDate(), input.getEndDate()) == true) {
                               input.InsertSearchInfo(start,end);


                           }
                       }else {
                                continue;
                            }
                        }
                    }
                    System.out.print("호스트이름으로 조회하기 : ");
                    String lookUp = in.nextLine();
                    for (Info input1 : inputEng) {
                        if (input1.getHomeName().indexOf(lookUp) != -1) {
                            input1.showInfo();
                            input1.showCheck(start,end);
                        } else {
                            continue;
                        }
                    }
                  }else if (x.equals("5")) {
                    System.out.print("날짜 검색(시작날짜/YYYYMMDD) : ");
                    String start = in.nextLine();
                    System.out.print("날짜 검색(마지막날짜/YYYYMMDD) : ");
                    String end = in.nextLine();
                    System.out.print("게스트(성인13세이상): ");
                    String search1 = in.nextLine();
                    System.out.print("어린이(2세~12세): ");
                    String search2 = in.nextLine();
                    System.out.print("유아(2세미만): ");
                    int c = in.nextInt();
                    for (Info input : inputEng) {
                        if(input.StartWithinRange(start, input.getStartDate(), input.getEndDate())==true){
                            if(input.endWithinRange(end, input.getStartDate(), input.getEndDate())==true){
                                if (input.getGuestNum() >= Integer.parseInt(search1)) {
                                    input.InsertSearchInfo(start,end);
                                }
                            }
                            else {
                                    continue;
                                }
                            }
                        }
                    System.out.print("호스트이름으로 조회하기 : ");
                    String lookUp = in.nextLine();
                    for (Info input : inputEng) {
                        if (input.getHomeName().indexOf(lookUp) != -1) {
                            input.showInfo();
                            input.showCheck(start,end,search1,search2,c);
                        } else {
                            continue;
                        }
                    }



            } else if (x.equals("6")) {
                System.out.print("지역검색 : ");
                String search = in.nextLine();
                System.out.print("게스트(성인13세이상) : ");
                String search1 = in.nextLine();
                System.out.println("어린이(2세~12세): ");
                String search2 = in.nextLine();
                System.out.println("유아(2세미만): ");
                int c = in.nextInt();
                for (Info input : inputEng) {
                    if (input.getNation().indexOf(search) != -1) {
                        if (input.getGuestNum() >= Integer.parseInt(search1)) {
                            input.searchInfo();
                        } else {
                            continue;
                        }
                    }
                }
                System.out.print("호스트이름으로 조회하기 : ");
                String lookUp = in.nextLine();
                for (Info input : inputEng) {
                    if (input.getHomeName().equals(lookUp)) {
                        input.showInfo();
                        input.showCheck(search1,search2,c);


                    } else {
                        continue;
                    }
                }
            } else if (x.equals("7")) {
                System.out.print("지역 검색: ");
                String search = in.nextLine();
                System.out.print("날짜 검색(시작날짜/YYYYMMDD) : ");
                String start = in.nextLine();
                System.out.print("날짜 검색(마지막날짜/YYYYMMDD) : ");
                String end = in.nextLine();
                System.out.print("성인(13세 이상): ");
                String a = in.nextLine();
                System.out.print("어린이(2~12세미만): ");
                String b = in.nextLine();
                System.out.println("유아(2세미만): ");
                String c = in.nextLine();
                for (Info input : inputEng) {
                    if (input.getNation().contains(search) ==true) {
                        if (input.StartWithinRange(start, input.getStartDate(),input.getEndDate())==true){
                            if(input.endWithinRange(end, input.getStartDate(), input.getEndDate())==true) {
                                if (input.getGuestNum() >= (Integer.parseInt(a)+Integer.parseInt(b))) {
                                    input.InsertSearchInfo(start,end);
                                }
                            }
                        }
                    }/*
                    else {
                        continue;
                    }
                    */
                }

                System.out.print("호스트이름으로 조회하기 : ");
                String lookUp = in.nextLine();
                for (Info input : inputEng) {
                    if (input.getHomeName().equals(lookUp)) {
                        input.showInfo();
                        input.showCheck(start,end,a,b,Integer.parseInt(c));
                    } else {
                        continue;
                    }
                }
            }
            else if(x.equals("8")) {
                System.out.println("검색창을 나갑니다");
                y = true;
                break;
            }
        }

    }
}

class InputHosting{
    private int hostingNum;
    private ArrayList<Info> hlist;

    public InputHosting(){
        this.hostingNum = hostingNum;
        this.hlist = new ArrayList<Info>();
    }
    public void addlist(Info st){
        this.hlist.add(st);
        System.out.println(++hostingNum+"개의 호스팅 정보가 등록되었습니다.");
    }
    public void showList(){
        if(hlist.size()>0){
            for(Info a : hlist){
                System.out.println("숙소이름 : "+a.getHomeName());
                System.out.println("지역 : "+a.getNation());
                System.out.println("예약 가능 날짜: "+a.getStartDate());
                System.out.println("예약 게스트 수: "+a.getGuestNum()+"명");

                System.out.println("----------------------------------------------");
            }
            System.out.println(hostingNum+"개의 등록 숙소가 있습니다.");
        }
        else{
            System.out.println("등록된 숙소가 없습니다.");
        }
    }
}
class Info extends InputHosting {
    private String nation;
    private String startDate;
    private String endDate;
    private int dateNum;
    private int guestNum;
    // 검색할때 필요한 필드

    private String hostName;
    private String hostIntro; // 호스트 소개
    private double hostScore;
    // 호스트의 관한 정보

    private String homeName;
    private String homebed;
    private String homeIntro;
    private String homeSafety;
    private String homeRule;
    private int homeCost;
    private double homeScore; // 숙박 업소 점수

    public Info(String nation, String startDate,String endDate,String homebed,int dateNum, int guestNum, String hostName, String hostIntro, double hostScore, String homeName, String homeIntro, String homeSafety, String homeRule, int homeCost, double homeScore) {
        this.nation = nation;
        this.startDate = startDate;
        this.endDate = endDate;
        this.homebed = homebed;
        this.dateNum = dateNum;
        this.guestNum = guestNum;
        this.hostName = hostName;
        this.hostIntro = hostIntro;
        this.hostScore = hostScore;
        this.homeName = homeName;
        this.homeIntro = homeIntro;
        this.homeSafety = homeSafety;
        this.homeRule = homeRule;
        this.homeCost = homeCost;
        this.homeScore = homeScore;
    }
    public Info(){};
    //날짜가 포함되지 않은 클래스 조회
    public void searchInfo(){
        System.out.println("----------조회된숙박업소--------------------");

        System.out.print("지역: " + getNation());
        System.out.println("⭐️️" + getHomeScore());
        System.out.println(getHostName()+"님의 추천하는 "+getHomeName()+" 숙소");
        System.out.println("숙박업소 이름: "+getHomeName());
        System.out.println(getStartDate()+" ~ "+getEndDate());
        System.out.println("￦"+getHomeCost()+"/박");
        System.out.println("예약가능 게스트 수: "+getGuestNum()+"명");
        System.out.println("----------------------------------------");
    }
    //날짜가 포함된 클래스 조회
    public void InsertSearchInfo(String start,String end){
        System.out.println("----------조회된숙박업소--------------------");
        System.out.print("지역: " + getNation());
        System.out.println("⭐️️" + getHomeScore() + "점");
        System.out.println(getHostName()+"님의 추천하는"+getHomeName()+"숙소");
        System.out.println(start.substring(4,6)+"월 "+start.substring(6,8)+"일~"+end.substring(6,8)+"일");
        System.out.println("￦"+getHomeCost()*(Integer.parseInt(end)-Integer.parseInt(start))+
                "/"+(Integer.parseInt(end)-Integer.parseInt(start)+"박"));
        System.out.println("----------------------------------------");
    }
    public void showInfo(){
        System.out.println("----------------------------------------");
        System.out.println(getHomeName()+"❤️️");
        System.out.println("⭐️️" + getHomeScore()+" , "+getNation());
        System.out.println("----------------------------------------");
        System.out.println(getHostName() + "님이 호스팅하는"+getHomeName());
        System.out.println("최대 인원 "+getGuestNum()+"명"+"-"+getHomebed());
        System.out.println("----------------------------------------");
        if (getHostScore() >= 4) {
            System.out.println("경험이 풍부한 호스트");
        } else {
            System.out.println("경험이 풍부하지 않은 호스트");
        }
        System.out.println("환불정책: " + getStartDate() + "일 전에 환불하면 무료로 취소 하실 수 있습니다.");
        System.out.println("----------------------------------------");
        System.out.println(getHomeIntro());
        System.out.println("호스트: "+getHomeName()+"님");
        System.out.println(getHostIntro());
        System.out.println("----------------------------------------");
        System.out.println("알아두어야 할 사항");
        System.out.println("숙소 이용규칙 :" + getHomeRule());
        System.out.println("건강과 안전 : " + getHomeSafety());
        System.out.println("환불정책: " + getStartDate() + "일 전에 환불하면 무료로 취소 하실 수 있습니다.");
        System.out.println("----------------------------------------");

    }
    public boolean StartWithinRange(String inputStartDate, String startDate, String endDate){
        if(inputStartDate.length() != 8 || startDate.length() != 8 || endDate.length() != 8){
            return false;
        }

        inputStartDate = inputStartDate.substring(0,4) + "-" + inputStartDate.substring(4, 6) + "-" +
                inputStartDate.substring(6, 8);
        startDate = startDate.substring(0,4) + "-" + startDate.substring(4, 6) + "-" + startDate.substring(6, 8);
        endDate = endDate.substring(0,4) + "-" + endDate.substring(4, 6) + "-" + endDate.substring(6, 8);

        LocalDate inputStartlocaldate = LocalDate.parse(inputStartDate);
        LocalDate startLocalDate = LocalDate.parse(startDate);
        LocalDate endLocalDate = LocalDate.parse(endDate);
        endLocalDate = endLocalDate.plusDays(1); // endDate는 포함하지 않으므로 +1일을 해줘야함.
        // isBefore method
        // startLocalDate 보다 과거일 때, true return
        return ( ! inputStartlocaldate.isBefore( startLocalDate ) ) && ( inputStartlocaldate.isBefore( endLocalDate ));
    }
    public boolean endWithinRange(String inputEndDate, String startDate, String endDate) {
        if (inputEndDate.length() != 8 || startDate.length() != 8 || endDate.length() != 8) {
            return false;
        }

        inputEndDate = inputEndDate.substring(0, 4) + "-" + inputEndDate.substring(4, 6) + "-" + inputEndDate.substring(6, 8);
        startDate = startDate.substring(0, 4) + "-" + startDate.substring(4, 6) + "-" + startDate.substring(6, 8);
        endDate = endDate.substring(0, 4) + "-" + endDate.substring(4, 6) + "-" + endDate.substring(6, 8);

        LocalDate inputEndlocaldate = LocalDate.parse(inputEndDate);
        LocalDate startLocalDate = LocalDate.parse(startDate);
        LocalDate endLocalDate = LocalDate.parse(endDate);
        endLocalDate = endLocalDate.plusDays(1); // endDate는 포함하지 않으므로 +1일을 해줘야함.
        // isBefore method
        // startLocalDate 보다 과거일 때, true return
        return (!inputEndlocaldate.isBefore(startLocalDate)) && (inputEndlocaldate.isBefore(endLocalDate));
    }
    //게스트, 날짜 모음 메소드
    public void showCheck(String start,String end,String a,String b,int c){
        System.out.print(getNation()+"에서 "+(Integer.parseInt(end)-Integer.parseInt(start)+"박"));
        System.out.println("체크인 : "+ start);
        System.out.println("체크 아웃: "+end);
        if(c > 0){
            System.out.print("인원: "+(Integer.parseInt(a)+Integer.parseInt(b))+"명");
            System.out.println(",유아"+c+"명");
        }else {
            System.out.print("인원: "+(Integer.parseInt(a)+Integer.parseInt(b))+"명");
        }
        System.out.println("----------------------------------------");
        int totCost = getHomeCost()*(Integer.parseInt(end)-Integer.parseInt(start));
        System.out.println("￦"+getHomeCost()+"X"+(Integer.parseInt(end)-Integer.parseInt(start)+"박"+"\t"+
                totCost));
        System.out.println("서비스수수료(청소비포함)"+"\t"+Math.round((totCost*0.15)));
        System.out.println("total : "+(totCost+(totCost*0.15))+"￦");
    }
    // 게스트 성인 1 default 값 메소드
    public void showCheck(String start,String end) {
        System.out.print(getNation() + "에서 " + (Integer.parseInt(end) - Integer.parseInt(start) + "박"));
        System.out.println("체크인 : " + start);
        System.out.println("체크 아웃: " + end);
        System.out.println("예약인원 : 성인1");
        System.out.println("----------------------------------------");
        int totCost = getHomeCost() * (Integer.parseInt(end) - Integer.parseInt(start));
        System.out.println("￦" + getHomeCost() + "X" + (Integer.parseInt(end) - Integer.parseInt(start) + "박" + "\t" +
                totCost));
        System.out.println("서비스수수료(청소비포함)" + "\t" + Math.round((totCost * 0.15)));
        System.out.println("total : " + (totCost + (totCost * 0.15)));

    }
    //둘다 없을 때 디폴트
    public void showCheck() {
        System.out.print(getNation() + "에서 " + getDateNum()+ "박");
        System.out.println("체크인 : " + getStartDate());
        System.out.println("체크 아웃: " + getEndDate());
        System.out.println("예약인원 :"+getGuestNum());
        System.out.println("----------------------------------------");
        int totCost = getHomeCost() * getDateNum();
        System.out.println("￦" + getHomeCost() + "X" + getDateNum() + "박" + "\t" +
                totCost);
        System.out.println("서비스수수료(청소비포함)" + "\t" + (totCost * 0.1));
        System.out.println("total : " + (totCost + (totCost * 0.1)));

    }
    //게스트만 있을 때 show
    public void showCheck(String a,String b,int c) {
        System.out.print(getNation() + "에서 " + (Integer.parseInt(getEndDate()) - Integer.parseInt(getStartDate()) + "박"));
        System.out.println("체크인 : " + getStartDate());
        System.out.println("체크 아웃: " + getEndDate());
        if (c > 0) {
            System.out.print("인원: " + (Integer.parseInt(a) + Integer.parseInt(b)) + "명");
            System.out.println(",유아" + c + "명");
        } else {
            System.out.print("인원: " + (Integer.parseInt(a) + Integer.parseInt(b)) + "명");
        }
        System.out.println("----------------------------------------");
        int totCost = getHomeCost() * (Integer.parseInt(getEndDate()) - Integer.parseInt(getStartDate()));
        System.out.println("￦" + getHomeCost() + "X" + (Integer.parseInt(getEndDate()) - Integer.parseInt(getStartDate()) + "박" + "\t" +
                totCost));
        System.out.println("서비스수수료(청소비포함)" + "\t" + (totCost * 0.1));
        System.out.println("total : " + (totCost + (totCost * 0.1)));
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getDateNum() {
        return dateNum;
    }

    public void setDateNum(int dateNum) {
        this.dateNum = dateNum;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getGuestNum() {
        return guestNum;
    }

    public void setGuestNum(int guestNum) {
        this.guestNum = guestNum;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHostIntro() {
        return hostIntro;
    }

    public void setHostIntro(String hostIntro) {
        this.hostIntro = hostIntro;
    }

    public double getHostScore() {
        return hostScore;
    }

    public void setHostScore(double hostScore) {
        this.hostScore = hostScore;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public String getHomeIntro() {
        return homeIntro;
    }

    public void setHomeIntro(String homeIntro) {
        this.homeIntro = homeIntro;
    }

    public String getHomeSafety() {
        return homeSafety;
    }

    public void setHomeSafety(String homeSafety) {
        this.homeSafety = homeSafety;
    }

    public String getHomeRule() {
        return homeRule;
    }

    public void setHomeRule(String homeRule) {
        this.homeRule = homeRule;
    }

    public int getHomeCost() {
        return homeCost;
    }

    public void setHomeCost(int homeCost) {
        this.homeCost = homeCost;
    }

    public double getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(double homeScore) {
        this.homeScore = homeScore;
    }

    public String getHomebed() {
        return homebed;
    }

    public void setHomebed(String homebed) {
        this.homebed = homebed;
    }
}
