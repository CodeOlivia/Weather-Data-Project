package zerobase.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import zerobase.weather.domain.Diary;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, Integer> {
    List<Diary> findAllByDate(LocalDate date);

    //날짜 범위에 있는 일기 여러개 가져오는 함수
    List<Diary> findAllByDateBetween(LocalDate startDate, LocalDate endDate);

    //수정을 위한 함수(그 날짜의 가장 최근 일기)
    Diary getFirstByDate(LocalDate date);

    //전체 삭제 함수
    @Transactional
    void deleteAllByDate(LocalDate date);



}

