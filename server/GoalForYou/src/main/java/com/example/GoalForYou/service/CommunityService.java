package com.example.GoalForYou.service;

//import com.example.GoalForYou.community.domain.Community;
import com.example.GoalForYou.domain.Community;
import com.example.GoalForYou.dto.CommunityDto;
import com.example.GoalForYou.repository.CommunityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CommunityService {
    private CommunityRepository communityRepository;

    /** 글 목록 조회*/
    @Transactional
    public List<CommunityDto> getCommunityList() {
        List<Community> communityEntities = communityRepository.findAll();
        List<CommunityDto> communityDtoList = new ArrayList<>();

        for ( Community community : communityEntities) {
            CommunityDto communityDTO = CommunityDto.builder()
                    .id(community.getCommunityId())
<<<<<<< Updated upstream
                    .writer(community.getWriter())
                    .title(community.getTitle())
                    .fileId(community.getFileId())
                    .content(community.getContent())
                    .createdDate(community.getCreatedDate())
=======
//                    .title(community.getTitle())
                    .fileId(community.getFileId())
                    .content(community.getCommunityContent())
                    .createdDate(community.getCommunityWriteDate())
>>>>>>> Stashed changes
                    .build();

            communityDtoList.add(communityDTO);
        }

        return communityDtoList;
    }

    /** 글 상세 조회 */
    @Transactional
    public CommunityDto getCommunity(Long user_id) {
        Optional<Community> communityEntityWrapper = communityRepository.findById(user_id);
        Community community = communityEntityWrapper.get();

        CommunityDto communityDto = CommunityDto.builder()
                .id(community.getCommunityId())
<<<<<<< Updated upstream
                .title(community.getTitle())
                .writer(community.getWriter())
                .content(community.getContent())
                .fileId(community.getFileId())
                .createdDate(community.getCreatedDate())
=======
//                .title(community.getTitle())
//                .writer(community.getWriter())
                .content(community.getCommunityContent())
                .fileId(community.getFileId())
                .createdDate(community.getCommunityWriteDate())
>>>>>>> Stashed changes
                .build();

        return communityDto;
    }

    /** 글 저장 */
    @Transactional
    public Long saveCommunity(CommunityDto communityDto) {
        return communityRepository.save(communityDto.toEntity()).getCommunityId(); // save() => Entity를 전달
    }
    /** 글 삭제 */
    @Transactional
    public void deleteCommunity(Long id) {

        communityRepository.deleteById(id);
    }



//    /** 페이징 */
//    private static final int BLOCK_PAGE_NUM_COUNT = 5; /** 블럭에 존재하는 페이지 번호 수*/
//    private static final int PAGE_POST_COUNT = 4; /** 한 페이지에 존재하는 게시글 수 */
//
//    @Transactional
//    public List<CommunityDto> getCommunitylist(Integer pageNum) {
//        Page<Community> page = communityRepository.findAll(PageRequest.of(pageNum - 1, PAGE_POST_COUNT, Sort.by(Sort.Direction.ASC, "createdDate")));
//
//        List<Community> communityEntities = page.getContent();
//        List<CommunityDto> communityDtoList = new ArrayList<>();
//
//        for (Community community : communityEntities) {
//            communityDtoList.add(this.convertEntityToDto(community));
//        }
//
//        return communityDtoList;
//    }
// 페이징
//@Transactional
//public Long getCommunityCount() {
//    return communityRepository.count();
//}


//    public Integer[] getPageList(Integer curPageNum) {
//        Integer[] pageList = new Integer[BLOCK_PAGE_NUM_COUNT];
//
//       /** 총 게시글 갯수 */
//        Double postsTotalCount = Double.valueOf(this.getBoardCount());
//
//       /** 총 게시글 기준으로 계산한 마지막 페이지 번호 계산 (올림으로 계산) */
//        Integer totalLastPageNum = (int)(Math.ceil((postsTotalCount/PAGE_POST_COUNT)));
//
//       /** 현재 페이지를 기준으로 블럭의 마지막 페이지 번호 계산 */
//        Integer blockLastPageNum = (totalLastPageNum > curPageNum + BLOCK_PAGE_NUM_COUNT)
//                ? curPageNum + BLOCK_PAGE_NUM_COUNT
//                : totalLastPageNum;
//
//       /** 페이지 시작 번호 조정 */
//        curPageNum = (curPageNum <= 3) ? 1 : curPageNum - 2;
//
//       /** 페이지 번호 할당 */
//        for (int val = curPageNum, idx = 0; val <= blockLastPageNum; val++, idx++) {
//            pageList[idx] = val;
//        }
//
//        return pageList;
//    }
//    /** 검색 */
//    @Transactional
//    public List<CommunityDto> searchPosts(String keyword) {
//        List<Community> communityEntities = communityRepository.findByTitleContaining(keyword);
//        List<CommunityDto> communityDtoList = new ArrayList<>();
//
//        if (communityEntities.isEmpty()) return communityDtoList;
//
//        for (Community community : communityEntities) {
//            communityDtoList.add(this.convertEntityToDto(community));
//        }
//
//        return communityDtoList;
//    }


    /** 시리즈의 이전 게시물에서 Entity를 Dto로 변환하는 작업이 중복해서 발생하는 문제 개선. */
    private CommunityDto convertEntityToDto(Community community) {
        return CommunityDto.builder()
                .id(community.getCommunityId())
<<<<<<< Updated upstream
                .title(community.getTitle())
                .content(community.getContent())
                .createdDate(community.getCreatedDate())
=======
//                .title(community.getTitle())
                .content(community.getCommunityContent())
                .createdDate(community.getCommunityWriteDate())
>>>>>>> Stashed changes
                .build();
    }



}
