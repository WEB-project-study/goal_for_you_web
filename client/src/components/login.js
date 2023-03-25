import React from "react";
import { useSession, signIn, signOut } from "next-auth/react";
// import Link from "next/link";

const Login = () => {
    const { data: session } = useSession();

    if (session) {
        return (
            <nav className="flex flex-wrap items-center justify-center p-2 text-base font_local md:ml-auto">
                <div className="p-1">
                    Welcome, {session.user.email}
                    <button
                        className="inline-flex items-center px-3 py-1 mt-4 text-white bg-blue-500 border-0 rounded-xl focus:outline-none hover:bg-sky-300 hover:text-black hover: md:mt-0"
                        onClick={() => signOut()}
                    >
                        signOut
                    </button>
                </div>
            </nav>
        );
    } else {
        return (
            <nav className="flex flex-wrap items-center justify-center p-2 text-base font_local md:ml-auto">
                <div className="p-1">
                    <p>You are not signed in.</p>
                    <button
                        className="inline-flex items-center px-3 py-1 mt-4 text-white bg-blue-500 border-0 rounded-xl focus:outline-none hover:bg-sky-300 hover:text-black hover: md:mt-0"
                        onClick={() => signIn()}
                    >
                        signIn
                    </button>
                </div>
            </nav>
        );
    }
};

// <nav className="flex flex-wrap items-center justify-center p-2 text-base font_local md:ml-auto">
//     <div className="p-1">
//         <Link legacyBehavior href="/ongoing">
//             <a className="inline-flex items-center px-3 py-1 mt-4 text-white bg-blue-500 border-0 rounded-xl focus:outline-none hover:bg-sky-300 hover:text-black hover: md:mt-0">
//                 Google 계정으로 로그인 하기
//             </a>
//         </Link>
//     </div>
//     <div className="p-1">
//         <Link legacyBehavior href="/mypage">
//             <a className="inline-flex items-center px-3 py-1 mt-4 text-white bg-yellow-400 border-0 rounded-xl focus:outline-none hover:bg-yellow-200 hover:text-black hover: md:mt-0">
//                 카카오 계정으로 로그인 하기
//             </a>
//         </Link>
//     </div>
// </nav>

export default Login;
