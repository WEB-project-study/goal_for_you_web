import { useEffect, useState } from "react";
import styles from "./community.module.css"; 

export default function CommunityDetail(){
  
    //좋아요 개수 체크
    const [like, setLike] = useState(0);
     // 사용자가 입력하고 있는 댓글
    const [comment, setComment ] = useState('');
    // 사용자 댓글 모음
    const [comments, setComments] = useState([]);
    const [boardText, setBoardText] = useState('');

    const onSubmit = (event) => {
        event.preventDefault();
        if(comment === ""){
        return;
        }
        setComments((currentArray) => [comment, ...currentArray]);
        setComment("");
    };

    const onEdit = (event) => {
        setBoardText(event.target.value);
    };

    return(
        <form onSubmit={onSubmit}>
        <h3>NickName</h3>
        <hr/>
        <div className={styles.container}>
        <img
            className={styles.left}
            src={"https://images.mypetlife.co.kr/content/uploads/2019/09/09152804/ricky-kharawala-adK3Vu70DEQ-unsplash-1536x1018.jpg"}
            width={500}
            height={500}/>
        
        <input
            onChange={(event) => setBoardText(event.target.value)} 
            className={styles.right}
            type="text"
            value={boardText}
            width={500}
            height={500}
        />
         </div>
         <button onClick={onEdit}>수정</button>
         <h3>LIKE<span onClick={() => { setLike(like + 1) }}>👍🏻</span>{like}</h3>
         <input 
            className={styles.right}
            type="text"
            value={comment}
            placeholder="댓글 달기..."
            onChange = {(event) => setComment(event.target.value)}
         />
         <input type="submit" value="등록"/>
         <ul>
          {         
                comments.map((c,index) =><li key={index}>{c}</li>)
         }
            </ul>
         
        </form>
    );
}