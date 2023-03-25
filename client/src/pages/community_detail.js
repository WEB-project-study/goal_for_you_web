import { useCallback, useEffect, useState } from "react";
import styles from "./community.module.css"; 
import { useRouter } from "next/router";
import React from 'react';
import axios from "axios";
import Comment from "@/components/Comment";

export default function CommunityDetail(){
  
    //좋아요 개수 체크
    const [like, setLike] = useState(0);
    const [board, setBoard] = useState({});
    const router = useRouter();  
    const { id } = router.query;
    const onEdit = (event) => {
        setBoardText(event.target.value);
    }
    
    useEffect(()=>{
        const bringBoard = async() => {
            const {data} = await axios.get(`/post/${id}`);
            return data;
        }
        bringBoard().then(result => setBoard(result));
    },[]);

    return(
        <form>
            <h3>NickName</h3>
            <hr/>
        <div className={styles.container}>
         </div>
         <button onClick={onEdit}>수정</button>
         <h3>LIKE<span onClick={() => { setLike(like + 1) }}>👍🏻</span>{like}</h3>         
         <Comment id={id}/>
        </form>
        
         
    );
}
