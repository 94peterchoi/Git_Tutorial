@Controller
public class UserController {
    // 로그인 페이지로 이동
    @RequestMapping("/user/login.do")
    public String login() {
        logger.info("경로: login");
        return "user/login";
    }

    // 인서트
    @RequestMapping("/user/insert.do")
    public String insert() {
        logger.info("경로 : insert");
        
        return "user/insert";
    }

    // 회원수정 페이지로 이동
    @RequestMapping("/user/update.do")
    public String update() {
        logger.info("어쩌구");

        return "user/insert";
    }
    
   // 충돌해결 - master 브랜치에서 작업했던 거 날렸음
   // 11:51 branch develop에서 딜리트 작업중
   @RequestMapping("/user/delete.do")


}