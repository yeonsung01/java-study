package java_intermediate_study.class_object;

// 회원 관리
public class Member {

    // private 필드
    private String id;
    private String password;
    private String name;
    private String email;


    // 생성자
    public Member(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    // Getter (password는 보안상 Getter 없음)
    public String getId() {
        return  id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Setter with validation
    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            System.out.println("올바른 이메일 형식이 아닙니다.");
            return;
        }
        this.email = email;
        System.out.println("이메일이 등록되었습니다: " + email);
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("이름을 입력해주세요");
            return;
        }
        this.name = name;
    }

    // 비밀번호 변경 (특수 메서드)
    public boolean changePassword(String oldPw, String newPw) {
        // 현재 비밀번호 확인
        if (!this.password.equals(oldPw)) {
            System.out.println("현재 비밀번호가 일치하지 않습니다.");
            return false;
        }
        // 새 비밀번호 유효성 검사
        if (newPw == null || newPw.length() < 4) {
            System.out.println("비밀번호는 4자 이상이어야 합니다.");
            return false;
        }
        this.password = newPw;
        System.out.println("비밀번호가 변경되었습니다.");
        return true;
    }

    // 로그인 검증
    public boolean login(String inputPw) {
        if (this.password.equals(inputPw)) {
            System.out.println(name + "님 로그인 성공!");
            return true;
        }
        System.out.println("비밀번호가 일치하지 않습니다.");
        return false;
    }
        // 프로필 출력
        public void showProfile() {
            System.out.println("=== 회원 정보 ===");
            System.out.println("ID: " + id);
            System.out.println("이름: " + name);
            System.out.println("이메일: " + (email !=null ? email: "미등록"));
        }
    }
