import axios from 'axios';
import React from 'react';
import { useState } from 'react';
export default function Community(){
    const [products , setProducts] = useState([]);
    return(
        <div>
            <h1>전체 게시물</h1>
            <button onClick={()=>{
                 axios.get('https://codingapple1.github.io/shop/data2.json')
                      .then((result)=>{ setProducts([...products, ...result.data]) })
                      .catch(()=>{
                            console.log('fail');
                            })
                    }}>더보기</button>
            <li>
                {products.map((p) => <li>{p.title}</li>)}
            </li>
        </div>
    );
}
