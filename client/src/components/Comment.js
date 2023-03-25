const { useEffect, useCallback } = require("react");
import { useState } from 'react';
import axios from 'axios';

const Comment = ({id}) => {
    const [comment, setComment ] = useState('');
    const [commentlist, setCommentList] = useState([]);

    const onSubmit = (event) => {
        event.preventDefault();
        if(comment === ""){
        return;
        }
        setComments((currentArray) => [comment, ...currentArray]);
        setComment("");
    };

    // 댓글 등록하기
    const submit = useCallback(async()=>{
        const comments = {
            id: id ,
            comment: comment,
        }
        //await api.post('/api/comment',comments);
        alert("댓글 등록이 완료되었습니다.");
        //window.location.reload();
    },[comment]); // 댓글 내용이 바뀔때 

    //댓글 서버에서 가져와서 댓글리스트 보여주기
    useEffect(()=>{
        const getCommentList = async() => {
           // const {data} = await axios.get(`/api/comment/list?id=${id}`);
          //  return data;
        }
        getCommentList().then((result) => setCommentList([...commentlist, ...result]))
    },[]);

    return(
        <div>
            <br/>
            <input
                className="p-1 border-2 border-purple-400 w-80 h-30 rounded-md"
                type="text"
                value={comment}
                placeholder="댓글을 달아주세요"
                onChange = {(event) => setComment(event.target.value)}
            />
          <button className='border-2 border-purple-400 ml-5 rounded-md p-1' value="등록" onClick={submit}>등록하기</button>    
          <div className=''>
            {commentlist.map((item, index)=> (
                <div>
                <div className='border-2 border-purple-400'>{item.comment}</div>
                <br/>
              </div>
            ))}
          </div>
        </div>
    )
}

export default Comment;
