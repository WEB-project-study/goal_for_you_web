import { useRouter } from "next/router";
import Head from "next/head";
// import { Inter } from 'next/font/google'
import Layout from "./layout";

const Card = ({title, content}) => {
    const router = useRouter();
    return(
        <div className="flex-col m-20 border-2 border-[#BE56E3] rounded-xl sm:w-1 lg:w-1/2 h-full overflow-hidden"
            //onClick={()=>{ router.push(`/post/{no}`)}}
        >
            <div className="card-body"> 
                <div className="bg-opacity-40 flex w-full justify-center items-center bg-[#EABFFF]">              
                    <img src=
                        "https://images.mypetlife.co.kr/content/uploads/2019/09/09152804/ricky-kharawala-adK3Vu70DEQ-unsplash-1536x1018.jpg"
                        className="w-80 lg:h-72 m-8 md:h-48 object-center"/>
                </div>
                <div className="flex justify-center items-center h-30 bg-opacity-70 bg-[#BE56E3] text-white text-lg font-extrabold">{title}</div>
            </div>
            <div className="flex justify-center items-center bg-[#EABFFF] border-1">
                <div className="font-bold">{content}</div>
            </div>  
        </div>
    );
};

export default Card;