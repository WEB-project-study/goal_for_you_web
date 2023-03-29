package com.example.GoalForYou.controller;


import com.example.GoalForYou.domain.File;
import com.example.GoalForYou.dto.CommunityDto;
import com.example.GoalForYou.dto.FileDto;
import com.example.GoalForYou.service.CommunityService;
import com.example.GoalForYou.service.FileService;
import com.example.GoalForYou.util.MD5Generator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.List;
@Controller
//@AllArgsConstructor
public class CommunityController {
    @Autowired
    private CommunityService communityService;
    @Autowired
    private FileService fileService;

    /** 게시글 작성 */

    // 글 등록

    @PostMapping("/community/create/{id}")
    @ResponseBody
    public String communityCreate(@RequestParam("file") MultipartFile files, CommunityDto communityDto){

            try {
                String origFilename = files.getOriginalFilename();
                String filename = new MD5Generator(origFilename).toString();
                /* 실행되는 위치의 'files' 폴더에 파일이 저장됩니다. */
                String savePath = System.getProperty("user.dir") + "\\files";
                /* 파일이 저장되는 폴더가 없으면 폴더를 생성합니다. */
                if (!new File(savePath).exists()) {
                    try{
                        new File(savePath).mkdir();
                    }
                    catch(Exception e){
                        e.getStackTrace();
                    }
                }
                String filePath = savePath + "\\" + filename;
                files.transferTo((Path) new File(filePath));

                FileDto fileDto = new FileDto();
                fileDto.setOrigFilename(origFilename);
                fileDto.setFilename(filename);
                fileDto.setFilePath(filePath);

                Long fileId = fileService.saveFile(fileDto);
                fileDto.setFileId(fileId); //communityDto.setFileId(fileId); 는 왜 안 될까?
                communityService.saveCommunity(communityDto);
            } catch(Exception e) {
                e.printStackTrace();
            }
        communityService.saveCommunity(communityDto);
        return "redirect:/";
    }

//    @PostMapping("/community/create/{id}")
//    @ResponseBody
//    public String communityCreate(Long user_id, String title, String fileId, List<Tag> tags){
//
//            communityService.createCommunity(user_id,title,content);
//            return "redirect:/";
//        }
        //write => 글쓰기 입력 폼 페이지

    /** 게시글 목록 */
    @GetMapping("/")
    public String list(Model model) {
        List<CommunityDto> communintyList = communityService.getCommunityList();
        model.addAttribute("communityList", communintyList); /** 프론트에서 가져와야 될 부분 */

        return communintyList.toString();
    }
    /** 게시글 조회 => 프론트에서?*/
//    @GetMapping("/")
//
//    public String list(Model model, @RequestParam(value="page", defaultValue = "1") Integer pageNum) {
////        List<CommunityDto> boardList = communityService.getCommunitylist(pageNum);
////        Integer[] pageList = communityService.getPagelist(pageNum);
//
//        model.addAttribute("communityList", communityList);
//        model.addAttribute("pageList", pageList); //페아자 번호
//
//        return "community/list.html";
//        //list => 게시글 리스트 페이지
//    }
    /** 게시글 상세 조회 페이지 (클릭했을 때 상세 조회)*/
    @RequestMapping(value = "/post/{id}" , method = RequestMethod.GET)
//    @GetMapping("/community/{id}")
    public String detail(@PathVariable("id") Long id, Model model) {
        CommunityDto communityDTO = (CommunityDto) communityService.getCommunity(id);
        model.addAttribute("communityDto", communityDTO);
        return communityDTO.toString();
    }

//    /** 게시글 수정 페이지 */
//    @GetMapping("/community/edit/{id}")
//    public String edit(@PathVariable("id") Long id, Model model) {
//        CommunityDto communityDTO = (CommunityDto) communityService.getCommunityList(Long id);
//
//        model.addAttribute("communityDto", communityDTO);
//        return "redirect:/";
//    }
    /** 게시글 수정 */
    @RequestMapping(value = "/community/update/{id}" , method = {RequestMethod.POST, RequestMethod.PUT})
    public String update(CommunityDto communityDTO) {
        communityService.saveCommunity(communityDTO);

        return "redirect:/";
    }

    /** 게시글 삭제 */
    @DeleteMapping("/community/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        communityService.deleteCommunity(id);

        return "redirect:/";
    }
    /**이미지 파일*/
//    public CommunityController(CommunityService communityService, FileService fileService) {
//        this.communityService = communityService;
//        this.fileService = fileService;
//    }
//    @PostMapping("/post")
//    public String write(@RequestParam("file") MultipartFile files, CommunityDto communityDto) {
//        try {
//            String origFilename = files.getOriginalFilename();
//            String filename = new MD5Generator(origFilename).toString();
//            /* 실행되는 위치의 'files' 폴더에 파일이 저장됩니다. */
//            String savePath = System.getProperty("user.dir") + "\\files";
//            /* 파일이 저장되는 폴더가 없으면 폴더를 생성합니다. */
//            if (!new File(savePath).exists()) {
//                try{
//                    new File(savePath).mkdir();
//                }
//                catch(Exception e){
//                    e.getStackTrace();
//                }
//            }
//            String filePath = savePath + "\\" + filename;
//            files.transferTo(new File(filePath));
//
//            FileDto fileDto = new FileDto();
//            fileDto.setOrigFilename(origFilename);
//            fileDto.setFilename(filename);
//            fileDto.setFilePath(filePath);
//
//            Long fileId = fileService.saveFile(fileDto);
//            communityDto.setFileId(fileId);
//            communityService.saveCommunity(communityDto);
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//        return "redirect:/";
//    }




    //검색
//    @GetMapping("/community/search")
//    public String search(@RequestParam(value="keyword") String keyword, Model model) {
//        List<CommunityDto> boardDtoList = communityService.searchPosts(keyword);
//
//        model.addAttribute("boardList", boardDtoList);
//
//        return "community/list.html";
//    }




}
