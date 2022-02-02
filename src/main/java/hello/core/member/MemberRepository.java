package hello.core.member;

public interface MemberRepository {
    // 회원저장
    void save(Member member);

    //회원 찾기
    Member findById(Long memberId);
}
