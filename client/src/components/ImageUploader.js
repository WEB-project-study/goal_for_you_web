import router from "next/router";
import axios from "react";
import { useState } from "react";
const Uploader= () => {

    const [image, setImage] = useState({
          image_file: "", //바뀔 이미지
          preview_URL: "/assets/logo.png", //보여지는 이미지
    });
    let inputRef;

    //저장되는 이미지
    const SaveImage = (e) => { 
        e.preventDefault(); //새로고침 안해도 됨
        const fileReader = new FileReader(); 
         
        if(e.target.files[0]){ //첫번째 들어오는 사진
          fileReader.readAsDataURL(e.target.files[0]) //을 읽어서 dataurl 로 설정
        }
        fileReader.onload = () => { //사진 업로드하기
          setImage(
            {
              image_file: e.target.files[0],
              preview_URL: fileReader.result //보여지는 이미지
            }
          )
        }
      }

    //이미지 삭제
    const DeleteImage = () => {
    setImage({image_file:"", preview_url:"/assets/logo.png"});
    };

return(
        <div className="upload-wrapper">
            <img src = {image.preview_URL}></img>
            <input
                type='file'
                accept="image/jpg,image/png,image/jpeg.image/gif" // 업로드 할 수 있는 파일 확장자
                onChange={SaveImage}
                ref= {refParam => inputRef = refParam}
             >
        </input>
            <div className="mt-10 border-1 bg-[#E560C8] font-size:2.1rem">
                <button onClick={() => inputRef.click()}>사진 고르기</button>
                <button onClick={DeleteImage}>사진 삭제하기</button>
            </div>
        </div>
);
};
export default Uploader;